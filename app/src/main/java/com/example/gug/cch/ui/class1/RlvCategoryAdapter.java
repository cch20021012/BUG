package com.example.gug.cch.ui.class1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class RlvCategoryAdapter extends BaseAdapter {
    public RlvCategoryAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.cch_zhibo_category_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        TextView tv_title = (TextView) vh.getViewById(R.id.tv_title);
        String str = (String) data;
        tv_title.setText(str);
    }
}
