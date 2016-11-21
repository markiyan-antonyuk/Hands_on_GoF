package com.markantoni.gofinandroid.patterns.structural.composite;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class CompositeModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/composite.gif";
    }

    @Override
    public String getDescription() {
        return "Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.";
    }

    @Override
    public String getCodeSample() {
        return "interface Data {\n" +
                "    void open();\n" +
                "}\n" +
                "\n" +
                "public static class File implements Data {\n" +
                "    @Override\n" +
                "    public void open() {\n" +
                "        //open a file\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Folder implements Data {\n" +
                "    @Override\n" +
                "    public void open() {\n" +
                "        //open folder\n" +
                "    }\n" +
                "\n" +
                "    Data listData() {\n" +
                "        //lists all elements in folder\n" +
                "        return null;\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.composite;
    }
}
