package com.example.gug.zyz.customer;

import android.widget.Toast;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

public class CustomerActivity extends BaseActivity {
    @Override
    protected int getLayout() {
        return R.layout.zyz_activity_customer;
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
}
