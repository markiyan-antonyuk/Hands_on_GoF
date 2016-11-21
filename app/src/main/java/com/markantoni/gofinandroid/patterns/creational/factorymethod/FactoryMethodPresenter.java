package com.markantoni.gofinandroid.patterns.creational.factorymethod;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/17/16.
 */

public class FactoryMethodPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new FactoryMethodModel();
    }

    @Override
    public void patternUsage() {
        FactoryMethodExample.ShapeFactory shapeFactory = new FactoryMethodExample.CircleFactory();
        FactoryMethodExample.Shape circle = shapeFactory.createShape();

        if (circle.getName().equals("Circle")) {
            //yeay it's circle
        }

        shapeFactory = new FactoryMethodExample.RectangleFactory();
        FactoryMethodExample.Shape rectangle = shapeFactory.createShape();

        if (rectangle instanceof FactoryMethodExample.Rectangle) {
            //yeay it's rectangle
        }

        if (circle.getName().equals(rectangle.getName())) {
            //this won't work, they are two different objects
        }
    }
}
