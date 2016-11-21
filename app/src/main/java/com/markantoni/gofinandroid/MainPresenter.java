package com.markantoni.gofinandroid;

import android.content.Context;

import com.markantoni.gofinandroid.interfaces.IMainModel;
import com.markantoni.gofinandroid.interfaces.IMainPresenter;
import com.markantoni.gofinandroid.interfaces.IMainView;
import com.markantoni.gofinandroid.interfaces.IPatternPresenter;

import java.util.List;

/**
 * Created by mark on 11/16/16.
 */

public class MainPresenter implements IMainPresenter {
    private IMainModel mMainModel;
    private IMainView mMainView;

    private List<IPatternPresenter> mPatterns;

    public MainPresenter(Context context) {
        mMainModel = new MainModel(context);
        mPatterns = mMainModel.getAllPatterns();
    }

    @Override
    public void onPatternSelected(Class<? extends IPatternPresenter> type) {
        if (mMainView != null) {
            IPatternPresenter patternPresenter = findPattern(type);
            if (patternPresenter != null) {
                mMainView.showPattern(patternPresenter);
            }
        }
    }

    private IPatternPresenter findPattern(Class<? extends IPatternPresenter> type) {
        int i = 0;
        for (IPatternPresenter patternPresenter : mPatterns) {
            if (patternPresenter.getClass().equals(type)) {
                return patternPresenter;
            }
            i++;
        }
        return null;
    }

    @Override
    public void onBindView(IMainView view) {
        mMainView = view;
        mMainView.setPatternsList(mPatterns);
    }

    @Override
    public void onUnbindView() {
        mMainView = null;
    }
}
