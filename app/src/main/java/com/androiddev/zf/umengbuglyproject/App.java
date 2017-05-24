package com.androiddev.zf.umengbuglyproject;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by greedy on 2017/5/24.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "0c0c8bc28f", true);
    }
}
