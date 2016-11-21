package com.markantoni.gofinandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.markantoni.gofinandroid.interfaces.IPatternPresenter;
import com.markantoni.gofinandroid.interfaces.IPatternView;
import com.markantoni.gofinandroid.patterns.PatternFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mark on 11/16/16.
 */

public class PatternsPagerAdapter extends FragmentPagerAdapter {
    private List<IPatternView> mFragments = new ArrayList<>();
    private List<IPatternPresenter> mPatterns;

    public PatternsPagerAdapter(FragmentManager fm, List<IPatternPresenter> patterns) {
        super(fm);
        mPatterns = patterns;
        for (IPatternPresenter patternPresenter : mPatterns) {
            mFragments.add(PatternFragment.createWithPresenter(patternPresenter));
        }
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return mPatterns.size();
    }

    public int findPosition(String pattern) {
        pattern = pattern.toLowerCase();

        for (int i = 0; i < mPatterns.size(); i++) {
            if (mPatterns.get(i).getClass().getSimpleName().toLowerCase().contains(pattern)) {
                return i;
            }
        }
        return 0;
    }
}
