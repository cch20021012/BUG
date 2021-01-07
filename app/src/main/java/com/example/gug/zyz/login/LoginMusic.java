package com.example.gug.zyz.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginMusic extends BaseActivity {
    @BindView(R.id.iv_close)
    TextView ivClose;

    @Override
    protected int getLayout() {
        return R.layout.activity_loginmusic;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        ivClose.setOnClickListener(new View.OnClickListener() {
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
