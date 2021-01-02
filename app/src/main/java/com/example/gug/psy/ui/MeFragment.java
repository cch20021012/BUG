package com.example.gug.psy.ui;


import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class MeFragment extends BaseFragment implements View.OnClickListener{
    @BindView(R.id.me_img_voice)
    ImageView meImgVoice;
    @BindView(R.id.me_tv_name)
    TextView meTvName;
    @BindView(R.id.me_tv_photo)
    TextView meTvPhoto;
    @BindView(R.id.me_img_exit)
    ImageView meImgExit;
    @BindView(R.id.me_rl)
    RelativeLayout meRl;
    @BindView(R.id.me_img_set)
    ImageView meImgSet;
    @BindView(R.id.me_tv_set)
    TextView meTvSet;
    @BindView(R.id.me_img_note)
    ImageView meImgNote;
    @BindView(R.id.me_tv_note)
    TextView meTvNote;
    @BindView(R.id.me_img_class)
    ImageView meImgClass;
    @BindView(R.id.me_tv_class)
    TextView meTvClass;
    @BindView(R.id.me_img_work)
    ImageView meImgWork;
    @BindView(R.id.me_tv_work)
    TextView meTvWork;
    @BindView(R.id.me_img_right_work)
    ImageView meImgRightWork;
    @BindView(R.id.me_img_sport)
    ImageView meImgSport;
    @BindView(R.id.me_tv_sport)
    TextView meTvSport;
    @BindView(R.id.me_img_right_sport)
    ImageView meImgRightSport;
    @BindView(R.id.me_img_moeny)
    ImageView meImgMoeny;
    @BindView(R.id.me_tv_moeny)
    TextView meTvMoeny;
    @BindView(R.id.me_img_right_moeny)
    ImageView meImgRightMoeny;
    @BindView(R.id.me_img_parent)
    ImageView meImgParent;
    @BindView(R.id.me_tv_parent)
    TextView meTvParent;
    @BindView(R.id.me_img_right_parent)
    ImageView meImgRightParent;
    @BindView(R.id.me_img_nowchat)
    ImageView meImgNowchat;
    @BindView(R.id.me_tv_nowchat)
    TextView meTvNowchat;
    @BindView(R.id.me_img_right_nowchat)
    ImageView meImgRightNowchat;
    @BindView(R.id.me_img_setting)
    ImageView meImgSetting;
    @BindView(R.id.me_tv_setting)
    TextView meTvSetting;
    @BindView(R.id.me_img_right_setting)
    ImageView meImgRightSetting;

    @Override
    protected int getLayout() {
        return R.layout.layout_fargment_me;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        meImgRightWork.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.me_img_right_work, R.id.me_img_right_sport, R.id.me_img_right_moeny, R.id.me_img_right_parent, R.id.me_img_right_nowchat, R.id.me_img_right_setting})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.me_img_right_work:
                startActivity(new Intent(getContext(),WorkActivity.class));
                break;
            case R.id.me_img_right_sport:
                break;
            case R.id.me_img_right_moeny:
                startActivity(new Intent(getContext(),DiscountActivity.class));
                break;
            case R.id.me_img_right_parent:
                startActivity(new Intent(getContext(),ParentActivity.class));
                break;
            case R.id.me_img_right_nowchat:
                break;
            case R.id.me_img_right_setting:
                break;
        }
    }
}
