package com.markantoni.gofinandroid.patterns.behavioral.memento;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class MementoExample {
    public static class MementoJava implements Serializable {
    }

    public static class MementoAndroid implements Parcelable {
        private int mInt1;
        private int mInt2;
        private String mString;

        protected MementoAndroid(Parcel in) {
            mInt1 = in.readInt();
            mInt2 = in.readInt();
            mString = in.readString();
        }

        public static final Creator<MementoAndroid> CREATOR = new Creator<MementoAndroid>() {
            @Override
            public MementoAndroid createFromParcel(Parcel in) {
                return new MementoAndroid(in);
            }

            @Override
            public MementoAndroid[] newArray(int size) {
                return new MementoAndroid[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(mInt1);
            parcel.writeInt(mInt2);
            parcel.writeString(mString);
        }
    }

}
