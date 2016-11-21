package com.markantoni.gofinandroid.patterns.structural.bridge;

public class BridgeExample {
    interface DrawingAPI {
        void draw();
    }

    public static class DrawingApiV1 implements DrawingAPI {
        @Override
        public void draw() {
            //drawing using v1 api
        }
    }

    public static class DrawingApiV2 implements DrawingAPI {
        @Override
        public void draw() {
            //drawing using v2 api
        }
    }

    public static class Shape {
        private DrawingAPI mDrawingAPI;

        public Shape(DrawingAPI drawingAPI) {
            mDrawingAPI = drawingAPI;
        }

        void draw() {
            mDrawingAPI.draw();
        }
    }
}
