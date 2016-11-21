package com.markantoni.gofinandroid.patterns.structural.facade;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class FacadeModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/facade.gif";
    }

    @Override
    public String getDescription() {
        return "Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.";
    }

    @Override
    public String getCodeSample() {
        return "public static class OS {\n" +
                "    void startOS() {\n" +
                "        //start the OS\n" +
                "    }\n" +
                "\n" +
                "    void shutdownOS() {\n" +
                "        //shutdown OS\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Game {\n" +
                "    void play() {\n" +
                "        //play game\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Mouse {\n" +
                "    void click() {\n" +
                "        //click the mouse\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Computer {\n" +
                "    private OS mOS = new OS();\n" +
                "    private Game mGame = new Game();\n" +
                "    private Mouse mMouse = new Mouse();\n" +
                "\n" +
                "    public void boot() {\n" +
                "        mOS.startOS();\n" +
                "    }\n" +
                "\n" +
                "    public void shutdown() {\n" +
                "        mOS.shutdownOS();\n" +
                "    }\n" +
                "\n" +
                "    public void playGame() {\n" +
                "        mGame.play();\n" +
                "    }\n" +
                "\n" +
                "    public void clickMouse() {\n" +
                "        mMouse.click();\n" +
                "    }\n" +
                "\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.facade;
    }
}
