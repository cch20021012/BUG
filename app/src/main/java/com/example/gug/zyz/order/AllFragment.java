package com.example.gug.zyz.order;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.zyz.order.adapter.OkAdapter;
import com.example.gug.zyz.order.bean.Score;

import java.security.Key;
import java.util.ArrayList;

import butterknife.BindView;

public class AllFragment extends BaseFragment {
    @BindView(R.id.ok)
    RecyclerView ok;

    @Override
    protected int getLayout() {
        return R.layout.fragment_order;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        ok.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<Score> list = new ArrayList<>();
        OkAdapter okAdapter = new OkAdapter(getActivity(),list);
        ok.setAdapter(okAdapter);
        for (int i = 0; i < 5; i++) {
            list.add(new Score("完成任务","2020-12-12 12:12:12","+10"));
        }
        okAdapter.notifyDataSetChanged();

    }

    @Override
    protected void initData() {

    }
}
