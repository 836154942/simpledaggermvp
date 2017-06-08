package com.example.spc.myapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.spc.myapplication.R;
import com.example.spc.myapplication.base.BaseMVPActivity;
import com.example.spc.myapplication.di.component.Activitycomponent;
import com.example.spc.myapplication.mvp.presenter.MainAcPresenter;
import com.example.spc.myapplication.mvp.viewinterface.MainAcView;

public class MainActivity extends BaseMVPActivity<MainAcPresenter> implements MainAcView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mvpPresenter.loadData();
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    @Override
    protected void initInject(Activitycomponent activityComponent) {
        activityComponent.inject(this);
    }

    @Override
    public void loadSucess(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mvpPresenter.detachView();
    }
}
