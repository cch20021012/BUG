package com.example.gug.axl;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.zjl.ui.IssueActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomePageFragment extends BaseFragment {
    @BindView(R.id.teacherrecyclerview)
    RecyclerView teacherrecyclerview;
    @BindView(R.id.livestreamrecyclerview)
    RecyclerView livestreamrecyclerview;
    @BindView(R.id.freeclass)
    RecyclerView freeclass;
    @BindView(R.id.onetooneclass)
    RecyclerView onetooneclass;
    @BindView(R.id.imageclass)
    ImageView imageclass;
    private List<TeacherBean> teacherlist;
    private List<LiveStreamBean> livelist;
    private List<FreeClassBean> freeclasslist;
    private List<MusicBean> musiclist;

    @Override
    protected int getLayout() {
        return R.layout.axl_fragment_homepage;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    //    R.mipmap.teacher,"钢琴|声乐","李明宇"
    @Override
    protected void initView() {
        teacherlist = new ArrayList<>();
        livelist = new ArrayList<>();
        freeclasslist = new ArrayList<>();
        musiclist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TeacherBean teacherBean = new TeacherBean();
            teacherBean.setImage(R.mipmap.teacher);
            teacherBean.setTitle("钢琴|声乐");
            teacherBean.setName("李明宇");
            teacherlist.add(teacherBean);
        }
        for (int i = 0; i < 10; i++) {
            LiveStreamBean liveStreamBean = new LiveStreamBean();
            liveStreamBean.setImage(R.mipmap.livesteam);
            liveStreamBean.setTitle("声乐教学-免费讲60秒");
            liveStreamBean.setName("给你来一段巴赫小舞曲");
            livelist.add(liveStreamBean);
        }
        for (int i = 0; i < 10; i++) {
            FreeClassBean freeClassBean = new FreeClassBean();
            freeClassBean.setImage(R.mipmap.freeclass);
            freeClassBean.setName("妙妙5岁");
            freeClassBean.setTitle("给你来一段巴赫小舞曲");
            freeclasslist.add(freeClassBean);
        }
        for (int i = 0; i < 10; i++) {
            MusicBean musicBean = new MusicBean();
            musicBean.setImage(R.mipmap.music);
            musiclist.add(musicBean);
        }

        //跳转问题
        imageclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), IssueActivity.class));
            }
        });
    }

    @Override
    protected void initData() {
        teacherrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        TeacherAdapter teacherAdapter = new TeacherAdapter(getActivity(), teacherlist);
        teacherrecyclerview.setAdapter(teacherAdapter);
        teacherAdapter.notifyDataSetChanged();

        livestreamrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        LiveAdapter liveAdapter = new LiveAdapter(getActivity(), livelist);
        livestreamrecyclerview.setAdapter(liveAdapter);
        liveAdapter.notifyDataSetChanged();
        liveAdapter.addListClick(new BaseAdapter.IListClick() {
            @Override
            public void itemClick(int pos) {
                startActivity(new Intent(getActivity(), SettlementActivity.class));
            }
        });
        liveAdapter.addItemViewClick(new BaseAdapter.IItemViewClick() {
            @Override
            public void itemViewClick(int viewid, Object data) {
                startActivity(new Intent(getActivity(), SettlementActivity.class));
            }
        });

        freeclass.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        FreeclassAdapter freeclassAdapter = new FreeclassAdapter(getActivity(), freeclasslist);
        freeclass.setAdapter(freeclassAdapter);
        freeclassAdapter.notifyDataSetChanged();

        onetooneclass.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        OnetooneclassAdapter onetooneclassAdapter = new OnetooneclassAdapter(getActivity(), musiclist);
        onetooneclass.setAdapter(onetooneclassAdapter);
        onetooneclassAdapter.notifyDataSetChanged();
    }
}
