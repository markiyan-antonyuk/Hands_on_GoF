package com.markantoni.gofinandroid.patterns;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.markantoni.gofinandroid.CodeWrapper;
import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternPresenter;
import com.markantoni.gofinandroid.interfaces.IPatternView;

/**
 * Created by mark on 11/16/16.
 */

public class PatternFragment extends Fragment implements IPatternView, View.OnClickListener {
    private IPatternPresenter mPresenter;
    private TextView mTitle;
    private TextView mDescription;
    private TextView mCodeSample;
    private ImageView mUml;

    public static PatternFragment createWithPresenter(IPatternPresenter presenter) {
        PatternFragment patternFragment = new PatternFragment();
        patternFragment.mPresenter = presenter;
        return patternFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pattern, container, false);
        mTitle = (TextView) view.findViewById(R.id.patternTitle);
        mDescription = (TextView) view.findViewById(R.id.patternDescription);
        mUml = (ImageView) view.findViewById(R.id.patternUml);
        mCodeSample = (TextView) view.findViewById(R.id.patternSample);

        mDescription.setOnClickListener(this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.onBindView(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.onUnbindView();
    }

    @Override
    public void showDescription(String description) {
        mDescription.setText(description);
    }

    @Override
    public void showUmlDiagram(String umlDiagramUrl) {
        Glide.with(this)
                .load(Uri.parse(umlDiagramUrl))
                .into(mUml);
    }

    @Override
    public void showCodeSample(String codeSample) {
        mCodeSample.setText(CodeWrapper.wrap(codeSample));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.patternDescription:
                mCodeSample.setVisibility(mCodeSample.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                break;
        }
    }

    @Override
    public void showTitle(int title) {
        mTitle.setText(title);
    }


    @Override
    public Fragment getFragment() {
        return this;
    }
}
