package com.example.spc.myapplication.di.module;


import com.example.spc.myapplication.base.BaseMVPActivity;
import com.example.spc.myapplication.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by spc on 2016/11/9.
 */
@Module
public class ActivityModule {
    BaseMVPActivity activity;

    public ActivityModule(BaseMVPActivity activity) {
        this.activity = activity;
    }
    @Provides
    @ActivityScope
    public BaseMVPActivity provideActivity() {
        return activity;
    }
}
