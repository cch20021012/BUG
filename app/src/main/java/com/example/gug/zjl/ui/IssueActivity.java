package com.example.gug.zjl.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gug.R;
import com.example.gug.zjl.adapter.MyExpandableListAdapter;

import java.util.ArrayList;


public class IssueActivity extends AppCompatActivity {

    private ExpandableListView mElvZjl;

    //数据
    String[] group =
            {"什么是土星？"};
    String[][] child = {
            {"践行以STEP-C阶梯创新教育体系为核心的理念/n，服务社会，坚持不懈地走科技与人文高度融合/n的中国素养教育创新之路，肩负培养中国青少年/n创新思维与创新能力的使命.土星文化的每一次/n创新与变革，只为给孩子带来更好的每一天/n深圳市致禾科技有限公司，只为给孩子带来更好/n的每一天。"}
    };

    private MyExpandableListAdapter myExpandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue);
        initView();
        listener();

    }


    private void initView() {
        mElvZjl = (ExpandableListView) findViewById(R.id.zjl_elv);
        //#TODO 去掉自带箭头，在一级列表中动态添加
//        mElvZjl.setGroupIndicator(null);

        int width = getWindowManager().getDefaultDisplay().getWidth();
        mElvZjl.setIndicatorBounds(width-100, width-0);
        myExpandableListAdapter = new MyExpandableListAdapter(group, child, this);
        mElvZjl.setAdapter(myExpandableListAdapter);

    }


    private void listener() {
        //设置一级列表的点击事件
        mElvZjl.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                Toast.makeText(IssueActivity.this, group[groupPosition], Toast.LENGTH_SHORT).show();
                //返回false 否则一级列表不会展开
                return false;
            }
        });

        //设置二级列表的点击事件
        mElvZjl.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(IssueActivity.this, child[groupPosition][childPosition], Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}