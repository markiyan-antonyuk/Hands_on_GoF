package com.markantoni.gofinandroid.patterns.behavioral.iterator;

public class IteratorExample {

    public static class Iterator<T> {
        private T[] mObjects;
        private int mCurrentIndex;

        public Iterator(T[] objects) {
            mObjects = objects;
        }

        private T goToIndex(int index) {
            mCurrentIndex = index;
            return mObjects[mCurrentIndex];
        }

        public T first() {
            return goToIndex(0);
        }

        public boolean hasNext() {
            return mCurrentIndex < mObjects.length - 1;
        }

        public T next() {
            return goToIndex(mCurrentIndex + 1);
        }

    }
}
