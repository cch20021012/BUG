package com.example.gug.axl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gug.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SettlementActivity extends AppCompatActivity {
    @BindView(R.id.button)
    TextView button;

    /**
     * 结算详情页面
     **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.axl_activity_settlement);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettlementActivity.this,PayActivity.class));
            }
        });
    }
}