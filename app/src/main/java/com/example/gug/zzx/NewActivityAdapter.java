package com.example.gug.zzx;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class NewActivityAdapter extends BaseAdapter {
    private List<EventBean> list;
    public NewActivityAdapter(Context context, List<EventBean> data) {


        super(context, data);
        this.list=data;
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_new_activity;
    }

    @Override
    protected void bindData(Object data, VH vh) {

        final ImageView imgBig = (ImageView) vh.getViewById(R.id.img_big);
        final TextView txt_title = (TextView) vh.getViewById(R.id.txt_title);
        final TextView txt_content = (TextView) vh.getViewById(R.id.txt_content);
        imgBig.setImageResource(list.get(0).getId());
        txt_title.setText(list.get(0).getTitle());
        txt_content.setText(list.get(0).getContent());
    }
}
