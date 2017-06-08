package com.example.spc.myapplication.di.component;

import com.example.spc.myapplication.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by spc on 2016/11/5.
 * application的 component 相当于base
 */


@Singleton
@Component(modules = AppModule.class)
public interface Appcomponent {

}
