package com.markantoni.gofinandroid.patterns.structural.adapter;

public class AdapterExample {
    interface TwoWheelsVehicle {
        void ride();
    }

    interface FourWheelVehicle {
        void ride();

        void packSomeStuff();
    }

    public static class FourWheelsVehicleAdapter implements FourWheelVehicle {
        private TwoWheelsVehicle mVehicle;

        public FourWheelsVehicleAdapter(TwoWheelsVehicle twoWheelsVehicle) {
            mVehicle = twoWheelsVehicle;
        }

        @Override
        public void ride() {
            mVehicle.ride();
        }

        @Override
        public void packSomeStuff() {
            //pack stuff here
        }
    }

    public static class Motorcycle implements TwoWheelsVehicle {
        @Override
        public void ride() {
            //ride it
        }
    }

    public static class Car implements FourWheelVehicle {
        @Override
        public void ride() {
            //ride it
        }

        @Override
        public void packSomeStuff() {
            //pack some stuff
        }
    }
}
