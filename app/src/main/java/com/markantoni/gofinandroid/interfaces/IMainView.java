package com.markantoni.gofinandroid.interfaces;

import java.util.List;

/**
 * Created by mark on 11/16/16.
 */

public interface IMainView {
    void showPattern(IPatternPresenter IPatternPresenter);

    void setPatternsList(List<IPatternPresenter> patterns);
}
