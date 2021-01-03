package com.example.gug.axl;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.gug.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IdentityActivity extends AppCompatActivity {

    @BindView(R.id.axl_student)
    ImageView axlStudent;
    @BindView(R.id.axl_teacher)
    ImageView axlTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.axl_activity_identity);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {

    }
}