package com.example.gug.zjl.ui.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NavigationActivity extends BaseActivity {
    @BindView(R.id.navigation_benzhou)
    TextView navigationBenzhou;
    @BindView(R.id.navigation_riqi)
    TextView navigationRiqi;
    @BindView(R.id.navigation_img)
    ImageView navigationImg;
    @BindView(R.id.navigation_name1)
    TextView navigationName1;
    @BindView(R.id.navigation_name2)
    TextView navigationName2;
    @BindView(R.id.navigation_name3)
    TextView navigationName3;
    @BindView(R.id.navigation_bton)
    Button navigationBton;

    @Override
    protected int getLayout() {
        return R.layout.activity_navigation;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
    //跳转到报名页面
        navigationBton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,ApplyActivity.class));
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
