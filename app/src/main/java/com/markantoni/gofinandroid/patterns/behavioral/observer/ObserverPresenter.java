package com.markantoni.gofinandroid.patterns.behavioral.observer;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class ObserverPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new ObserverModel();
    }

    @Override
    public void patternUsage() {
        ObserverExample.Counter counter = new ObserverExample.Counter();
        ObserverExample.CounterObserver hundredObserver = new ObserverExample.HundredCounterObserver();
        ObserverExample.CounterObserver counterObserver = new ObserverExample.CounterObserver(5) {
            @Override
            public void notifyNumber() {
                //counter reached 5
            }
        };

        counter.registerObserver(hundredObserver);
        counter.registerObserver(counterObserver);
        counter.start(100);
        //when counter reaches 5 it will notify counter observer
        //when counter reaches 100 it will notify hundred counter observer
    }
}
