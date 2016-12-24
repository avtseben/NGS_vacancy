package ru.alexandertsebenko.ngsvacancy.util;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        System.out.println("print context: " + MyApplication.getAppContext());
        return MyApplication.context;
    }
}
