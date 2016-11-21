package com.markantoni.gofinandroid.patterns.behavioral.strategy;

public class StrategyExample {
    //strategy interface
    interface MathOperation {
        int performOperation(int a, int b);
    }

    public static class AddOperation implements MathOperation {
        @Override
        public int performOperation(int a, int b) {
            return a + b;
        }
    }

    public static class SubtractOperation implements MathOperation {
        @Override
        public int performOperation(int a, int b) {
            return a - b;
        }
    }

    public static class MathContext {
        private MathOperation mOperation;

        public MathContext(MathOperation operation) {
            mOperation = operation;
        }

        public int getResult(int a, int b) {
            return mOperation.performOperation(a, b);
        }
    }
}
