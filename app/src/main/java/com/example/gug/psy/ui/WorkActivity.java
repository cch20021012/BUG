package com.example.gug.psy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.base.BaseAdapter;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.psy.adapter.WorkAdapter;
import com.example.gug.psy.bean.WorkBean;

import java.util.ArrayList;

public class WorkActivity extends BaseActivity implements View.OnClickListener {
    private ImageView mWorkImgLeft;
    private RecyclerView mWorkRlv;
    private ArrayList<WorkBean> mWork;
    private WorkAdapter workAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_work;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        mWorkImgLeft = (ImageView) findViewById(R.id.work_img_left);
        mWorkRlv = (RecyclerView) findViewById(R.id.work_rlv);
        mWorkImgLeft.setOnClickListener(this);
        mWorkRlv.setOnClickListener(this);
        initRlv();
    }

    private void initRlv() {
        mWorkRlv.setLayoutManager(new LinearLayoutManager(this));
        mWork = new ArrayList<>();
        mWork.add(new WorkBean(""+R.mipmap.ic_launcher,"节奏练习1","9小时","声乐系统课-第一节课"));
        mWork.add(new WorkBean(""+R.mipmap.ic_launcher,"节奏练习2","4小时","声乐系统课-第一节课"));
        mWork.add(new WorkBean(""+R.mipmap.ic_launcher,"节奏练习3","8小时","声乐系统课-第一节课"));
        mWork.add(new WorkBean(""+R.mipmap.ic_launcher,"节奏练习4","6小时","声乐系统课-第一节课"));
        mWork.add(new WorkBean(""+R.mipmap.ic_launcher,"节奏练习5","7小时","声乐系统课-第一节课"));
        mWork.add(new WorkBean(""+R.mipmap.ic_launcher,"节奏练习6","5小时","声乐系统课-第一节课"));
        //创建适配器
        workAdapter = new WorkAdapter(this, mWork);
        mWorkRlv.setAdapter(workAdapter);
        workAdapter.notifyDataSetChanged();

        workAdapter.addListClick(new BaseAdapter.IListClick() {
            @Override
            public void itemClick(int pos) {
                startActivity(new Intent(WorkActivity.this,WorkTalkActivity.class));
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO:OnCreate Method has been created, run FindViewById again to generate code
        setContentView(R.layout.activity_work);
        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.work_img_left:
                //关闭此页面
                finish();
                break;
            case R.id.work_rlv:
                break;
        }
    }
}
