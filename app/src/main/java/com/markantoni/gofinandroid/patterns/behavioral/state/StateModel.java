package com.markantoni.gofinandroid.patterns.behavioral.state;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class StateModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/state.gif";
    }

    @Override
    public String getDescription() {
        return "Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.";
    }

    @Override
    public String getCodeSample() {
        return "public static class Game {\n" +
                "    public enum State {\n" +
                "        LOADING, PLAYING, PAUSED, EXITING\n" +
                "    }\n" +
                "\n" +
                "    private State mState;\n" +
                "\n" +
                "    public Game() {\n" +
                "        setState(State.LOADING);\n" +
                "    }\n" +
                "\n" +
                "    private void setState(State state) {\n" +
                "        mState = state;\n" +
                "\n" +
                "        switch (mState) {\n" +
                "            case LOADING:\n" +
                "                load();\n" +
                "                break;\n" +
                "            case PLAYING:\n" +
                "                playingLoop();\n" +
                "                break;\n" +
                "            case PAUSED:\n" +
                "                pause();\n" +
                "                break;\n" +
                "            case EXITING:\n" +
                "                exit();\n" +
                "                break;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void load() {\n" +
                "        //load resources and start to play\n" +
                "        setState(State.PLAYING);\n" +
                "    }\n" +
                "\n" +
                "    private void playingLoop() {\n" +
                "        //while loop\n" +
                "\n" +
                "        //if pause clicked\n" +
                "        setState(State.PAUSED);\n" +
                "    }\n" +
                "\n" +
                "    private void pause() {\n" +
                "        //save game, wait for user to decide next action\n" +
                "\n" +
                "        //if user resumes\n" +
                "        setState(State.PLAYING);\n" +
                "\n" +
                "        //if user exits game\n" +
                "        setState(State.EXITING);\n" +
                "    }\n" +
                "\n" +
                "    private void exit() {\n" +
                "        //dismiss all resources and quit game\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.state;
    }
}
