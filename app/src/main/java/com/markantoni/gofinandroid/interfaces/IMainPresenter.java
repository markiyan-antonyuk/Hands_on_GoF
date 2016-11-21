package com.markantoni.gofinandroid.interfaces;

/**
 * Created by mark on 11/16/16.
 */

public interface IMainPresenter {
    void onPatternSelected(Class<? extends IPatternPresenter> type);

    void onBindView(IMainView view);

    void onUnbindView();
}
