package com.markantoni.gofinandroid.patterns.structural.proxy;

public class ProxyExample {
    interface Api {
        void performAction();
    }

    private static class HiddenApi implements Api {
        @Override
        public void performAction() {
            //perform api action
        }
    }

    public static class ProxyApi implements Api {
        private Api mApi = new HiddenApi();

        @Override
        public void performAction() {
            mApi.performAction();
        }
    }
}
