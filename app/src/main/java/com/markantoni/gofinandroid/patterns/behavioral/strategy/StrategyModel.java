package com.markantoni.gofinandroid.patterns.behavioral.strategy;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class StrategyModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/strategy.gif";
    }

    @Override
    public String getDescription() {
        return "Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.";
    }

    @Override
    public String getCodeSample() {
        return "//strategy interface\n" +
                "interface MathOperation {\n" +
                "    int performOperation(int a, int b);\n" +
                "}\n" +
                "\n" +
                "public static class AddOperation implements MathOperation {\n" +
                "    @Override\n" +
                "    public int performOperation(int a, int b) {\n" +
                "        return a + b;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class SubtractOperation implements MathOperation {\n" +
                "    @Override\n" +
                "    public int performOperation(int a, int b) {\n" +
                "        return a - b;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class MathContext {\n" +
                "    private MathOperation mOperation;\n" +
                "\n" +
                "    public MathContext(MathOperation operation) {\n" +
                "        mOperation = operation;\n" +
                "    }\n" +
                "\n" +
                "    public int getResult(int a, int b) {\n" +
                "        return mOperation.performOperation(a, b);\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.strategy;
    }
}
