package com.markantoni.gofinandroid.patterns.behavioral.state;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class StatePresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new StateModel();
    }

    @Override
    public void patternUsage() {

    }
}
