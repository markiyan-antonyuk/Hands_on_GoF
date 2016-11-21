package com.markantoni.gofinandroid.patterns.structural.decorator;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class DecoratorModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/decorator.gif";
    }

    @Override
    public String getDescription() {
        return "Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.";
    }

    @Override
    public String getCodeSample() {
        return "interface Car {\n" +
                "    int getMaxSpeed();\n" +
                "}\n" +
                "\n" +
                "//car decorator with nitro which increases speed\n" +
                "public static class Nitro implements Car {\n" +
                "    private final int SPEED_MULTIPLIER = 2;\n" +
                "    private Car mCar;\n" +
                "\n" +
                "    public Nitro(Car car) {\n" +
                "        mCar = car;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public int getMaxSpeed() {\n" +
                "        return mCar.getMaxSpeed() * SPEED_MULTIPLIER;\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.decorator;
    }
}
