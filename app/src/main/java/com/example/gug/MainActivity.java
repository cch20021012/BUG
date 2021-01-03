package com.example.gug;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.multidex.MultiDex;
import androidx.viewpager.widget.ViewPager;

import com.example.gug.axl.HomePageFragment;
import com.example.gug.cch.ui.class1.ClassFragment;
import com.example.gug.psy.ui.MeFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp_main;
    private TabLayout tl_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiDex.install(this);
        initView();
    }

    private void initView() {
        vp_main = (ViewPager) findViewById(R.id.vp_main);
        tl_main = (TabLayout) findViewById(R.id.tl_main);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomePageFragment());
        fragments.add(new ClassFragment());
        fragments.add(new ClassFragment());
        fragments.add(new MeFragment());
        vp_main.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
        tl_main.setupWithViewPager(vp_main);
        tl_main.getTabAt(0).setText("首页").setIcon(R.drawable.home_select_item).isSelected();
        tl_main.getTabAt(1).setText("课程").setIcon(R.drawable.class_select_item);
        tl_main.getTabAt(2).setText("活动").setIcon(R.drawable.activity_select_item);
        tl_main.getTabAt(3).setText("我的").setIcon(R.drawable.me_select_item);

    }
}