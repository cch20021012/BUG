package com.example.gug.zjl.ui.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.psy.ui.MeFragment;
import com.example.gug.zjl.ui.fagment.HomeFragment;
import com.example.gug.zjl.ui.fagment.PaymentFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderformActivity extends BaseActivity {
    @BindView(R.id.orderform_tab)
    TabLayout orderformTab;
    @BindView(R.id.orderform_vp)
    ViewPager orderformVp;
    @BindView(R.id.orderform_img)
    ImageView orderformImg;
    private OrderformFragmentAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_orderform;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new PaymentFragment());
        adapter = new OrderformFragmentAdapter(getSupportFragmentManager(), list);
        orderformVp.setAdapter(adapter);

        orderformTab.setupWithViewPager(orderformVp);
        orderformTab.getTabAt(0).setText("全部");
        orderformTab.getTabAt(1).setText("代付款");

        //返回
        orderformImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderformActivity.this, MeFragment.class));
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

    private class OrderformFragmentAdapter extends FragmentStatePagerAdapter {
        private ArrayList<Fragment> list;

        public OrderformFragmentAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> list) {
            super(fm);
            this.list = list;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
