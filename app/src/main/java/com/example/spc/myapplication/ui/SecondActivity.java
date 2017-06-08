package com.example.spc.myapplication.ui;

import com.example.spc.myapplication.base.BaseMVPActivity;
import com.example.spc.myapplication.di.component.Activitycomponent;
import com.example.spc.myapplication.mvp.presenter.SecondAcPresenter;
import com.example.spc.myapplication.mvp.viewinterface.SecondAcView;

/**
 * Created by spc on 2017/6/8.
 */

public class SecondActivity  extends BaseMVPActivity<SecondAcPresenter> implements SecondAcView {
    @Override
    protected void initInject(Activitycomponent activityComponent) {
        activityComponent.inject(this);
    }
}
