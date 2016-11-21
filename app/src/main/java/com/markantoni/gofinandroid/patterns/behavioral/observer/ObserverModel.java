package com.markantoni.gofinandroid.patterns.behavioral.observer;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class ObserverModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/observer.gif";
    }

    @Override
    public String getDescription() {
        return "Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.";
    }

    @Override
    public String getCodeSample() {
        return "public static class Counter {\n" +
                "    private List<CounterObserver> mObservers = new ArrayList<>();\n" +
                "\n" +
                "    public void registerObserver(CounterObserver observer) {\n" +
                "        mObservers.add(observer);\n" +
                "    }\n" +
                "\n" +
                "    public void unregisterObserver(CounterObserver observer) {\n" +
                "        mObservers.remove(observer);\n" +
                "    }\n" +
                "\n" +
                "    public void start(int end) {\n" +
                "        for (int i = 0; i <= end; i++) {\n" +
                "            for (CounterObserver observer : mObservers) {\n" +
                "                if (observer.getNumber() == i) {\n" +
                "                    observer.notifyNumber();\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public abstract static class CounterObserver {\n" +
                "    private int mNumber;\n" +
                "\n" +
                "    public CounterObserver(int number) {\n" +
                "        mNumber = number;\n" +
                "    }\n" +
                "\n" +
                "    public int getNumber() {\n" +
                "        return mNumber;\n" +
                "    }\n" +
                "\n" +
                "    public abstract void notifyNumber();\n" +
                "}\n" +
                "\n" +
                "public static class HundredCounterObserver extends CounterObserver {\n" +
                "    public HundredCounterObserver() {\n" +
                "        super(100);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void notifyNumber() {\n" +
                "        //counter reached 100\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.observer;
    }
}
