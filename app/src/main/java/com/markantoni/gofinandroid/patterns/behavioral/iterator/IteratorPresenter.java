package com.markantoni.gofinandroid.patterns.behavioral.iterator;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class IteratorPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new IteratorModel();
    }

    @Override
    public void patternUsage() {
        IteratorExample.Iterator<String> iterator = new IteratorExample.Iterator<>(new String[]{"1", "2", "3"});
        iterator.first(); //move to first
        if (iterator.hasNext()) { //check if has next
            iterator.next(); //move to next
        }
    }
}
