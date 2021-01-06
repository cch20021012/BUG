package com.example.gug.zzx;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;
import com.example.gug.zjl.ui.navigation.ApplyActivity;

import java.util.ArrayList;
import java.util.List;

/**

 * create an instance of this fragment.
 */
public class EventFragment extends Fragment {
    private LinearLayout mLl;
    private ImageView mBannerImg;
    private RecyclerView mNewActivityRecycler;
    private ConstraintLayout mCon;
    private RecyclerView mEventRecycler;
    private List<EventBean> newList;
    private NewActivityAdapter newActivityAdapter;
    private EcentAdapter ecentAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.activity_event, container, false);
        initView(inflate);
        // Inflate the layout for this fragment
        return inflate;
    }

    private void initView(View inflate) {
        mLl = (LinearLayout) inflate.findViewById(R.id.ll);
        mBannerImg = (ImageView) inflate.findViewById(R.id.img_banner);
        mNewActivityRecycler = (RecyclerView)inflate. findViewById(R.id.recycler_new_activity);
        mCon = (ConstraintLayout) inflate.findViewById(R.id.con);
        mEventRecycler = (RecyclerView) inflate.findViewById(R.id.recycler_event);


        mNewActivityRecycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        newList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            final EventBean bean = new EventBean(R.mipmap.music_event_activity, "钢琴直播课程", "12月5日晚8点直播！一起来参加！");
            newList.add(bean);
        }


        newActivityAdapter = new NewActivityAdapter(getActivity(), newList);
        mNewActivityRecycler.setAdapter(newActivityAdapter);

        ecentAdapter = new EcentAdapter(getActivity(), newList);
        mEventRecycler.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
        mEventRecycler.setAdapter(ecentAdapter);
        newActivityAdapter.addListClick(new BaseAdapter.IListClick() {
            @Override
            public void itemClick(int pos) {
                startActivity(new Intent(getActivity(),RankingActivity.class));
            }
        });
    }
}