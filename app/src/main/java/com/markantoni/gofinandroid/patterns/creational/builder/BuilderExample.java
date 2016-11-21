package com.markantoni.gofinandroid.patterns.creational.builder;

public class BuilderExample {

    public static class House {

        private boolean mHasToilet = false;
        private boolean mHasDiningRoom = false;
        private boolean mHasBedroom = false;

        //it's private to disable create instances without builder
        private House() {

        }

        public boolean hasDiningRoom() {
            return mHasDiningRoom;
        }

        public boolean hasToilet() {
            return mHasToilet;
        }

        public boolean hasBedroom() {
            return mHasBedroom;
        }

        public static class Builder {
            private House mHouse;

            public Builder() {
                mHouse = new House();
            }

            public Builder buildToilet() {
                mHouse.mHasToilet = true;
                return this;
            }

            public Builder buildDiningRoom() {
                mHouse.mHasDiningRoom = true;
                return this;
            }

            public Builder buildBedroom() {
                mHouse.mHasBedroom = true;
                return this;
            }

            //in this case builder won't be reusable
            public House build() {
                House house = mHouse;
                mHouse = null;
                return house;
            }
        }
    }
}
