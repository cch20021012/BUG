package com.example.gug.axl;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.bumptech.glide.Glide;
import com.example.gug.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OneToOneActivity extends AppCompatActivity {

    @BindView(R.id.banner)
    ImageView banner;
    @BindView(R.id.name1)
    TextView name1;
    @BindView(R.id.chooes1)
    TextView chooes1;
    @BindView(R.id.image1)
    ImageView image1;
    @BindView(R.id.cons1)
    ConstraintLayout cons1;
    @BindView(R.id.name2)
    TextView name2;
    @BindView(R.id.chooes2)
    TextView chooes2;
    @BindView(R.id.image2)
    ImageView image2;
    @BindView(R.id.cons2)
    ConstraintLayout cons2;
    @BindView(R.id.name3)
    TextView name3;
    @BindView(R.id.chooes3)
    TextView chooes3;
    @BindView(R.id.image3)
    ImageView image3;
    @BindView(R.id.cons3)
    ConstraintLayout cons3;
    @BindView(R.id.name4)
    TextView name4;
    @BindView(R.id.chooes4)
    TextView chooes4;
    @BindView(R.id.image4)
    ImageView image4;
    @BindView(R.id.cons4)
    ConstraintLayout cons4;
    @BindView(R.id.linear)
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_to_one);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        cons1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cons1.setBackgroundResource(R.drawable.onetoone);
                name1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                chooes1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_y);

                cons2.setBackgroundResource(R.drawable.axl_onetoone_n);
                name2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons3.setBackgroundResource(R.drawable.axl_onetoone_n);
                name3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons4.setBackgroundResource(R.drawable.axl_onetoone_n);
                name4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);
            }
        });
        cons2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cons1.setBackgroundResource(R.drawable.axl_onetoone_n);
                name1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons2.setBackgroundResource(R.drawable.onetoone);
                name2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                chooes2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_y);

                cons3.setBackgroundResource(R.drawable.axl_onetoone_n);
                name3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons4.setBackgroundResource(R.drawable.axl_onetoone_n);
                name4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);
            }
        });
        cons3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cons1.setBackgroundResource(R.drawable.axl_onetoone_n);
                name1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons2.setBackgroundResource(R.drawable.axl_onetoone_n);
                name2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons3.setBackgroundResource(R.drawable.onetoone);
                name3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                chooes3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_y);

                cons4.setBackgroundResource(R.drawable.axl_onetoone_n);
                name4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);
                popwindows();
            }
        });
        cons4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cons1.setBackgroundResource(R.drawable.axl_onetoone_n);
                name1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes1.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons2.setBackgroundResource(R.drawable.axl_onetoone_n);
                name2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes2.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons3.setBackgroundResource(R.drawable.axl_onetoone_n);
                name3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                chooes3.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.no));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_n);

                cons4.setBackgroundResource(R.drawable.onetoone);
                name4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                chooes4.setTextColor((ColorStateList) OneToOneActivity.this.getResources().getColorStateList(R.color.yes));
                Glide.with(OneToOneActivity.this).load(R.mipmap.ic_right_y);
            }
        });
    }

    private void popwindows() {

        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_item, null);
        PopupWindow popupWindow = new PopupWindow(inflate, 800, 400);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        setBackAphla(0.5f);
        popupWindow.showAtLocation(chooes1, Gravity.BOTTOM, 0, 0);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setBackAphla(1f);
            }
        });
    }
        public void setBackAphla(float alpha){
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.alpha=alpha;
            getWindow().setAttributes(attributes);
        }
    }
