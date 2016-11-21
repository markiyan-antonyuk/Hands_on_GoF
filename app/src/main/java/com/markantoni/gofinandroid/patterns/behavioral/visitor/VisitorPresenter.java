package com.markantoni.gofinandroid.patterns.behavioral.visitor;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class VisitorPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new VisitorModel();
    }

    @Override
    public void patternUsage() {
        VisitorExample.Document document = new VisitorExample.Document();
        document.addPart(new VisitorExample.BoldText());
        document.addPart(new VisitorExample.PlainText());
        document.addPart(new VisitorExample.BoldText());

        VisitorExample.HtmlVisitor visitor = new VisitorExample.HtmlVisitor();

        document.accept(visitor); //visiting all parts in document and converting them to html
        visitor.getHtml(); //it will return document in html
    }
}
