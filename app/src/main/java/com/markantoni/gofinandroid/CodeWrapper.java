package com.markantoni.gofinandroid;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by mark on 11/16/16.
 */

public class CodeWrapper {
    private static String[] KEYWORDS = {
            "abstract", "continue", "for", "new", "switch", "assert", "default", "package",
            "synchronized", "boolean", "do", "if", "private", "this", "break", "double",
            "implements", "protected", "throw", "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int",
            "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
            "long", "strictfp", "volatile", "float", "native", "super", "while"
    };

    public static CharSequence wrap(String code) {
        code = prepare(code);
        code = wrapAnnotations(code);
        code = wrapKeywords(code);
        code = wrapComments(code);
        code = wrapEscapeSymbols(code);

        return Html.fromHtml(code);
    }

    private static String wrapKeywords(String code) {
        for (String keyword : KEYWORDS) {
            code = code.replaceAll(
                    keyword + " ",
                    wrapInSpan(keyword + "&nbsp;", "#CC7832"));
        }
        return code;
    }

    private static String wrapAnnotations(String code) {
        code = wrapAllBetween(code, "@", " ", 0, "#BBB529");
        return code;
    }

    private static String prepare(String code) {
        code = code.replaceAll("\n", " \n");
        return code;
    }

    private static String wrapComments(String code) {
        code = wrapAllBetween(code, "/*", "*/", 2, "#BB0000");
        code = wrapAllBetween(code, "//", "\n", 0, "#BB0000");
        return code;
    }

    private static String wrapEscapeSymbols(String code) {
        code = code.replaceAll("\\n", "<br>");
        code = code.replaceAll("\\t", "    ");
        code = code.replaceAll("    ", "&nbsp;&nbsp;&nbsp;&nbsp;");
        return code;
    }

    private static String wrapInSpan(String what, String color) {
        return TextUtils.concat("<span style='color:", color, "'>", what, "</span>").toString();
    }

    private static String wrapAllBetween(String code, String start, String end, int addition, String color) {
        int firstIndex = 0;
        int nextIndex;

        while (true) {
            firstIndex = code.indexOf(start, firstIndex);
            nextIndex = code.indexOf(end, firstIndex);

            if (firstIndex == -1 || nextIndex == -1) {
                break;
            }

            String substring = code.substring(firstIndex, nextIndex + addition);
            code = code.replace(substring, wrapInSpan(substring, color));

            firstIndex = nextIndex;
        }

        return code;
    }
}
