package com.example.gug.cch.ui.class1;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class XilieFragment extends BaseFragment {
    @BindView(R.id.rlv)
    RecyclerView rlv;
    private XilieAdapter xilieAdapter;

    @Override
    protected int getLayout() {
        return R.layout.cchj_fragment_xilie;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        rlv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            objects.add("qq");
        }
        xilieAdapter = new XilieAdapter(getActivity(),objects);
        rlv.setAdapter(xilieAdapter);
    }

    @Override
    protected void initData() {

    }
}
