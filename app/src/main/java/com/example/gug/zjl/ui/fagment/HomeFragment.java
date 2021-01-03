package com.example.gug.zjl.ui.fagment;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;

import butterknife.BindView;

public class HomeFragment extends BaseFragment {
    @BindView(R.id.homefragment_ll)
    LinearLayout homefragmentLl;

    @Override
    protected int getLayout() {
        return R.layout.layout_homefragment;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
    homefragmentLl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(),ParticularsActivity.class));
        }
    });
    }

    @Override
    protected void initData() {

    }
}
