package com.example.gug.axl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.example.gug.R;
import com.example.gug.base.BaseActivity;
import com.example.gug.base.BaseAdapter;
import com.example.gug.interfaces.IBasePresenter;

import java.util.List;

public class TeacherAdapter extends BaseAdapter {
    private Context context;
    private List<TeacherBean> teacherlist;

    public TeacherAdapter(Context context, List<TeacherBean> teacherlist) {
        super(context,teacherlist);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.axl_adapter_teacher;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        TeacherBean base= (TeacherBean) data;
        ImageView image = (ImageView) vh.getViewById(R.id.image);
        TextView title = (TextView) vh.getViewById(R.id.title);
        TextView name = (TextView) vh.getViewById(R.id.name);
        if (context!=null){
        Glide.with(context).load(R.mipmap.teacher).into(image);
        }
        title.setText(base.getTitle());
        name.setText(base.getName());
    }
}
