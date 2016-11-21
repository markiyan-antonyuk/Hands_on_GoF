package com.markantoni.gofinandroid.patterns.creational.abstractfactory;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/16/16.
 */

public class AbstractFactoryModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/abstract.gif";
    }

    @Override
    public String getDescription() {
        return "Provide an interface for creating families of related or dependent objects without specifying their concrete classes.";
    }

    @Override
    public String getCodeSample() {
        return "public static abstract class VehicleFactory {\n" +
                "    public Vehicle create() {\n" +
                "        Vehicle vehicle = new Vehicle();\n" +
                "        setWeight(vehicle);\n" +
                "        setWheels(vehicle);\n" +
                "        setType(vehicle);\n" +
                "        return vehicle;\n" +
                "    }\n" +
                "\n" +
                "    protected abstract void setWheels(Vehicle vehicle);\n" +
                "\n" +
                "    protected abstract void setType(Vehicle vehicle);\n" +
                "\n" +
                "    protected abstract void setWeight(Vehicle vehicle);\n" +
                "}\n" +
                "\n" +
                "public static class CarFactory extends VehicleFactory {\n" +
                "    @Override\n" +
                "    protected void setWheels(Vehicle vehicle) {\n" +
                "        vehicle.setWheels(4);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void setType(Vehicle vehicle) {\n" +
                "        vehicle.setType(\"Car\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void setWeight(Vehicle vehicle) {\n" +
                "        vehicle.setWeight(1500);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class MotorcycleFactory extends VehicleFactory {\n" +
                "    @Override\n" +
                "    protected void setWheels(Vehicle vehicle) {\n" +
                "        vehicle.setWheels(2);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void setType(Vehicle vehicle) {\n" +
                "        vehicle.setType(\"Motorcycle\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void setWeight(Vehicle vehicle) {\n" +
                "        vehicle.setWeight(200);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Vehicle {\n" +
                "    private int mWheels;\n" +
                "    private String mType;\n" +
                "    private int mWeight;\n" +
                "\n" +
                "    public Vehicle() {\n" +
                "    }\n" +
                "\n" +
                "    public void setWheels(int wheels) {\n" +
                "        mWheels = wheels;\n" +
                "    }\n" +
                "\n" +
                "    public void setType(String type) {\n" +
                "        mType = type;\n" +
                "    }\n" +
                "\n" +
                "    public void setWeight(int weight) {\n" +
                "        mWeight = weight;\n" +
                "    }\n" +
                "\n" +
                "    public int getWheels() {\n" +
                "        return mWheels;\n" +
                "    }\n" +
                "\n" +
                "    public int getWeight() {\n" +
                "        return mWeight;\n" +
                "    }\n" +
                "\n" +
                "    public String getType() {\n" +
                "        return mType;\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.abstract_factory;
    }
}
