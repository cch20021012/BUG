package com.example.gug.axl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class OnetooneclassAdapter extends BaseAdapter {
    private Context context;
    private List<MusicBean> musiclist;

    public OnetooneclassAdapter(Context context, List<MusicBean> musiclist) {
        super(context,musiclist);
        this.context = context;
        this.musiclist = musiclist;
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.axl_adapter_music;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        MusicBean base= (MusicBean) data;
        ImageView image = (ImageView) vh.getViewById(R.id.image);
        if (context!=null){
        Glide.with(context).load(R.mipmap.music).into(image);
    }

    }
}
