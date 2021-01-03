package com.example.gug.zyz.order;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ZOrderActivity extends BaseActivity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.tablayout)
    TabLayout tablayout;

    @Override
    protected int getLayout() {
        return R.layout.activity_order;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        ArrayList<Fragment> fragment = new ArrayList<>();
        fragment.add(new AllFragment());
        fragment.add(new GetFragment());
        fragment.add(new UseFragment());
        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragment.get(position);
            }

            @Override
            public int getCount() {
                return fragment.size();
            }
        });
        tablayout.setupWithViewPager(viewpager);
        tablayout.getTabAt(0).setText("全部");
        tablayout.getTabAt(1).setText("获取");
        tablayout.getTabAt(2).setText("使用");
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
