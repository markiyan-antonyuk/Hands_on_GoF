package com.markantoni.gofinandroid.patterns.behavioral.templatemethod;

import java.util.Map;
import java.util.TreeMap;

public class TemplateMethodExample {
    public static abstract class Store<T> {
        public final T buy(String what) {
            if (isAvailableInStore(what)) {
                return findInStorage(what);
            }
            return proposeAnother();
        }

        protected abstract boolean isAvailableInStore(String what);

        protected abstract T findInStorage(String what);

        protected abstract T proposeAnother();
    }

    public static class NumbersStore extends Store<Integer> {
        private Map<String, Integer> mStorage = new TreeMap<>();

        public NumbersStore() {
            mStorage.put("1", 1);
            mStorage.put("2", 2);
            mStorage.put("3", 3);
        }

        @Override
        protected boolean isAvailableInStore(String what) {
            return mStorage.containsKey(what);
        }

        @Override
        protected Integer findInStorage(String what) {
            return mStorage.get(what);
        }

        @Override
        protected Integer proposeAnother() {
            return mStorage.get("1");
        }
    }
}