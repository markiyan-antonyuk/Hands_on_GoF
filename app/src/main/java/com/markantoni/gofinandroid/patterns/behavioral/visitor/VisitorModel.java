package com.markantoni.gofinandroid.patterns.behavioral.visitor;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class VisitorModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/visitor.gif";
    }

    @Override
    public String getDescription() {
        return "Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.";
    }

    @Override
    public String getCodeSample() {
        return "public static class Document {\n" +
                "    public static List<DocumentPart> mParts = new ArrayList<>();\n" +
                "\n" +
                "    public void addPart(DocumentPart part) {\n" +
                "        mParts.add(part);\n" +
                "    }\n" +
                "\n" +
                "    public void accept(Visitor visitor) {\n" +
                "        for (DocumentPart part : mParts) {\n" +
                "            part.accept(visitor);\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public interface DocumentPart {\n" +
                "    public String getContent();\n" +
                "\n" +
                "    public void accept(Visitor visitor);\n" +
                "}\n" +
                "\n" +
                "public static class PlainText implements DocumentPart {\n" +
                "    @Override\n" +
                "    public String getContent() {\n" +
                "        return \"Some plain text\";\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void accept(Visitor visitor) {\n" +
                "        visitor.visit(this);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class BoldText implements DocumentPart {\n" +
                "    @Override\n" +
                "    public String getContent() {\n" +
                "        return \"Some bold text\";\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void accept(Visitor visitor) {\n" +
                "        visitor.visit(this);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public interface Visitor {\n" +
                "    void visit(PlainText plainText);\n" +
                "\n" +
                "    void visit(BoldText boldText);\n" +
                "}\n" +
                "\n" +
                "public static class HtmlVisitor implements Visitor {\n" +
                "    private String mHtml = \"\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void visit(PlainText plainText) {\n" +
                "        mHtml += plainText.getContent();\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void visit(BoldText boldText) {\n" +
                "        mHtml += \"<b>\" + boldText.getContent() + \"</b>\";\n" +
                "    }\n" +
                "\n" +
                "    public String getHtml() {\n" +
                "        return mHtml;\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.visitor;
    }
}
