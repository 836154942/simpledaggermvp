package com.example.spc.myapplication.base;

/**
 * Created by spc on 2017/6/8.
 */

public class BasePresenter <V extends BaseMvpViewInterface>  {
    protected V mvpView;
    public void attachView(V mvpView) {
        this.mvpView = mvpView;
    }

    public void detachView() {
        this.mvpView = null;
    }

}
