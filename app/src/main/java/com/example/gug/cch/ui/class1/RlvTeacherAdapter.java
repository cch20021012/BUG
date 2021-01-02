package com.example.gug.cch.ui.class1;

import android.content.Context;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class RlvTeacherAdapter extends BaseAdapter {
    public RlvTeacherAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.cch_zhibo_teacher;
    }

    @Override
    protected void bindData(Object data, VH vh) {

    }
}
