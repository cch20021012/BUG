package com.example.gug.zzx;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class EcentAdapter extends BaseAdapter {

    public EcentAdapter(Context context, List<EventBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_event;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        EventBean bean= (EventBean) data;
        final ImageView imgBig = (ImageView) vh.getViewById(R.id.img_big);
        final TextView txt_title = (TextView) vh.getViewById(R.id.txt_title);
        final TextView txt_content = (TextView) vh.getViewById(R.id.txt_content);
        imgBig.setImageResource(bean.getId());
        txt_title.setText(bean.getTitle());
        txt_content.setText(bean.getContent());


    }
}
