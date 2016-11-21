package com.markantoni.gofinandroid.patterns.structural.flyweight;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class FlyweightModel implements IPatternModel {

    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/flyweight.gif";
    }

    @Override
    public String getDescription() {
        return "Use sharing to support large numbers of fine-grained objects efficiently";
    }

    @Override
    public String getCodeSample() {
        return "public static class FlyweightObject {\n" +
                "    private int mValue;\n" +
                "\n" +
                "    private FlyweightObject(int value) {\n" +
                "        mValue = value;\n" +
                "    }\n" +
                "\n" +
                "    public int getValue() {\n" +
                "        return mValue;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class FlyweightObjectsFactory {\n" +
                "    private Map<Integer, FlyweightObject> mMap = new TreeMap<>();\n" +
                "\n" +
                "    FlyweightObject create(int value) {\n" +
                "        //checks whether needed element exists already, if yes, returns it\n" +
                "        if (!mMap.containsKey(value)) {\n" +
                "            FlyweightObject object = new FlyweightObject(value);\n" +
                "            mMap.put(value, object);\n" +
                "            return object;\n" +
                "        }\n" +
                "        return mMap.get(value);\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.flyweight;
    }
}
