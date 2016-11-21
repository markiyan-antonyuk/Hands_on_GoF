package com.markantoni.gofinandroid.patterns.structural.composite;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class CompositePresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new CompositeModel();
    }

    @Override
    public void patternUsage() {

    }
}
