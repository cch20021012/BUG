package com.example.gug.zyz;

import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShezhiActivity extends BaseActivity {
    @BindView(R.id.rlv)
    RecyclerView rlv;
    private SheAdapter sheAdapter;

    @Override
    protected int getLayout() {
        return R.layout.zyz_activity_shezhi;
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
        ArrayList<String> strings = new ArrayList<>();
        strings.add("关于我们");
        strings.add("清除缓存");
        strings.add("意见反馈");
        strings.add("退出登录");
        sheAdapter = new SheAdapter(this,strings);
        rlv.setLayoutManager(new LinearLayoutManager(this));
        rlv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        rlv.setAdapter(sheAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
