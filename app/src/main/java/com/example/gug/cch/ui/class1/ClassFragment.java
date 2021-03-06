package com.example.gug.cch.ui.class1;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;

public class ClassFragment extends BaseFragment {
    @BindView(R.id.tl_class)
    TabLayout tlClass;
    @BindView(R.id.vp_class)
    ViewPager vpClass;

    @Override
    protected int getLayout() {
        return R.layout.cch_fragment_class1;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new MusicFragment());
        fragments.add(new MusicFragment());
        fragments.add(new MusicFragment());
        fragments.add(new MiFragment());
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
        tlClass.setSelectedTabIndicatorHeight(0);
        tlClass.getTabAt(0).setText("音乐素养").isSelected();
        tlClass.getTabAt(1).setText("声乐考级");
        tlClass.getTabAt(2).setText("成人学习");
        tlClass.getTabAt(3).setText("乐器");
        View root = LayoutInflater.from(getActivity()).inflate(R.layout.cch_tab_text_item, null);
        TextView tv_name = root.findViewById(R.id.tv_name);
        tv_name.setTextSize(20);
        tv_name.setText("音乐素养");
        tlClass.getTabAt(0).setCustomView(root);
        tlClass.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                View root = LayoutInflater.from(getActivity()).inflate(R.layout.cch_tab_text_item, null);
                TextView tv_name = root.findViewById(R.id.tv_name);
                tv_name.setTextSize(20);
                tv_name.setText(tab.getText());
                tab.setCustomView(root);

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
