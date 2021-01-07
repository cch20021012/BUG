package com.example.gug.zyz.personal;

import android.os.Bundle;
import android.renderscript.BaseObj;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PersonalActivity extends BaseActivity {
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.bt_ok)
    Button btOk;
    @BindView(R.id.tv_bao)
    TextView tvBao;

    @Override
    protected int getLayout() {
        return R.layout.activity_personal;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tvBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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
