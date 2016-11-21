package com.markantoni.gofinandroid;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.support.v4.widget.CursorAdapter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mark on 11/21/16.
 */

public class SearchAdapter extends CursorAdapter {
    public static SearchAdapter create(Context context) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "name"});

        String[] suggestions = context.getResources().getStringArray(R.array.search_hints);
        int id = 0;
        for (String suggestion : suggestions) {
            matrixCursor.addRow(new String[]{id++ + "", suggestion});
        }

        return new SearchAdapter(context, matrixCursor);
    }

    private Cursor mInitialCursor;
    private OnSearchSuggestionClickListener mOnSearchSuggestionClickListener;

    public SearchAdapter(Context context, final Cursor c) {
        super(context, c, true);
        mInitialCursor = c;
    }

    public void filterSuggestions(String query) {
        if (!TextUtils.isEmpty(query)) {
            query = query.toLowerCase();
            MatrixCursor cursor = new MatrixCursor(mInitialCursor.getColumnNames());

            mInitialCursor.moveToFirst();
            do {
                if (mInitialCursor.getString(1).toLowerCase().contains(query)) {
                    cursor.addRow(new String[]{mInitialCursor.getString(0), mInitialCursor.getString(1)});
                }
            } while (mInitialCursor.moveToNext());

            changeCursor(cursor);
        }
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.view_search_suggestion, null);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        final String name = cursor.getString(1);
        ((TextView) view).setText(name);
        
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnSearchSuggestionClickListener != null) {
                    mOnSearchSuggestionClickListener.onSuggestionClicked(name);
                }
            }
        });
    }

    public void setOnSearchSuggestionClickListener(OnSearchSuggestionClickListener listener) {
        mOnSearchSuggestionClickListener = listener;
    }

    public interface OnSearchSuggestionClickListener {
        void onSuggestionClicked(String value);
    }
}
