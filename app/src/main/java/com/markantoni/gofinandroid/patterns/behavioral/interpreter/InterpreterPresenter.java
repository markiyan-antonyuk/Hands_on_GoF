package com.markantoni.gofinandroid.patterns.behavioral.interpreter;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class InterpreterPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new InterpreterModel();
    }

    @Override
    public void patternUsage() {
        InterpreterExample.Interpreter interpreter = new InterpreterExample.Interpreter();
        interpreter.interpret("print Printing something");
        interpreter.interpret("2 + 2");
        interpreter.interpret("2 - 2");
        interpreter.interpret("this will cause error");
        interpreter.interpret("this + zero"); //will be zero
    }
}
