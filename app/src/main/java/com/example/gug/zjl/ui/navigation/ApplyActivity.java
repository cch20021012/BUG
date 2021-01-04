package com.example.gug.zjl.ui.navigation;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

public class ApplyActivity extends BaseActivity implements View.OnClickListener {
    private TextView mTime4Apply;
    private TextView mPrice1Apply;
    private TextView mPrice2Apply;
    private TextView mNameApply;
    private EditText mEtNameApply;
    private ImageView mIvNameimgApply;
    private TextView mAgeApply;
    private Button mBtonApply;

    @Override
    protected int getLayout() {
        return R.layout.activity_apply;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

        mTime4Apply = (TextView) findViewById(R.id.apply_time4);
        mPrice1Apply = (TextView) findViewById(R.id.apply_price1);
        mPrice2Apply = (TextView) findViewById(R.id.apply_price2);
        mNameApply = (TextView) findViewById(R.id.apply_name);
        mEtNameApply = (EditText) findViewById(R.id.apply_et_name);
        mIvNameimgApply = (ImageView) findViewById(R.id.apply_iv_nameimg);
        mAgeApply = (TextView) findViewById(R.id.apply_age);
        mBtonApply = (Button) findViewById(R.id.apply_bton);
        mBtonApply.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.apply_bton:

                // TODO 21/01/04
                break;
            default:
                break;
        }
    }
}
