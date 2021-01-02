package com.example.gug.zyz;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class SheAdapter extends BaseAdapter {
    public SheAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.zyz_rlv_she_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        TextView tv_name = (TextView) vh.getViewById(R.id.tv_name);
        String str = (String) data;
        tv_name.setText(str);
    }
}
