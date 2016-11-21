package com.markantoni.gofinandroid.interfaces;

/**
 * Created by mark on 11/16/16.
 */

public interface IPatternPresenter {
    IPatternModel getModel();

    void patternUsage();

    void onBindView(IPatternView patternView);

    void onUnbindView();
}
