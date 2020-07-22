package com.kevin.theview.util;

import android.util.Log;


/**
 * Created by Kevin on 2019-08-12<br/>
 * Describe:<br/>
 */
public class LogUtils {
    private static boolean isDebug = true;

    public void setDebug(boolean b) {
        isDebug = b;
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (isDebug) {
            Log.w(tag, msg);
        }
    }


}
