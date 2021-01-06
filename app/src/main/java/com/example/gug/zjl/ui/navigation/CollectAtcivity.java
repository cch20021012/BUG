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

import com.example.gug.MainActivity;
import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.psy.ui.MeFragment;
import com.example.gug.zjl.ui.fagment.HomeFragment;
import com.example.gug.zjl.ui.fagment.PaymentFragment;
import com.example.gug.zjl.ui.fagment.PaymentFragment2;
import com.example.gug.zjl.ui.fagment.PaymentFragment3;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CollectAtcivity extends BaseActivity {
    @BindView(R.id.collect_img)
    ImageView collectImg;
    @BindView(R.id.collect_tab)
    TabLayout collectTab;
    @BindView(R.id.collect_vp)
    ViewPager collectVp;
    private CollectFragmentAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_collect;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new HomeFragment2());
        list.add(new PaymentFragment());
        list.add(new PaymentFragment2());
        list.add(new PaymentFragment3());
        adapter = new CollectFragmentAdapter(getSupportFragmentManager(), list);
        collectVp.setAdapter(adapter);

        collectTab.setupWithViewPager(collectVp);
        collectTab.getTabAt(0).setText("全部");
        collectTab.getTabAt(1).setText("课程");
        collectTab.getTabAt(2).setText("活动");
        collectTab.getTabAt(3).setText("商品");
        collectImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectAtcivity.this, MainActivity.class);
                intent.putExtra("name",3);
                startActivity(intent);
            }
        });
    }
    private class CollectFragmentAdapter extends FragmentStatePagerAdapter {
        private ArrayList<Fragment>list;

        public CollectFragmentAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> list) {
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
