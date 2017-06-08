package com.example.spc.myapplication.di.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by spc on 2016/11/5.
 */
@Module
public class AppModule {
    private Application application;
    public AppModule(Application application) {
        this.application = application;
    }
    @Provides
    @Singleton
    public Application getIns() {
        return application;
    }
}
