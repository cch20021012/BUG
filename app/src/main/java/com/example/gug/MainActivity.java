package com.example.gug;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.gug.axl.HomePageFragment;
import com.example.gug.cch.VpOneAdapter;
import com.example.gug.cch.ui.class1.ClassFragment;
import com.example.gug.psy.ui.MeFragment;
import com.example.gug.zzx.EventFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp_main;
    private TabLayout tl_main;
    private ConstraintLayout con;
    private ViewPager vp_one;
    private ImageView img_1;
    private ImageView img_2;
    private ImageView img_3;
    private LinearLayout ll;
    private ImageView img_go;
    private TextView tv_time;
    private ConstraintLayout con2;
    String[] str = {"四", "三", "二", "一"};
    int sum = 0;
    private Timer timer;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }
    private void initView() {
        vp_main = (ViewPager) findViewById(R.id.vp_main);
        tl_main = (TabLayout) findViewById(R.id.tl_main);
        con = (ConstraintLayout) findViewById(R.id.con);
        vp_one = (ViewPager) findViewById(R.id.vp_one);
        img_1 = (ImageView) findViewById(R.id.img_1);
        img_2 = (ImageView) findViewById(R.id.img_2);
        img_3 = (ImageView) findViewById(R.id.img_3);
        ll = (LinearLayout) findViewById(R.id.ll);
        img_go = (ImageView) findViewById(R.id.img_go);
        tv_time = (TextView) findViewById(R.id.tv_time);
        con2 = (ConstraintLayout) findViewById(R.id.con2);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomePageFragment());
        fragments.add(new ClassFragment());
        fragments.add(new EventFragment());
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

        View vp1 = LayoutInflater.from(this).inflate(R.layout.cch_vp1_item, null);
        View vp2 = LayoutInflater.from(this).inflate(R.layout.cch_vp2_item, null);
        View vp3 = LayoutInflater.from(this).inflate(R.layout.cch_vp3_item, null);
        ArrayList<View> views = new ArrayList<>();
        views.add(vp1);
        views.add(vp2);
        views.add(vp3);
        timer = new Timer();
        VpOneAdapter vpOneAdapter = new VpOneAdapter(views);
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_go_item);
        vp_one.setAdapter(vpOneAdapter);
        img_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con2.setVisibility(View.GONE);
                con.setVisibility(View.VISIBLE);
            }
        });

    }

    private void initData() {
        vp_one.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    if (timer != null) {
                        timer.cancel();
                        timer = null;
                    }
                    sum=0;
                    img_go.setVisibility(View.GONE);
                    tv_time.setVisibility(View.GONE);
                    img_1.setImageResource(R.drawable.selec);
                    img_2.setImageResource(R.drawable.noselect);
                    img_3.setImageResource(R.drawable.noselect);
                    animation.cancel();
                    img_go.clearAnimation();
                } else if (position == 1) {
                    if (timer != null) {
                        timer.cancel();
                        timer = null;
                    }
                    sum=0;
                    img_go.setVisibility(View.GONE);
                    tv_time.setVisibility(View.GONE);
                    tv_time.setText("五");
                    img_1.setImageResource(R.drawable.noselect);
                    img_2.setImageResource(R.drawable.selec);
                    img_3.setImageResource(R.drawable.noselect);
                    animation.cancel();
                    img_go.clearAnimation();
                } else {
                    img_1.setImageResource(R.drawable.noselect);
                    img_2.setImageResource(R.drawable.noselect);
                    img_3.setImageResource(R.drawable.selec);

                    img_go.setVisibility(View.VISIBLE);
                    tv_time.setVisibility(View.VISIBLE);
                    animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_go_item);
                    img_go.startAnimation(animation);
                    timer=new Timer();
                    TimerTask timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    if (sum < 4) {
                                        tv_time.setText(str[sum]);
                                        sum++;
                                    } else {
                                        tv_time.setVisibility(View.GONE);
                                        timer.cancel();
                                    }
                                }
                            });
                        }
                    };
                    timer.schedule(timerTask, 1000, 1000);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


}