package com.example.gug.zzx;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class EventActivity extends AppCompatActivity {

    private LinearLayout mLl;
    private ImageView mBannerImg;
    private RecyclerView mNewActivityRecycler;
    private ConstraintLayout mCon;
    private RecyclerView mEventRecycler;
    private List<EventBean> newList;
    private NewActivityAdapter newActivityAdapter;
    private EcentAdapter ecentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        initView();
    }

    private void initView() {
        mLl = (LinearLayout) findViewById(R.id.ll);
        mBannerImg = (ImageView) findViewById(R.id.img_banner);
        mNewActivityRecycler = (RecyclerView) findViewById(R.id.recycler_new_activity);
        mCon = (ConstraintLayout) findViewById(R.id.con);
        mEventRecycler = (RecyclerView) findViewById(R.id.recycler_event);


        mNewActivityRecycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        newList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            final EventBean bean = new EventBean(R.mipmap.music_event_activity, "钢琴直播课程", "12月5日晚8点直播！一起来参加！");
            newList.add(bean);
        }

        newActivityAdapter = new NewActivityAdapter(this, newList);
        mNewActivityRecycler.setAdapter(newActivityAdapter);

        ecentAdapter = new EcentAdapter(this, newList);
        mEventRecycler.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
        mEventRecycler.setAdapter(ecentAdapter);
        ecentAdapter.addListClick(new BaseAdapter.IListClick() {
            @Override
            public void itemClick(int pos) {

            }
        });
    }
}