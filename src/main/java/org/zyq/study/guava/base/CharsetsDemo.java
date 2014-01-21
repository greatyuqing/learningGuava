package org.zyq.study.guava.base;

import com.google.common.base.Charsets;

/**
 * @author Marvin
 * Created on 2014-01-21,14:47
 */
public class CharsetsDemo {
    public static void main(String[] args) {
        System.out.println("Charsets.UTF_8 : " + Charsets.UTF_8);
        System.out.println("Charsets.US_ASCII : " + Charsets.US_ASCII);
        System.out.println("Charsets.ISO_8859_1 : " + Charsets.ISO_8859_1);
        System.out.println("Charsets.ISO_8859_1 : " + Charsets.UTF_16);
        System.out.println("Charsets.ISO_8859_1 : " + Charsets.UTF_16BE);
        System.out.println("Charsets.ISO_8859_1 : " + Charsets.UTF_16LE);

        System.out.println("-------------------------------");

        // don't do this
//        try {
//            byte[] bytes = "abc".getBytes("UTF-8");
//            String utf8String = new String(bytes, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            // how can this possibly happen?
//            throw new AssertionError(e);
//        }

        // do this instead
        byte[] bytes = "芝兰君子性，松柏古人心。".getBytes(Charsets.UTF_8);
        String utf8String = new String(bytes, Charsets.UTF_8);
        System.out.println(utf8String);
    }
}
