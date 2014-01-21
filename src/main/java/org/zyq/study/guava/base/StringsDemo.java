package org.zyq.study.guava.base;

import com.google.common.base.Strings;

/**
 * @author Marvin
 * Created on 2014-01-21,11:09
 */
public class StringsDemo {
    public static void main(String[] args) {
        System.out.println("Strings.isNullOrEmpty(\"abc\"):  " + Strings.isNullOrEmpty("abc"));
        System.out.println("Strings.isNullOrEmpty(null):  " + Strings.isNullOrEmpty(null));
        System.out.println("Strings.isNullOrEmpty(\"\"):  " + Strings.isNullOrEmpty(""));

        System.out.println("----------------------------------------");
        System.out.println("Strings.nullToEmpty(\"abc\"):  " + Strings.nullToEmpty("abc"));
        System.out.println("Strings.nullToEmpty(null):  " + Strings.nullToEmpty(null));
        System.out.println("Strings.nullToEmpty(\"\"):  " + Strings.nullToEmpty(""));

        System.out.println("----------------------------------------");

        System.out.println("Strings.emptyToNull(\"abc\"):  " + Strings.emptyToNull("abc"));
        System.out.println("Strings.emptyToNull(null):  " + Strings.emptyToNull(null));
        System.out.println("Strings.emptyToNull(\"\"):  " + Strings.emptyToNull(""));

        System.out.println("----------------------------------------");

        System.out.println("Strings.padStart(\"7\", 4, '0'):  " + Strings.padStart("7", 4, '0'));
        System.out.println("Strings.padStart(\"abc\", 1, '!'):  " + Strings.padStart("abc", 1, '!'));

        System.out.println("----------------------------------------");

        System.out.println("Strings.padEnd(\"7\", 4, '0'):  " + Strings.padEnd("7", 4, '0'));
        System.out.println("Strings.padEnd(\"abc\", 1, '!'):  " + Strings.padEnd("abc", 1, '!'));

        System.out.println("----------------------------------------");

        System.out.println("Strings.repeat(\"abc\", 3):  " + Strings.repeat("abc", 3));
        System.out.println("Strings.repeat(\"abc\", 0):  " + Strings.repeat("abc", 0));  // repeat 0 times will return empty string ""
        System.out.println("Strings.repeat(\"\", 3):  " + Strings.repeat("", 3));
        System.out.println("Strings.repeat(\"\", 0):  " + Strings.repeat("", 0));
//        System.out.println("Strings.repeat(null, 3):  " + Strings.repeat(null, 3));   // throws NPE
//        System.out.println("Strings.repeat(null, 0):  " + Strings.repeat(null, 0));   // throws NPE

        System.out.println("----------------------------------------");

        System.out.println("Strings.commonPrefix(\"abc\", \"abcd\"):  " + Strings.commonPrefix("abc", "abcd"));
        System.out.println("Strings.commonPrefix(\"abc\", \"cba\"):  " + Strings.commonPrefix("abc", "cba"));
        System.out.println("Strings.commonPrefix(\"abc\", \"\"):  " + Strings.commonPrefix("abc", ""));
        // neither of the params could be null, otherwise NPE
//        System.out.println("Strings.commonPrefix(null, null):  " + Strings.commonPrefix(null, null));

        System.out.println("----------------------------------------");

        System.out.println("Strings.commonSuffix(\"abc\", \"dabc\"):  " + Strings.commonSuffix("abc", "dabc"));
        System.out.println("Strings.commonSuffix(\"abc\", \"cba\"):  " + Strings.commonSuffix("abc", "cba"));
        System.out.println("Strings.commonSuffix(\"abc\", \"\"):  " + Strings.commonSuffix("abc", ""));
    }
}
