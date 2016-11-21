package com.markantoni.gofinandroid.patterns.behavioral.interpreter;

public class InterpreterExample {
    public static class Interpreter {
        private static final String OUTPUT = "print ";
        private static final String PLUS = "+";
        private static final String MINUS = "-";

        public void interpret(String command) {
            if (command.startsWith(command)) {
                outputOperation(command);
            } else if (command.contains(PLUS) || command.contains(MINUS)) {
                if (!mathOperation(command)) {
                    throwError();
                }
            } else {
                throwError();
            }
        }

        private boolean mathOperation(String command) {
            //splits operands
            String[] args = command.split(" ");
            //checks if there is only 3 operands and second is + or -
            if (args.length > 3 || !args[1].equals(PLUS) || !args[1].equals(MINUS)) {
                return false;
            }
            int arg1 = Integer.parseInt(args[0]);
            int arg2 = Integer.parseInt(args[2]);

            //performs math operation
            System.out.println(arg1 + (args[1].equals(PLUS) ? arg2 : -arg2));

            return true;
        }

        private void outputOperation(String command) {
            //output value which is written after key word
            System.out.println(command.replace(OUTPUT, ""));
        }

        private void throwError() {
            throw new RuntimeException("Can't interpret that command");
        }
    }
}
