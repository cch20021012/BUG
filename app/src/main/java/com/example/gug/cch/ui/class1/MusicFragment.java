package com.example.gug.cch.ui.class1;

import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;

public class MusicFragment extends BaseFragment {
        @BindView(R.id.tl_class)
        TabLayout tlClass;
        @BindView(R.id.vp_class)
        ViewPager vpClass;

        @Override
        protected int getLayout() {
            return R.layout.cch_music_fragment;
        }

        @Override
        protected IBasePresenter createPrenter() {
            return null;
        }

    @Override
    protected void initView() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new XilieFragment());
        fragments.add(new ZhiboFragment());
        vpClass.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
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
        tlClass.setupWithViewPager(vpClass);
        tlClass.getTabAt(0).setText("系列课程");
        tlClass.getTabAt(1).setText("直播课程");
        TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.cch_tab_music_text_item,null);
        textView.setTextSize(18);
        textView.setText("系列课程");
        tlClass.getTabAt(0).setCustomView(textView);
        tlClass.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.cch_tab_music_text_item,null);
                textView.setTextSize(18);
                textView.setText(tab.getText());
                tab.setCustomView(textView);

            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setCustomView(null);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    protected void initData() {

    }
}
