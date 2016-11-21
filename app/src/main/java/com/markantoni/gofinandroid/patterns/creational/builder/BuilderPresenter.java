package com.markantoni.gofinandroid.patterns.creational.builder;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/16/16.
 */

public class BuilderPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new BuilderModel();
    }

    @Override
    public void patternUsage() {
        BuilderExample.House houseWithoutToilet = new BuilderExample.House.Builder()
                .buildBedroom()
                .buildDiningRoom()
                .build();

        if (houseWithoutToilet.hasToilet()) {
            //it won't happen house doesn't have any
        }

        BuilderExample.House.Builder builder = new BuilderExample.House.Builder();
        builder.buildDiningRoom();
        builder.buildToilet();
        builder.buildBedroom();

        BuilderExample.House fullHouse = builder.build();
        //full house has all of the things

        BuilderExample.House nullHouse = builder.build();
        if (nullHouse == null) {
            //this house is null, as builder in this case builds only one object
        }
    }
}
