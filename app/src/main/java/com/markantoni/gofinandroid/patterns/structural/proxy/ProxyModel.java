package com.markantoni.gofinandroid.patterns.structural.proxy;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/18/16.
 */

public class ProxyModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/proxy.gif";
    }

    @Override
    public String getDescription() {
        return "An object representing another object";
    }

    @Override
    public String getCodeSample() {
        return "interface Api {\n" +
                "    void performAction();\n" +
                "}\n" +
                "\n" +
                "private static class HiddenApi implements Api {\n" +
                "    @Override\n" +
                "    public void performAction() {\n" +
                "        //perform api action\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class ProxyApi implements Api {\n" +
                "    private Api mApi = new HiddenApi();\n" +
                "\n" +
                "    @Override\n" +
                "    public void performAction() {\n" +
                "        mApi.performAction();\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.proxy;
    }
}
