package com.clibdemo;

/**
 * @author zijiao
 * @version 16/5/27
 * @Mark
 */
public class Http {

    static {
        System.loadLibrary("HttpLib");
    }

    public static native int add(int a, int b);

}
