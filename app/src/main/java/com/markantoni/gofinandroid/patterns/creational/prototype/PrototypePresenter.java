package com.markantoni.gofinandroid.patterns.creational.prototype;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/17/16.
 */

public class PrototypePresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new PrototypeModel();
    }

    @Override
    public void patternUsage() {
        PrototypeExample.Prototype prototype = new PrototypeExample.Prototype(5);
        PrototypeExample.Prototype clone = (PrototypeExample.Prototype) prototype.clone();

        //clone has all the same field values as parent
    }
}
