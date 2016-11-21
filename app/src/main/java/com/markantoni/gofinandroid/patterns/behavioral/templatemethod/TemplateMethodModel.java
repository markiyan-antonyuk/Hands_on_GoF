package com.markantoni.gofinandroid.patterns.behavioral.templatemethod;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class TemplateMethodModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/template.gif";
    }

    @Override
    public String getDescription() {
        return "Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's.";
    }

    @Override
    public String getCodeSample() {
        return "public static abstract class Store<T> {\n" +
                "    public final T buy(String what) {\n" +
                "        if (isAvailableInStore(what)) {\n" +
                "            return findInStorage(what);\n" +
                "        }\n" +
                "        return proposeAnother();\n" +
                "    }\n" +
                "\n" +
                "    protected abstract boolean isAvailableInStore(String what);\n" +
                "\n" +
                "    protected abstract T findInStorage(String what);\n" +
                "\n" +
                "    protected abstract T proposeAnother();\n" +
                "}\n" +
                "\n" +
                "public static class NumbersStore extends Store<Integer> {\n" +
                "    private Map<String, Integer> mStorage = new TreeMap<>();\n" +
                "\n" +
                "    public NumbersStore() {\n" +
                "        mStorage.put(\"1\", 1);\n" +
                "        mStorage.put(\"2\", 2);\n" +
                "        mStorage.put(\"3\", 3);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected boolean isAvailableInStore(String what) {\n" +
                "        return mStorage.containsKey(what);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected Integer findInStorage(String what) {\n" +
                "        return mStorage.get(what);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected Integer proposeAnother() {\n" +
                "        return mStorage.get(\"1\");\n" +
                "    }\n" +
                "}";
    }

    @Override
    public int getTitleRes() {
        return R.string.template_method;
    }
}
