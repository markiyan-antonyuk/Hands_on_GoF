package com.markantoni.gofinandroid.patterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityExample {
    public static abstract class Filter {
        private Filter mNextFilter;

        public void setNextFilter(Filter filter) {
            mNextFilter = filter;
        }

        public void startFiltering() {
            filter();

            if (mNextFilter != null) {
                filter();
            }
        }

        protected abstract void filter();
    }

    public static class FirstFilter extends Filter {
        @Override
        protected void filter() {
            //filtering with first filterSuggestions
        }
    }

    public static class SecondFilter extends Filter {
        @Override
        protected void filter() {
            //filtering with second filterSuggestions
        }
    }

    public static class ThirdFilter extends Filter {
        @Override
        protected void filter() {
            //filtering with third filterSuggestions
        }
    }
}
