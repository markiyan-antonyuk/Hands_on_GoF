package com.markantoni.gofinandroid.patterns.behavioral.chainofresponsibility;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class ChainOfResponsibilityPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new ChainOfResponsibilityModel();
    }

    @Override
    public void patternUsage() {
        ChainOfResponsibilityExample.Filter first = new ChainOfResponsibilityExample.FirstFilter();
        ChainOfResponsibilityExample.Filter second = new ChainOfResponsibilityExample.SecondFilter();
        ChainOfResponsibilityExample.Filter third = new ChainOfResponsibilityExample.ThirdFilter();

        first.setNextFilter(second);
        second.setNextFilter(third);

        //filtering through 1 -> 2 -> 3
        first.filter();

        first.setNextFilter(third);
        third.setNextFilter(second);
        second.setNextFilter(null);

        //filtering through 1 -> 3 -> 2
        first.filter();

        first.setNextFilter(third);
        third.setNextFilter(first);

        //filtering through 1 -> 3
        first.filter();

        //filtering though 2 only
        second.filter();
    }
}
