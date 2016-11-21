package com.markantoni.gofinandroid.patterns.creational.abstractfactory;

public class AbstractFactoryExample {
    public static abstract class VehicleFactory {
        public Vehicle create() {
            Vehicle vehicle = new Vehicle();
            setWeight(vehicle);
            setWheels(vehicle);
            setType(vehicle);
            return vehicle;
        }

        protected abstract void setWheels(Vehicle vehicle);

        protected abstract void setType(Vehicle vehicle);

        protected abstract void setWeight(Vehicle vehicle);
    }

    public static class CarFactory extends VehicleFactory {
        @Override
        protected void setWheels(Vehicle vehicle) {
            vehicle.setWheels(4);
        }

        @Override
        protected void setType(Vehicle vehicle) {
            vehicle.setType("Car");
        }

        @Override
        protected void setWeight(Vehicle vehicle) {
            vehicle.setWeight(1500);
        }
    }

    public static class MotorcycleFactory extends VehicleFactory {
        @Override
        protected void setWheels(Vehicle vehicle) {
            vehicle.setWheels(2);
        }

        @Override
        protected void setType(Vehicle vehicle) {
            vehicle.setType("Motorcycle");
        }

        @Override
        protected void setWeight(Vehicle vehicle) {
            vehicle.setWeight(200);
        }
    }

    public static class Vehicle {
        private int mWheels;
        private String mType;
        private int mWeight;

        public Vehicle() {
        }

        public void setWheels(int wheels) {
            mWheels = wheels;
        }

        public void setType(String type) {
            mType = type;
        }

        public void setWeight(int weight) {
            mWeight = weight;
        }

        public int getWheels() {
            return mWheels;
        }

        public int getWeight() {
            return mWeight;
        }

        public String getType() {
            return mType;
        }
    }
}
