package com.markantoni.gofinandroid.patterns.structural.facade;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/18/16.
 */

public class FacadePresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new FacadeModel();
    }

    @Override
    public void patternUsage() {
        FacadeExample.Computer computer = new FacadeExample.Computer();
        computer.boot();
        computer.playGame();
        computer.clickMouse();
        computer.shutdown();

        //we did all these operations, without knowing about any of OS, Game or Mouse classes
    }
}
