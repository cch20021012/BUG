package com.example.gug.axl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class FreeclassAdapter extends BaseAdapter {
    private Context context;
    private List<FreeClassBean> livelist;

    public FreeclassAdapter(Context context, List<FreeClassBean> livelist) {
        super(context,livelist);
        this.context = context;
        this.livelist = livelist;
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.axl_adapter_freeclass;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        FreeClassBean base= (FreeClassBean) data;
        ImageView image = (ImageView) vh.getViewById(R.id.image);
        TextView title = (TextView) vh.getViewById(R.id.title);
        TextView name = (TextView) vh.getViewById(R.id.name);
        if (context!=null){

            Glide.with(context).load(R.mipmap.freeclass).into(image);
        }
        title.setText(base.getTitle());
        title.setText(base.getName());
    }
}
