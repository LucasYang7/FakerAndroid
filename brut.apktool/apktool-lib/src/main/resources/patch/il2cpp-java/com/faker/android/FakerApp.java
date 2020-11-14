/**
 * Generated by FakerAndroid for doc or help by https://github.com/Efaker/FakerAndroid
 */
package com.faker.android;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FakerApp extends {APPLICATION_NAME} {

    static {
        System.loadLibrary("native-lib");
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        fakeDex(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        fakeApp(this);
    }

    private native void fakeApp(Application application);

    private native void fakeDex(Context base);

}
