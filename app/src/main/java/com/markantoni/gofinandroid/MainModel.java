package com.markantoni.gofinandroid;

import android.content.Context;

import com.markantoni.gofinandroid.interfaces.IMainModel;
import com.markantoni.gofinandroid.interfaces.IPatternPresenter;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import dalvik.system.DexFile;

/**
 * Created by mark on 11/16/16.
 */

public class MainModel implements IMainModel {
    private List<IPatternPresenter> mPatterns = new ArrayList<>();

    public MainModel(Context context) {
        //loads all subclasses of PatternPresenter and add instances to list
        try {
            DexFile dexFile = new DexFile(context.getPackageCodePath());
            Enumeration<String> entries = dexFile.entries();

            while (entries.hasMoreElements()) { //list all classes
                String entry = entries.nextElement();

                //class is from app package
                if (entry.startsWith(context.getPackageName())) {
                    Class clazz = Class.forName(entry);

                    //checks if class is instance of PatterPresenter
                    if (PatternPresenter.class.isAssignableFrom(clazz) && !clazz.equals(PatternPresenter.class)) {
                        //creates instance of presenter and adds to list
                        mPatterns.add(((IPatternPresenter) clazz.newInstance()));
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    @Override
    public List<IPatternPresenter> getAllPatterns() {
        return mPatterns;
    }
}
