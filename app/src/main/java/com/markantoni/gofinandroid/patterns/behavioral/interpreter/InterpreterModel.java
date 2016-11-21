package com.markantoni.gofinandroid.patterns.behavioral.interpreter;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class InterpreterModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/interpreter.gif";
    }

    @Override
    public String getDescription() {
        return "Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.";
    }

    @Override
    public String getCodeSample() {
        return "public static class Interpreter {\n" +
                "    private static final String OUTPUT = \"print \";\n" +
                "    private static final String PLUS = \"+\";\n" +
                "    private static final String MINUS = \"-\";\n" +
                "\n" +
                "    public void interpret(String command) {\n" +
                "        if (command.startsWith(command)) {\n" +
                "            outputOperation(command);\n" +
                "        } else if (command.contains(PLUS) || command.contains(MINUS)) {\n" +
                "            if (!mathOperation(command)) {\n" +
                "                throwError();\n" +
                "            }\n" +
                "        } else {\n" +
                "            throwError();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private boolean mathOperation(String command) {\n" +
                "        //splits operands\n" +
                "        String[] args = command.split(\" \");\n" +
                "        //checks if there is only 3 operands and second is + or -\n" +
                "        if (args.length > 3 || !args[1].equals(PLUS) || !args[1].equals(MINUS)) {\n" +
                "            return false;\n" +
                "        }\n" +
                "        int arg1 = Integer.parseInt(args[0]);\n" +
                "        int arg2 = Integer.parseInt(args[2]);\n" +
                "\n" +
                "        //performs math operation\n" +
                "        System.out.println(arg1 + (args[1].equals(PLUS) ? arg2 : -arg2));\n" +
                "\n" +
                "        return true;\n" +
                "    }\n" +
                "\n" +
                "    private void outputOperation(String command) {\n" +
                "        //output value which is written after key word\n" +
                "        System.out.println(command.replace(OUTPUT, \"\"));\n" +
                "    }\n" +
                "\n" +
                "    private void throwError() {\n" +
                "        throw new RuntimeException(\"Can't interpret that command\");\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.interpreter;
    }
}
