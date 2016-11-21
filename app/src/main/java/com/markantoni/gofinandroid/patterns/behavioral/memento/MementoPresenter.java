package com.markantoni.gofinandroid.patterns.behavioral.memento;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class MementoPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new MementoModel();
    }

    @Override
    public void patternUsage() {
    }
}
