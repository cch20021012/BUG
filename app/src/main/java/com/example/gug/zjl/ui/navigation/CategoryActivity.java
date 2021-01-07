package com.example.gug.zjl.ui.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.gug.R;
import com.example.gug.axl.SettlementActivity;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryActivity extends BaseActivity {
    @BindView(R.id.category_img)
    ImageView categoryImg;
    @BindView(R.id.category_bton)
    Button categoryBton;

    @Override
    protected int getLayout() {
        return R.layout.activity_category;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        //返回
        categoryImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this, ApplyActivity.class));
            }
        });

        //点击确定 跳转到支付
        categoryBton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this,SettlementActivity.class));
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
