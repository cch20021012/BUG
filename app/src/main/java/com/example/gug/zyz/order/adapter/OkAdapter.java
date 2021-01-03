package com.example.gug.zyz.order.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;
import com.example.gug.zyz.order.bean.Score;

import java.util.List;

public class OkAdapter extends BaseAdapter {
    public OkAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.ok_adapter;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        Score score= (Score) data;
        TextView ok = (TextView) vh.getViewById(R.id.tv_ok);
        TextView time = (TextView) vh.getViewById(R.id.tv_time);
        TextView ten = (TextView) vh.getViewById(R.id.tv_10);

        ok.setText(score.getTitle());
        time.setText(score.getTime());
        ten.setText(score.getNum());

    }
}
