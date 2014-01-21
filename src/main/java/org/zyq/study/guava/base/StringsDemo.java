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
    }
}