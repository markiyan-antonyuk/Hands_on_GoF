package com.markantoni.gofinandroid.patterns.creational.factorymethod;

public class FactoryMethodExample {

    public interface ShapeFactory {
        Shape createShape();
    }

    //factory for creating shape objects
    public static class CircleFactory implements ShapeFactory {
        @Override
        public Shape createShape() {
            return new Circle();
        }
    }

    //factory for creating rectangle object
    public static class RectangleFactory implements ShapeFactory {
        @Override
        public Shape createShape() {
            return new Rectangle();
        }
    }

    //abstract object
    public interface Shape {
        void draw();

        String getName();
    }

    public static class Circle implements Shape {
        @Override
        public void draw() {
            //draws shape
        }

        @Override
        public String getName() {
            return "Circle";
        }
    }

    public static class Rectangle implements Shape {
        @Override
        public void draw() {
            //draws rectangle
        }

        @Override
        public String getName() {
            return "Rectangle";
        }
    }

}
