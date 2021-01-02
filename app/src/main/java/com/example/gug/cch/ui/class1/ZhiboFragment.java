package com.example.gug.cch.ui.class1;

import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class ZhiboFragment extends BaseFragment {
    @BindView(R.id.rlv_category)
    RecyclerView rlvCategory;
    @BindView(R.id.tv_teacher)
    TextView tvTeacher;
    @BindView(R.id.rlv_teacher)
    RecyclerView rlvTeacher;
    private RlvCategoryAdapter rlvCategoryAdapter;
    private RlvTeacherAdapter rlvTeacherAdapter;

    @Override
    protected int getLayout() {
        return R.layout.cch_fragment_zhibo;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        ArrayList<String> listcategory = new ArrayList<>();
        listcategory.add("基础乐理");
        listcategory.add("视唱练耳");
        listcategory.add("和声写作");
        listcategory.add("表现音乐");
        listcategory.add("节奏");
        listcategory.add("音乐欣赏");
        rlvCategoryAdapter = new RlvCategoryAdapter(getActivity(),listcategory);
        rlvCategory.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rlvCategory.setAdapter(rlvCategoryAdapter);

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <6; i++) {
            strings.add("qq");
        }
        rlvTeacherAdapter = new RlvTeacherAdapter(getActivity(),strings);
        rlvTeacher.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        rlvTeacher.setAdapter(rlvTeacherAdapter);
    }

    @Override
    protected void initData() {

    }
}
