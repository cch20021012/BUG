package com.example.gug.zjl.ui.fagment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LogisticsActivity extends BaseActivity {
    @BindView(R.id.orderform_img)
    ImageView orderformImg;
    @BindView(R.id.dingdan)
    TextView dingdan;

    @Override
    protected int getLayout() {
        return R.layout.activity_logistics;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
    orderformImg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(LogisticsActivity.this,ParticularsActivity.class));
        }
    });
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
}
