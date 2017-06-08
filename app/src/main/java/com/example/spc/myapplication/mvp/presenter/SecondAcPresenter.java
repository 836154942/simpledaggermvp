package com.example.spc.myapplication.mvp.presenter;

import com.example.spc.myapplication.base.BaseMVPActivity;
import com.example.spc.myapplication.base.BasePresenter;
import com.example.spc.myapplication.mvp.viewinterface.SecondAcView;

import javax.inject.Inject;

/**
 * Created by spc on 2017/6/8.
 */

public class SecondAcPresenter extends BasePresenter<SecondAcView> {
    @Inject
    public SecondAcPresenter(BaseMVPActivity activity) {
    }
}
