package com.markantoni.gofinandroid.patterns.behavioral.command;

public class CommandExample {
    public static class CommandExecutor {
        private Command mCommand;

        public CommandExecutor(Command command) {
            mCommand = command;
        }

        public void execute() {
            mCommand.doSomething();
        }
    }

    interface Command {
        void doSomething();
    }
}
