package com.example.gug.zjl.ui.fagment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.zjl.ui.IssueActivity;
import com.example.gug.zjl.ui.navigation.OrderformActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ParticularsActivity extends BaseActivity {
    @BindView(R.id.particulars_img)
    ImageView particulars_img;
    @BindView(R.id.particulars_img1)
    ImageView particularsImg1;
    @BindView(R.id.particulars_bton1)
    Button particularsBton1;
    @BindView(R.id.txt_chang)
    TextView txtChang;

    @Override
    protected int getLayout() {
        return R.layout.activity_particulars;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        //点击按钮查看物流详情
        particularsBton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ParticularsActivity.this, LogisticsActivity.class));
            }
        });
        particulars_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ParticularsActivity.this, OrderformActivity.class));
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

    @OnClick(R.id.txt_chang)
    public void onViewClicked() {
        startActivity(new Intent(this, IssueActivity.class));
    }
}
