package com.markantoni.gofinandroid.patterns.structural.facade;

public class FacadeExample {
    public static class OS {
        void startOS() {
            //start the OS
        }

        void shutdownOS() {
            //shutdown OS
        }
    }

    public static class Game {
        void play() {
            //play game
        }
    }

    public static class Mouse {
        void click() {
            //click the mouse
        }
    }

    public static class Computer {
        private OS mOS = new OS();
        private Game mGame = new Game();
        private Mouse mMouse = new Mouse();

        public void boot() {
            mOS.startOS();
        }

        public void shutdown() {
            mOS.shutdownOS();
        }

        public void playGame() {
            mGame.play();
        }

        public void clickMouse() {
            mMouse.click();
        }
    }
}
