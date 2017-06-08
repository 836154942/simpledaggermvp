package com.example.spc.myapplication.di.component;

import com.example.spc.myapplication.di.module.ActivityModule;
import com.example.spc.myapplication.di.scope.ActivityScope;
import com.example.spc.myapplication.ui.MainActivity;
import com.example.spc.myapplication.ui.SecondActivity;

import dagger.Component;

/**
 * Created by spc on 2017/6/8.
 */

@ActivityScope
@Component(dependencies = Appcomponent.class,
        modules = ActivityModule.class)
public interface Activitycomponent {

    MainActivity inject(MainActivity activity);

//    可以公用一个Component
    void inject(SecondActivity activity);

//    void inject(Tread activity);
}
