package com.example.gug.axl;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.gug.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AskActivity extends AppCompatActivity {

    @BindView(R.id.study)
    TextView study;
    @BindView(R.id.ke)
    TextView ke;
    @BindView(R.id.dotted)
    View dotted;
    @BindView(R.id.teacher)
    TextView teacher;
    @BindView(R.id.cons1)
    ConstraintLayout cons1;
    @BindView(R.id.cons2)
    ConstraintLayout cons2;
    @BindView(R.id.time)
    TextView time;
    @BindView(R.id.cons3)
    ConstraintLayout cons3;
    @BindView(R.id.ask)
    TextView ask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.axl_activity_ask);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AskActivity.this, "疫情都来了 请什么假！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}