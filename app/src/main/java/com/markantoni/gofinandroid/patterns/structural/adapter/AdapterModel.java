package com.markantoni.gofinandroid.patterns.structural.adapter;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class AdapterModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/adapter.gif";
    }

    @Override
    public String getDescription() {
        return "Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.";
    }

    @Override
    public String getCodeSample() {
        return "interface TwoWheelsVehicle {\n" +
                "    void ride();\n" +
                "}\n" +
                "\n" +
                "interface FourWheelVehicle {\n" +
                "    void ride();\n" +
                "\n" +
                "    void packSomeStuff();\n" +
                "}\n" +
                "\n" +
                "public static class FourWheelsVehicleAdapter implements FourWheelVehicle {\n" +
                "    private TwoWheelsVehicle mVehicle;\n" +
                "\n" +
                "    public FourWheelsVehicleAdapter(TwoWheelsVehicle twoWheelsVehicle) {\n" +
                "        mVehicle = twoWheelsVehicle;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void ride() {\n" +
                "        mVehicle.ride();\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void packSomeStuff() {\n" +
                "        //pack stuff here\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Motorcycle implements TwoWheelsVehicle {\n" +
                "    @Override\n" +
                "    public void ride() {\n" +
                "        //ride it\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Car implements FourWheelVehicle {\n" +
                "    @Override\n" +
                "    public void ride() {\n" +
                "        //ride it\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void packSomeStuff() {\n" +
                "        //pack some stuff\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.adapter;
    }
}
