package com.whosmyqueen.audio_recorder.base;

import android.app.Application;


/**
 * 我程序
 *
 * @author zhengzhihui1.vendor
 * @date 2024/12/13
 */
public class MyApp extends Application {

    private static MyApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static MyApp getInstance() {
        return instance;
    }
}
