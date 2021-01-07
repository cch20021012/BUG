package com.example.gug.zzx;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gug.R;

public class RankingActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mTouBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        initView();
    }

    private void initView() {
        mTouBtn = (Button) findViewById(R.id.btn_tou);
        mTouBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tou:
                Toast.makeText(this, "投票成功", Toast.LENGTH_SHORT).show();
                finish();
                // TODO 21/01/07
                break;
            default:
                break;
        }
    }
}