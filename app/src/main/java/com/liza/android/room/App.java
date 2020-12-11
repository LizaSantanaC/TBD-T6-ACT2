package com.liza.android.room;
import android.app.Application;

public class App extends Application {
    public static App mApp;
    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }
}