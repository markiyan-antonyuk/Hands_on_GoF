package com.markantoni.gofinandroid.patterns.behavioral.strategy;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class StrategyPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new StrategyModel();
    }

    @Override
    public void patternUsage() {
        StrategyExample.MathContext addingContext = new StrategyExample.MathContext(new StrategyExample.AddOperation());
        StrategyExample.MathContext subtractionContext = new StrategyExample.MathContext(new StrategyExample.SubtractOperation());

        addingContext.getResult(1, 2); //it will add 2 number, based on strategy used
        subtractionContext.getResult(2, 1); //if will subtract 1 from 2, base on subtraction strategy used
    }
}
