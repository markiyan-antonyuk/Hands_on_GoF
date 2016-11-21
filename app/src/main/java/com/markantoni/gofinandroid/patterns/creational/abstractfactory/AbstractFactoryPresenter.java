package com.markantoni.gofinandroid.patterns.creational.abstractfactory;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/16/16.
 */

public class AbstractFactoryPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new AbstractFactoryModel();
    }

    @Override
    public void patternUsage() {
        AbstractFactoryExample.Vehicle car = new AbstractFactoryExample.CarFactory().create();
        //car is a car created at car factory

        AbstractFactoryExample.Vehicle motorcycle = new AbstractFactoryExample.MotorcycleFactory().create();
        //motorcycle is create at motorcycle factory

        AbstractFactoryExample.Vehicle bicycle = new AbstractFactoryExample.Vehicle();
        bicycle.setWheels(2);
        bicycle.setWeight(15);
        bicycle.setType("Bicycle");

        //bicycle can be created by your own
    }
}
