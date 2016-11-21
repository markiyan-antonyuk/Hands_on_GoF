package com.markantoni.gofinandroid.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorExample {
    public static class Document {
        public static List<DocumentPart> mParts = new ArrayList<>();

        public void addPart(DocumentPart part) {
            mParts.add(part);
        }

        public void accept(Visitor visitor) {
            for (DocumentPart part : mParts) {
                part.accept(visitor);
            }
        }
    }

    public interface DocumentPart {
        public String getContent();

        public void accept(Visitor visitor);
    }

    public static class PlainText implements DocumentPart {
        @Override
        public String getContent() {
            return "Some plain text";
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class BoldText implements DocumentPart {
        @Override
        public String getContent() {
            return "Some bold text";
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public interface Visitor {
        void visit(PlainText plainText);

        void visit(BoldText boldText);
    }

    public static class HtmlVisitor implements Visitor {
        private String mHtml = "";

        @Override
        public void visit(PlainText plainText) {
            mHtml += plainText.getContent();
        }

        @Override
        public void visit(BoldText boldText) {
            mHtml += "<b>" + boldText.getContent() + "</b>";
        }

        public String getHtml() {
            return mHtml;
        }
    }
}
