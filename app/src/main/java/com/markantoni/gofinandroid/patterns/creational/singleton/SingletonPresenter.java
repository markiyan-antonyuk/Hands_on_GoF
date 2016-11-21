package com.markantoni.gofinandroid.patterns.creational.singleton;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/16/16.
 */

public class SingletonPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new SingletonModel();
    }

    @Override
    public void patternUsage() {
        SingletonExample.getInstance().doSomething();
    }
}
