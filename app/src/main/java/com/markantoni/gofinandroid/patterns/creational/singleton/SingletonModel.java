package com.markantoni.gofinandroid.patterns.creational.singleton;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/16/16.
 */

public class SingletonModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/singleton.gif";
    }

    @Override
    public String getCodeSample() {
        return "public class SingletonExample {\n" +
                "    private static SingletonExample sInstance;\n" +
                "\n" +
                "    private SingletonExample() {\n" +
                "    }\n" +
                "\n" +
                "    //lazy initialization\n" +
                "    public static SingletonExample getInstance() {\n" +
                "        if (sInstance == null) {\n" +
                "            sInstance = new SingletonExample();\n" +
                "        }\n" +
                "        return sInstance;\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public String getDescription() {
        return "A class of which only a single instance can exist";
    }

    @Override
    public int getTitleRes() {
        return R.string.singleton;
    }
}
