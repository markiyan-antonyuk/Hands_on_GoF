package com.markantoni.gofinandroid.patterns.structural.composite;

public class CompositeExample {
    interface Data {
        void open();
    }

    public static class File implements Data {
        @Override
        public void open() {
            //open a file
        }
    }

    public static class Folder implements Data {
        @Override
        public void open() {
            //open folder
        }

        Data listData() {
            //lists all elements in folder
            return null;
        }
    }
}
