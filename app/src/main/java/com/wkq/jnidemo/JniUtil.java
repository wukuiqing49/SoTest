package com.wkq.jnidemo;


public class JniUtil {
        static {
            System.loadLibrary("network");
        }

    public static native boolean HancNetInit();
    public static native int netConnect(String ip,int port,String linkCmd,int timeout,int cmdSize,int dwUser);
}
