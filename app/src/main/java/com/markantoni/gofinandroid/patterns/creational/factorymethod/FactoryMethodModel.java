package com.markantoni.gofinandroid.patterns.creational.factorymethod;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/17/16.
 */

public class FactoryMethodModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/factory.gif";
    }

    @Override
    public String getDescription() {
        return "Creates an instance of several derived classes";
    }

    @Override
    public String getCodeSample() {
        return  "public interface ShapeFactory {\n" +
                "    Shape createShape();\n" +
                "}\n" +
                "\n" +
                "//factory for creating shape objects\n" +
                "public static class CircleFactory implements ShapeFactory {\n" +
                "    @Override\n" +
                "    public Shape createShape() {\n" +
                "        return new Circle();\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "//factory for creating rectangle object\n" +
                "public static class RectangleFactory implements ShapeFactory {\n" +
                "    @Override\n" +
                "    public Shape createShape() {\n" +
                "        return new Rectangle();\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "//abstract object\n" +
                "public interface Shape {\n" +
                "    void draw();\n" +
                "\n" +
                "    String getName();\n" +
                "}\n" +
                "\n" +
                "public static class Circle implements Shape {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        //draws shape\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String getName() {\n" +
                "        return \"Circle\";\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Rectangle implements Shape {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        //draws rectangle\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String getName() {\n" +
                "        return \"Rectangle\";\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.factory_method;
    }
}
