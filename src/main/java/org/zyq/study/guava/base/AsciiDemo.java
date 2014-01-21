package org.zyq.study.guava.base;

import com.google.common.base.Ascii;

/**
 * @author Marvin
 *         Created on 2014-01-21,15:13
 */
public class AsciiDemo {
    public static void main(String[] args) {
        System.out.println("Ascii.toLowerCase(\"ABC\"):  " + Ascii.toLowerCase("ABC"));
        System.out.println("Ascii.toLowerCase(new StringBuilder(\"ABC\")):  " + Ascii.toLowerCase(new StringBuilder("ABC")));
        System.out.println("Ascii.toLowerCase('A'):  " + Ascii.toLowerCase('A'));

        System.out.println("----------------------------");

        System.out.println("Ascii.toUpperCase(\"abc\"):  " + Ascii.toUpperCase("abc"));
        System.out.println("Ascii.toUpperCase(new StringBuilder(\"abc\")):  " + Ascii.toUpperCase(new StringBuilder("abc")));
        System.out.println("Ascii.toUpperCase('a'):  " + Ascii.toUpperCase('a'));

        System.out.println("----------------------------");

        // only the 26 ascii lowercase alphabetic characters will return true
        System.out.println("Ascii.isLowerCase('a'):  " + Ascii.isLowerCase('a'));
        System.out.println("Ascii.isLowerCase('.'):  " + Ascii.isLowerCase('.'));
        System.out.println("Ascii.isLowerCase('我'):  " + Ascii.isLowerCase('我'));

        System.out.println("----------------------------");

        // only the 26 ascii uppercase alphabetic characters will return true
        System.out.println("Ascii.isUpperCase('A'):  " + Ascii.isUpperCase('A'));
        System.out.println("Ascii.isUpperCase('.'):  " + Ascii.isUpperCase('.'));
        System.out.println("Ascii.isUpperCase('我'):  " + Ascii.isUpperCase('我'));

        System.out.println("----------------------------");

        // guava equalsIgnoreCase "is significantly faster than String.equalsIgnoreCase(java.lang.String) and should be used in preference if at least one of the parameters is known to contain only ASCII characters."
        System.out.println("Ascii.equalsIgnoreCase(\"abc\", \"ABC\"): " + Ascii.equalsIgnoreCase("abc", "ABC"));
        System.out.println("Ascii.equalsIgnoreCase(\"学习ab.c\", \"学习AB.C\"): " + Ascii.equalsIgnoreCase("学习ab.c", "学习AB.C"));
//        System.out.println(Ascii.equalsIgnoreCase(null, null));    // params should not bu null, otherwise NPE

        System.out.println("----------------------------");

        System.out.println("Ascii.truncate(\"abcdefg\", 4, \"...\"):  " + Ascii.truncate("abcdefg", 4, "..."));
        System.out.println("Ascii.truncate(\"abcdefg\", 3, \"...\"):  " + Ascii.truncate("abcdefg", 3, "..."));
        System.out.println("Ascii.truncate(\"abcdefg\", 7, \"...\"):  " + Ascii.truncate("abcdefg", 7, "..."));
        System.out.println("Ascii.truncate(\"abcdefg\", 10, \"...\"):  " + Ascii.truncate("abcdefg", 10, "..."));
    }
}
