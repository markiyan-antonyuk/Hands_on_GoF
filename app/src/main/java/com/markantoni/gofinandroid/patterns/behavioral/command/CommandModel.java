package com.markantoni.gofinandroid.patterns.behavioral.command;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class CommandModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/command.gif";
    }

    @Override
    public String getDescription() {
        return "Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.";
    }

    @Override
    public String getCodeSample() {
        return "public static class CommandExecutor {\n" +
                "    private Command mCommand;\n" +
                "\n" +
                "    public CommandExecutor(Command command) {\n" +
                "        mCommand = command;\n" +
                "    }\n" +
                "\n" +
                "    public void execute() {\n" +
                "        mCommand.doSomething();\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "interface Command {\n" +
                "    void doSomething();\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.command;
    }
}
