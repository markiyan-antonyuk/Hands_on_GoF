package com.markantoni.gofinandroid.patterns.creational.prototype;

public class PrototypeExample {
    public static class Prototype implements Cloneable {
        private int mSomeInt;

        public Prototype(int someInt) {
            mSomeInt = someInt;
        }

        @Override
        protected Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
