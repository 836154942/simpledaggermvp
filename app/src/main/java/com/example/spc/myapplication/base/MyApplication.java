package com.example.spc.myapplication.base;

import android.app.Application;

import com.example.spc.myapplication.di.component.Appcomponent;
import com.example.spc.myapplication.di.component.DaggerAppcomponent;
import com.example.spc.myapplication.di.module.AppModule;

/**
 * Created by spc on 2017/6/8.
 */

public class MyApplication extends Application {
    private static MyApplication mInst;
    private Appcomponent mAppcomponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mInst = this;
        mAppcomponent = DaggerAppcomponent.     //Dagger +自己定义的component名字
                builder()
                .appModule(new AppModule(this))  // 自己定义的App级别Module的名字
                .build();
    }
    public static MyApplication getInst() {
        return mInst;
    }

    public Appcomponent getAppComponent() {
        return mAppcomponent;
    }

}
