package com.example.gug.zyz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.axl.AboutActivity;
import com.example.gug.base.BaseActivity;
import com.example.gug.base.BaseAdapter;
import com.example.gug.interfaces.IBasePresenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShezhiActivity extends BaseActivity {
    @BindView(R.id.rlv)
    RecyclerView rlv;
    @BindView(R.id.set_back)
    ImageView setBack;
    private SheAdapter sheAdapter;

    @Override
    protected int getLayout() {
        
        return R.layout.cch_shezhi_activity;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        setBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initData() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("关于我们");
        strings.add("清除缓存");
        strings.add("意见反馈");
        strings.add("退出登录");
        sheAdapter = new SheAdapter(this, strings);
        rlv.setLayoutManager(new LinearLayoutManager(this));
        rlv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rlv.setAdapter(sheAdapter);
        sheAdapter.addListClick(new BaseAdapter.IListClick() {
            @Override
            public void itemClick(int pos) {
                if (pos == 0) {
                    startActivity(new Intent(ShezhiActivity.this, AboutActivity.class));
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
