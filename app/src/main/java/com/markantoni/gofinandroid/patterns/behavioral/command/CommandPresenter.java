package com.markantoni.gofinandroid.patterns.behavioral.command;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class CommandPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new CommandModel();
    }

    @Override
    public void patternUsage() {
        CommandExample.CommandExecutor commandExecutor = new CommandExample.CommandExecutor(new CommandExample.Command() {
            @Override
            public void doSomething() {
                //command does something
            }
        });

        //execute command
        commandExecutor.execute();
    }
}
