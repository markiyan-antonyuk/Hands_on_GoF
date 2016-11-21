package com.markantoni.gofinandroid.patterns.creational.singleton;

public class SingletonExample {
    private static SingletonExample sInstance;

    private SingletonExample() {
    }

    //lazy initialization
    public static SingletonExample getInstance() {
        if (sInstance == null) {
            sInstance = new SingletonExample();
        }
        return sInstance;
    }

    public void doSomething() {
    }
}
