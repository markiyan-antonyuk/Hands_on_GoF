package com.markantoni.gofinandroid.patterns.behavioral.templatemethod;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class TemplateMethodPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new TemplateMethodModel();
    }

    @Override
    public void patternUsage() {
        TemplateMethodExample.NumbersStore numbersStore = new TemplateMethodExample.NumbersStore();

        numbersStore.buy("2"); //it will check if there is "2" in store and sell it
        numbersStore.buy("4"); //it won't find "4", and will propose "1"
    }
}
