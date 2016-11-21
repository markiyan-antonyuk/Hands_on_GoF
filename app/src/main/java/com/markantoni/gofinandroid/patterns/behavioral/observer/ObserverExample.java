package com.markantoni.gofinandroid.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverExample {
    public static class Counter {
        private List<CounterObserver> mObservers = new ArrayList<>();

        public void registerObserver(CounterObserver observer) {
            mObservers.add(observer);
        }

        public void unregisterObserver(CounterObserver observer) {
            mObservers.remove(observer);
        }

        public void start(int end) {
            for (int i = 0; i <= end; i++) {
                for (CounterObserver observer : mObservers) {
                    if (observer.getNumber() == i) {
                        observer.notifyNumber();
                    }
                }
            }
        }
    }

    public abstract static class CounterObserver {
        private int mNumber;

        public CounterObserver(int number) {
            mNumber = number;
        }

        public int getNumber() {
            return mNumber;
        }

        public abstract void notifyNumber();
    }

    public static class HundredCounterObserver extends CounterObserver {
        public HundredCounterObserver() {
            super(100);
        }

        @Override
        public void notifyNumber() {
            //counter reached 100
        }
    }
}
