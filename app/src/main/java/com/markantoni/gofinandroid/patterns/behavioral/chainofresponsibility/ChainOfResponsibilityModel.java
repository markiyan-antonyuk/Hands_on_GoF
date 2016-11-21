package com.markantoni.gofinandroid.patterns.behavioral.chainofresponsibility;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class ChainOfResponsibilityModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/chain.gif";
    }

    @Override
    public String getDescription() {
        return "Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.";
    }

    @Override
    public String getCodeSample() {
        return "public abstract class Filter {\n" +
                "    private Filter mNextFilter;\n" +
                "\n" +
                "    public void setNextFilter(Filter filterSuggestions) {\n" +
                "        mNextFilter = filterSuggestions;\n" +
                "    }\n" +
                "\n" +
                "    public void startFiltering() {\n" +
                "        filterSuggestions();\n" +
                "\n" +
                "        if (mNextFilter != null) {\n" +
                "            filterSuggestions();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    protected abstract void filterSuggestions();\n" +
                "}\n" +
                "\n" +
                "public class FirstFilter extends Filter {\n" +
                "    @Override\n" +
                "    protected void filterSuggestions() {\n" +
                "        //filtering with first filterSuggestions\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class SecondFilter extends Filter {\n" +
                "    @Override\n" +
                "    protected void filterSuggestions() {\n" +
                "        //filtering with second filterSuggestions\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class ThirdFilter extends Filter {\n" +
                "    @Override\n" +
                "    protected void filterSuggestions() {\n" +
                "        //filtering with third filterSuggestions\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.chain_of_resp;
    }
}
