package com.example.gug.axl;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.gug.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.code)
    TextView code;
    @BindView(R.id.a)
    TextView a;
    @BindView(R.id.mima)
    TextView mima;
    @BindView(R.id.light)
    ImageView light;
    @BindView(R.id.vc2)
    TextView vc2;
    @BindView(R.id.iphone)
    ImageView iphone;
    @BindView(R.id.baliu)
    TextView baliu;
    @BindView(R.id.b)
    TextView b;
    @BindView(R.id.conos1)
    ConstraintLayout conos1;
    @BindView(R.id.key)
    ImageView key;
    @BindView(R.id.vc)
    TextView vc;
    @BindView(R.id.conos2)
    ConstraintLayout conos2;
    @BindView(R.id.login)
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        code.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                code.setTextColor(R.color.black);
                mima.setTextColor(R.color.grey);
                light.setVisibility(View.VISIBLE);
                vc2.setVisibility(View.VISIBLE);
                vc.setVisibility(View.VISIBLE);
            }
        });
        mima.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                mima.setTextColor(R.color.black);
                code.setTextColor(R.color.grey);
                light.setVisibility(View.GONE);
                vc2.setVisibility(View.GONE);
                vc.setVisibility(View.GONE);
            }
        });
    }
}