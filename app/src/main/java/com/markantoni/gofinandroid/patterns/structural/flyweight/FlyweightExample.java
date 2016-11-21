package com.markantoni.gofinandroid.patterns.structural.flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightExample {
    public static class FlyweightObject {
        private int mValue;

        private FlyweightObject(int value) {
            mValue = value;
        }

        public int getValue() {
            return mValue;
        }
    }

    public static class FlyweightObjectsFactory {
        private Map<Integer, FlyweightObject> mMap = new TreeMap<>();

        FlyweightObject create(int value) {
            //checks whether needed element exists already, if yes, returns it
            if (!mMap.containsKey(value)) {
                FlyweightObject object = new FlyweightObject(value);
                mMap.put(value, object);
                return object;
            }
            return mMap.get(value);
        }
    }
}
