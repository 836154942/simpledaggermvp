package com.example.spc.myapplication.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.spc.myapplication.di.component.Activitycomponent;
import com.example.spc.myapplication.di.component.DaggerActivitycomponent;
import com.example.spc.myapplication.di.module.ActivityModule;

import javax.inject.Inject;

/**
 * Created by spc on 2017/6/8.
 */

public abstract class BaseMVPActivity<P extends BasePresenter> extends AppCompatActivity implements BaseMvpViewInterface {

    @Inject//与Presenter 构造的方法的inject注解对应。自动注入
    protected P mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initInject(DaggerActivitycomponent.builder()
                .appcomponent(MyApplication.getInst().getAppComponent())
                .activityModule(new ActivityModule(this))
                .build());
        mvpPresenter.attachView(this);
    }
    protected abstract void initInject(Activitycomponent activityComponent);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }
}
