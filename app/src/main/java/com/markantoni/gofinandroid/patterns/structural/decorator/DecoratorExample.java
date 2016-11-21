package com.markantoni.gofinandroid.patterns.structural.decorator;

public class DecoratorExample {
    interface Car {
        int getMaxSpeed();
    }

    //car decorator with nitro which increases speed
    public static class Nitro implements Car {
        private final int SPEED_MULTIPLIER = 2;
        private Car mCar;

        public Nitro(Car car) {
            mCar = car;
        }

        @Override
        public int getMaxSpeed() {
            return mCar.getMaxSpeed() * SPEED_MULTIPLIER;
        }
    }
}
