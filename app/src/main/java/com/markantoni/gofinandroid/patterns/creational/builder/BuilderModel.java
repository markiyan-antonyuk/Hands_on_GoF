package com.markantoni.gofinandroid.patterns.creational.builder;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/16/16.
 */

public class BuilderModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/builder.gif";
    }

    @Override
    public String getDescription() {
        return "Separate the construction of a complex object from its representation so that the same construction process can create different representations.";
    }

    @Override
    public String getCodeSample() {
        return "public static class House {\n" +
                "\n" +
                "    private boolean mHasToilet = false;\n" +
                "    private boolean mHasDiningRoom = false;\n" +
                "    private boolean mHasBedroom = false;\n" +
                "\n" +
                "    //it's private to disable create instances without builder\n" +
                "    private House() {\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    public boolean hasDiningRoom() {\n" +
                "        return mHasDiningRoom;\n" +
                "    }\n" +
                "\n" +
                "    public boolean hasToilet() {\n" +
                "        return mHasToilet;\n" +
                "    }\n" +
                "\n" +
                "    public boolean hasBedroom() {\n" +
                "        return mHasBedroom;\n" +
                "    }\n" +
                "\n" +
                "    public static class Builder {\n" +
                "        private House mHouse;\n" +
                "\n" +
                "        public Builder() {\n" +
                "            mHouse = new House();\n" +
                "        }\n" +
                "\n" +
                "        public Builder buildToilet() {\n" +
                "            mHouse.mHasToilet = true;\n" +
                "            return this;\n" +
                "        }\n" +
                "\n" +
                "        public Builder buildDiningRoom() {\n" +
                "            mHouse.mHasDiningRoom = true;\n" +
                "            return this;\n" +
                "        }\n" +
                "\n" +
                "        public Builder buildBedroom() {\n" +
                "            mHouse.mHasBedroom = true;\n" +
                "            return this;\n" +
                "        }\n" +
                "\n" +
                "        //in this case builder won't be reusable\n" +
                "        public House build() {\n" +
                "            House house = mHouse;\n" +
                "            mHouse = null;\n" +
                "            return house;\n" +
                "        }\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.builder;
    }
}
