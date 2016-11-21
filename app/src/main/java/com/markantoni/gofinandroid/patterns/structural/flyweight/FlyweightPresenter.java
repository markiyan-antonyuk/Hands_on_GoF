package com.markantoni.gofinandroid.patterns.structural.flyweight;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class FlyweightPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new FlyweightModel();
    }

    @Override
    public void patternUsage() {
        FlyweightExample.FlyweightObjectsFactory factory = new FlyweightExample.FlyweightObjectsFactory();
        FlyweightExample.FlyweightObject object1 = factory.create(1);
        FlyweightExample.FlyweightObject another1 = factory.create(1);

        if (object1 == another1) {
            //they equal as that's only one object
        }

        FlyweightExample.FlyweightObject object2 = factory.create(2);

        if (object1 == object2) {
            //they don't equal, object 2 is new object
        }

    }
}
