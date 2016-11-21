package com.markantoni.gofinandroid.patterns.structural.adapter;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class AdapterPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new AdapterModel();
    }

    @Override
    public void patternUsage() {
        AdapterExample.Motorcycle motorcycle = new AdapterExample.Motorcycle();
        motorcycle.ride();
        //but can't pack anything

        AdapterExample.Car car = new AdapterExample.Car();
        car.packSomeStuff();
        car.ride();

        AdapterExample.FourWheelsVehicleAdapter adapter = new AdapterExample.FourWheelsVehicleAdapter(motorcycle);
        adapter.ride(); //now motorcycle will ride
        adapter.packSomeStuff(); //and can pack some stuff
    }
}
