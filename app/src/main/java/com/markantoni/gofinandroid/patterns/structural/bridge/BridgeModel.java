package com.markantoni.gofinandroid.patterns.structural.bridge;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class BridgeModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/bridge.gif";
    }

    @Override
    public String getDescription() {
        return "Decouple an abstraction from its implementation so that the two can vary independently.";
    }

    @Override
    public String getCodeSample() {
        return "interface DrawingAPI {\n" +
                "    void draw();\n" +
                "}\n" +
                "\n" +
                "public static class DrawingApiV1 implements DrawingAPI {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        //drawing using v1 api\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class DrawingApiV2 implements DrawingAPI {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        //drawing using v2 api\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Shape {\n" +
                "    private DrawingAPI mDrawingAPI;\n" +
                "\n" +
                "    public Shape(DrawingAPI drawingAPI) {\n" +
                "        mDrawingAPI = drawingAPI;\n" +
                "    }\n" +
                "\n" +
                "    void draw() {\n" +
                "        mDrawingAPI.draw();\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.bridge;
    }
}
