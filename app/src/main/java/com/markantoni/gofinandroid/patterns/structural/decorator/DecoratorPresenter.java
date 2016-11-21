package com.markantoni.gofinandroid.patterns.structural.decorator;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class DecoratorPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new DecoratorModel();
    }

    @Override
    public void patternUsage() {
        DecoratorExample.Car car = new DecoratorExample.Car() {
            @Override
            public int getMaxSpeed() {
                return 5;
            }
        };

        car.getMaxSpeed(); //max speed is 5

        DecoratorExample.Nitro nitro = new DecoratorExample.Nitro(car);

        nitro.getMaxSpeed(); //decorated max speed is 5 * 2 = 10
    }
}
