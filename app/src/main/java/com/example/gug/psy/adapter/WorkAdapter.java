package com.example.gug.psy.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;
import com.example.gug.psy.bean.WorkBean;

import java.util.List;

public class WorkAdapter extends BaseAdapter {
    private Context context;
    public WorkAdapter(Context context, List data) {
        super(context, data);
        this.context=context;
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.layout_adapter_work_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        WorkBean bean= (WorkBean) data;
        TextView name = (TextView) vh.getViewById(R.id.work_tv_name);
        TextView worknum = (TextView) vh.getViewById(R.id.work_tv_worknum);
        TextView workdata = (TextView) vh.getViewById(R.id.work_tv_data);
        name.setText(bean.getName());
        worknum.setText(bean.getClassNum());
        workdata.setText(bean.getData());
    }
}
