package com.example.gug.psy.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseAdapter;
import com.example.gug.psy.bean.ParentBean;
import com.example.gug.zzx.LeaveActivity;

import java.util.Date;
import java.util.List;

public class ParentAdapter extends BaseAdapter {
    public ParentAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_parent;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ParentBean bean = (ParentBean) data;
        TextView tvCourseName = (TextView) vh.getViewById(R.id.tv_courseName);
        TextView tvProgress = (TextView) vh.getViewById(R.id.tv_progress);
        TextView tvProgressNow = (TextView) vh.getViewById(R.id.tv_progressNow);
        TextView btnLeave = (TextView) vh.getViewById(R.id.btn_leave);
        TextView tvTime = (TextView) vh.getViewById(R.id.tv_time);
        TextView tvTitle = (TextView) vh.getViewById(R.id.tv_title);
        TextView tvState = (TextView) vh.getViewById(R.id.tv_state);
        ProgressBar progressBar = (ProgressBar) vh.getViewById(R.id.progress_bar);

        tvCourseName.setText(bean.getCourseName());
        tvProgressNow.setText(bean.getProgress() + "%");
        tvState.setText("[" + bean.getState() + "]");
        tvTitle.setText("钢琴一对一培训");
        tvTime.setText(bean.getTime());
        progressBar.setProgress(bean.getProgress());

        btnLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, LeaveActivity.class));
            }
        });
    }
}
