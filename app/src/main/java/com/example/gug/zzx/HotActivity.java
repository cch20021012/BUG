package com.example.gug.zzx;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.gug.R;
import com.example.gug.axl.SettlementActivity;
import com.example.gug.zjl.ui.navigation.OrderformActivity;
import com.example.gug.zyz.customer.CustomerActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class HotActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img;
    private TextView price2;
    private TabLayout mTab;
    private RecyclerView mRecycler;
    private Button mShopBtn;
    private Xilie2Adapter xilie2Adapter;
    private NestedScrollView mCon;
    private LinearLayout mLlBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot);
        initView();
    }

    private void initView() {
        img = (ImageView) findViewById(R.id.img);
        price2 = (TextView) findViewById(R.id.price2);

        SpannableString sp = new SpannableString(price2.getText().toString());
        sp.setSpan(new StrikethroughSpan(), 0, price2.getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        price2.setText(sp);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mTab = (TabLayout) findViewById(R.id.tab);


        mRecycler = (RecyclerView) findViewById(R.id.recycler);
        mShopBtn = (Button) findViewById(R.id.btn_shop);
        mShopBtn.setOnClickListener(this);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            objects.add("qq");
        }
        xilie2Adapter = new Xilie2Adapter(this, objects);
        mRecycler.setAdapter(xilie2Adapter);
        mCon = (NestedScrollView) findViewById(R.id.con);
        mLlBtn = (LinearLayout) findViewById(R.id.btn_ll);
        mLlBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_shop:
                // TODO 21/01/07
                pop();
                break;
            case R.id.btn_ll:// TODO 21/01/07
                startActivity(new Intent(HotActivity.this, CustomerActivity.class));
                break;
            default:
                break;
        }
    }

    public void pop() {
        View root = LayoutInflater.from(HotActivity.this).inflate(R.layout.item_pop, null);
        PopupWindow popupWindow = new PopupWindow(root, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        TextView price2 = root.findViewById(R.id.price2);
        Button btn = root.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HotActivity.this, SettlementActivity.class));
            }
        });

        SpannableString sp = new SpannableString(price2.getText().toString());
        sp.setSpan(new StrikethroughSpan(), 0, price2.getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        price2.setText(sp);
        popupWindow.showAtLocation(mCon, Gravity.BOTTOM, 0, 0);
    }
}