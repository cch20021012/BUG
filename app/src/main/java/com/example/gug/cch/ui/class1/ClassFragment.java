package com.example.gug.cch.ui.class1;

import androidx.viewpager.widget.ViewPager;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

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

    }

    @Override
    protected void initData() {

    }
}
