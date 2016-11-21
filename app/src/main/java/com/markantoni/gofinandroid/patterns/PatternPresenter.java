package com.markantoni.gofinandroid.patterns;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.interfaces.IPatternPresenter;
import com.markantoni.gofinandroid.interfaces.IPatternView;

/**
 * Created by mark on 11/16/16.
 */

public abstract class PatternPresenter implements IPatternPresenter {
    private IPatternView mView;
    private IPatternModel mModel;

    public PatternPresenter() {
        mModel = generateModel();
    }

    protected abstract IPatternModel generateModel();

    @Override
    public IPatternModel getModel() {
        return mModel;
    }

    @Override
    public void onBindView(IPatternView patternView) {
        mView = patternView;

        IPatternModel model = getModel();
        mView.showTitle(model.getTitleRes());
        mView.showDescription(model.getDescription());
        mView.showUmlDiagram(model.getLinkToDiagram());
        mView.showCodeSample(model.getCodeSample());
    }

    @Override
    public void onUnbindView() {
        mView = null;
    }
}
