package com.markantoni.gofinandroid.interfaces;

import android.support.v4.app.Fragment;

/**
 * Created by mark on 11/16/16.
 */

public interface IPatternView {
    void showDescription(String description);

    void showUmlDiagram(String umlDiagramUrl);

    void showCodeSample(String codeSample);

    void showTitle(int title);

    Fragment getFragment();
}
