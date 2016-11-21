package com.markantoni.gofinandroid.patterns.structural.bridge;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class BridgePresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new BridgeModel();
    }

    @Override
    public void patternUsage() {
        BridgeExample.DrawingApiV1 drawingApiV1 = new BridgeExample.DrawingApiV1();
        BridgeExample.DrawingApiV2 drawingApiV2 = new BridgeExample.DrawingApiV2();

        BridgeExample.Shape shapeWith1Api = new BridgeExample.Shape(drawingApiV1);
        BridgeExample.Shape shapeWith2Api = new BridgeExample.Shape(drawingApiV2);

        //drawing with api v1
        shapeWith1Api.draw();

        //drawing with api v2
        shapeWith2Api.draw();
    }
}
