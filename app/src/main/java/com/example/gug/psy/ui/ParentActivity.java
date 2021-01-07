package com.example.gug.psy.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.psy.adapter.ParentAdapter;
import com.example.gug.psy.bean.ParentBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ParentActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.iv_switch)
    ImageView ivSwitch;
    @BindView(R.id.iv_open)
    ImageView ivOpen;
    @BindView(R.id.tv_open)
    TextView tvOpen;
    @BindView(R.id.layout_teenagers)
    ConstraintLayout layoutTeenagers;
    @BindView(R.id.iv_reserve)
    ImageView ivReserve;
    @BindView(R.id.iv_arrow)
    ImageView ivArrow;
    @BindView(R.id.layout_reserve)
    ConstraintLayout layoutReserve;
    @BindView(R.id.rl_parent)
    RecyclerView rlParent;
    private boolean isOpen;
    @Override
    protected int getLayout() {
        return R.layout.activity_parent;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }


    @Override
    protected void initData() {
        rlParent.setLayoutManager(new LinearLayoutManager(this));
        List<ParentBean> parentList = new ArrayList<>();
        parentList.add(new ParentBean("钢琴一对一",98,"学习中","学习时长18个小时12分钟"));
        parentList.add(new ParentBean("小提琴一对一",98,"学习中","学习时长18个小时12分钟"));
        ParentAdapter parentAdapter = new ParentAdapter(this, parentList);
        rlParent.setAdapter(parentAdapter);
    }


    @Override
    public void onClick(View view) {

    }

    @OnClick({R.id.iv_open, R.id.tv_open, R.id.iv_arrow})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_open:
                if (isOpen) {
                    isOpen = false;
                    ivOpen.setImageResource(R.mipmap.close);
                    tvOpen.setText("已关闭");
                }else{
                    isOpen = true;
                    ivOpen.setImageResource(R.mipmap.open);
                    tvOpen.setText("已开启");
                }
                break;
            case R.id.iv_arrow:
                Toast.makeText(this, "跳转预约课表", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
