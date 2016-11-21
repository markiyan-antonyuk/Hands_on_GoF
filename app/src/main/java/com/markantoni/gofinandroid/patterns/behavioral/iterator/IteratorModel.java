package com.markantoni.gofinandroid.patterns.behavioral.iterator;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class IteratorModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/iterator.gif";
    }

    @Override
    public String getDescription() {
        return "Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.";
    }

    @Override
    public String getCodeSample() {
        return "public static class Iterator<T> {\n" +
                "    private T[] mObjects;\n" +
                "    private int mCurrentIndex;\n" +
                "\n" +
                "    public Iterator(T[] objects) {\n" +
                "        mObjects = objects;\n" +
                "    }\n" +
                "\n" +
                "    private T goToIndex(int index) {\n" +
                "        mCurrentIndex = index;\n" +
                "        return mObjects[mCurrentIndex];\n" +
                "    }\n" +
                "\n" +
                "    public T first() {\n" +
                "        return goToIndex(0);\n" +
                "    }\n" +
                "\n" +
                "    public boolean hasNext() {\n" +
                "        return mCurrentIndex < mObjects.length - 1;\n" +
                "    }\n" +
                "\n" +
                "    public T next() {\n" +
                "        return goToIndex(mCurrentIndex + 1);\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.iterator;
    }
}
