package com.markantoni.gofinandroid.patterns.behavioral.memento;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class MementoModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/memento.gif";
    }

    @Override
    public String getDescription() {
        return "Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.";
    }

    @Override
    public String getCodeSample() {
        return "package com.markantoni.gofinandroid.patterns.behavioral.memento;\n" +
                "\n" +
                "import android.os.Parcel;\n" +
                "import android.os.Parcelable;\n" +
                "\n" +
                "public static class MementoJava implements Serializable {\n" +
                "}\n" +
                "\n" +
                "public static class MementoAndroid implements Parcelable {\n" +
                "    private int mInt1;\n" +
                "    private int mInt2;\n" +
                "    private String mString;\n" +
                "\n" +
                "    protected MementoAndroid(Parcel in) {\n" +
                "        mInt1 = in.readInt();\n" +
                "        mInt2 = in.readInt();\n" +
                "        mString = in.readString();\n" +
                "    }\n" +
                "\n" +
                "    public static final Creator<MementoAndroid> CREATOR = new Creator<MementoAndroid>() {\n" +
                "        @Override\n" +
                "        public MementoAndroid createFromParcel(Parcel in) {\n" +
                "            return new MementoAndroid(in);\n" +
                "        }\n" +
                "\n" +
                "        @Override\n" +
                "        public MementoAndroid[] newArray(int size) {\n" +
                "            return new MementoAndroid[size];\n" +
                "        }\n" +
                "    };\n" +
                "\n" +
                "    @Override\n" +
                "    public int describeContents() {\n" +
                "        return 0;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void writeToParcel(Parcel parcel, int i) {\n" +
                "        parcel.writeInt(mInt1);\n" +
                "        parcel.writeInt(mInt2);\n" +
                "        parcel.writeString(mString);\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.memento;
    }
}
