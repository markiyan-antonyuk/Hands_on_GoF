package com.markantoni.gofinandroid.patterns.behavioral.state;

public class StateExample {
    public static class Game {
        public enum State {
            LOADING, PLAYING, PAUSED, EXITING
        }

        private State mState;

        public Game() {
            setState(State.LOADING);
        }

        private void setState(State state) {
            mState = state;

            switch (mState) {
                case LOADING:
                    load();
                    break;
                case PLAYING:
                    playingLoop();
                    break;
                case PAUSED:
                    pause();
                    break;
                case EXITING:
                    exit();
                    break;
            }
        }

        private void load() {
            //load resources and start to play
            setState(State.PLAYING);
        }

        private void playingLoop() {
            //while loop

            //if pause clicked
            setState(State.PAUSED);
        }

        private void pause() {
            //save game, wait for user to decide next action

            //if user resumes
            setState(State.PLAYING);

            //if user exits game
            setState(State.EXITING);
        }

        private void exit() {
            //dismiss all resources and quit game
        }
    }
}
