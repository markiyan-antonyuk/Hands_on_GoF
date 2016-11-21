package com.markantoni.gofinandroid.patterns.structural.proxy;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class ProxyPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new ProxyModel();
    }

    @Override
    public void patternUsage() {
        ProxyExample.Api api = new ProxyExample.ProxyApi();

        //it will perform hidden api action
        api.performAction();
    }
}
