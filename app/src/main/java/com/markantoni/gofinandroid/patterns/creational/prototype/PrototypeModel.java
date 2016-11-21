package com.markantoni.gofinandroid.patterns.creational.prototype;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/17/16.
 */

public class PrototypeModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/prototype.gif";
    }

    @Override
    public String getDescription() {
        return "A fully initialized instance to be copied or cloned";
    }

    @Override
    public String getCodeSample() {
        return "public static class Prototype implements Cloneable {\n" +
                "    private int mSomeInt;\n" +
                "\n" +
                "    public Prototype(int someInt) {\n" +
                "        mSomeInt = someInt;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected Object clone() {\n" +
                "        try {\n" +
                "            return super.clone();\n" +
                "        } catch (CloneNotSupportedException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "        return null;\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.prototype;
    }
}
