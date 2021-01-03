package com.example.gug.zyz.customer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.psy.ui.TelActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomerActivity extends BaseActivity {
    @BindView(R.id.iv_tel)
    ImageView ivTel;

    @Override
    protected int getLayout() {
        return R.layout.activity_customer;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_tel)
    public void onViewClicked() {
        startActivity(new Intent(this, TelActivity.class));
    }
}
