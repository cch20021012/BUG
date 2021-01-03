package com.example.gug.psy.ui;

import android.Manifest;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gug.R;
import com.github.dfqin.grantor.PermissionListener;
import com.github.dfqin.grantor.PermissionsUtil;

import java.security.Permissions;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TelActivity extends AppCompatActivity {

    @BindView(R.id.btn_tel)
    Button btnTel;
    private Button mCancleBtn;
    private Button mImmediatelyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);
        PermissionsUtil.requestPermission(this, new PermissionListener() {
            @Override
            public void permissionGranted(@NonNull String[] permission) {

                Toast.makeText(TelActivity.this, "授权成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void permissionDenied(@NonNull String[] permission) {
                Toast.makeText(TelActivity.this, "授权失败", Toast.LENGTH_SHORT).show();
            }
        }, Manifest.permission.CALL_PHONE);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_tel)
    public void onViewClicked() {
        View view = LayoutInflater.from(this).inflate(R.layout.tle_item, null);
        PopupWindow popupWindow = new PopupWindow(view, 900, ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        mCancleBtn =view.findViewById(R.id.btn_cancle);
        mCancleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        mImmediatelyBtn =view.findViewById(R.id.btn_immediately);
        mImmediatelyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //跳转到拨号界面
//                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + 111111111));
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
                Intent intent= new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+1111111));
                startActivity(intent);

            }
        });
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }




}