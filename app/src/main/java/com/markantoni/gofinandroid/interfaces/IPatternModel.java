package com.markantoni.gofinandroid.interfaces;

import android.support.annotation.StringRes;

/**
 * Created by mark on 11/16/16.
 */

public interface IPatternModel {
    String getLinkToDiagram();

    String getDescription();

    String getCodeSample();

    @StringRes
    int getTitleRes();
}
