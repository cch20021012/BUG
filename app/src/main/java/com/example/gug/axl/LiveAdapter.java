package com.example.gug.axl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class LiveAdapter extends BaseAdapter {
    private Context con;
    private List<LiveStreamBean> livelist;

    public LiveAdapter(Context con, List<LiveStreamBean> livelist) {
        super(con,livelist);
        this.con = con;
        this.livelist = livelist;
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.axl_adapter_livestream;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        LiveStreamBean base= (LiveStreamBean) data;
        ImageView image = (ImageView) vh.getViewById(R.id.image);
        TextView title = (TextView) vh.getViewById(R.id.title);
        TextView name = (TextView) vh.getViewById(R.id.name);
        if (con!=null){

            Glide.with(con).load(R.mipmap.livesteam).into(image);
        }
        title.setText(base.getTitle());
        title.setText(base.getName());
    }
}
