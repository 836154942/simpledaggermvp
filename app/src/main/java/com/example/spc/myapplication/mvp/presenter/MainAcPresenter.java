package com.example.spc.myapplication.mvp.presenter;

import com.example.spc.myapplication.base.BaseMVPActivity;
import com.example.spc.myapplication.base.BasePresenter;
import com.example.spc.myapplication.mvp.viewinterface.MainAcView;

import javax.inject.Inject;

/**
 * Created by spc on 2017/6/8.
 */

public class MainAcPresenter  extends BasePresenter<MainAcView> {


    @Inject//这个注解与 module 里面的provider方法  和basemvpactivity的inject 对应。
    public MainAcPresenter(BaseMVPActivity activity) {
        // 这个 activity  module 里面的provider方法的返回值
    }



    public void loadData(){
        mvpView.loadSucess("加载数据ok");
    }
}
