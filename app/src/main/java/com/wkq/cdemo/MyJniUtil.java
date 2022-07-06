package com.wkq.cdemo;

/**
 * @author wkq
 * @date 2022年06月28日 16:46
 * @des
 */

public class MyJniUtil {
    static{
        System.loadLibrary("hellow");
    }

    public  static native String stringFromJNI();

}