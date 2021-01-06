package com.example.gug.psy.ui;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.gug.R;
import com.example.gug.base.BaseFragment;
import com.example.gug.interfaces.IBasePresenter;
import com.example.gug.zjl.ui.navigation.CollectAtcivity;
import com.example.gug.zjl.ui.navigation.OrderformActivity;
import com.example.gug.zyz.ShezhiActivity;
import com.example.gug.zyz.customer.CustomerActivity;
import com.example.gug.zyz.order.ZOrderActivity;
import com.example.gug.zyz.personal.PersonalActivity;
import com.example.gug.zzx.HotActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MeFragment extends BaseFragment implements View.OnClickListener {
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
    @BindView(R.id.me_fragment_btn_more)
    Button meFragmentBtnMore;
    @BindView(R.id.two)
    ConstraintLayout two;
    @BindView(R.id.one)
    ConstraintLayout one;
    @BindView(R.id.me_collection)
    LinearLayout meCollection;
    @BindView(R.id.me_dingdan)
    LinearLayout meDingdan;
    @BindView(R.id.me_layout_work)
    RelativeLayout meLayoutWork;
    @BindView(R.id.me_layout_sport)
    RelativeLayout meLayoutSport;
    @BindView(R.id.me_layout_moeny)
    RelativeLayout meLayoutMoeny;
    @BindView(R.id.me_layout_parent)
    RelativeLayout meLayoutParent;
    @BindView(R.id.me_layout_nowchat)
    RelativeLayout meLayoutNowchat;
    @BindView(R.id.me_layout_setting)
    RelativeLayout meLayoutSetting;


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

    @OnClick({R.id.me_collection, R.id.me_dingdan, R.id.me_fragment_btn_more, R.id.me_img_exit, R.id.me_layout_work, R.id.me_layout_sport, R.id.me_layout_moeny, R.id.me_layout_parent, R.id.me_layout_nowchat, R.id.me_layout_setting})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.me_fragment_btn_more:
                //跳转到积分
                startActivity(new Intent(getContext(), ZOrderActivity.class));
                break;
            case R.id.me_img_exit:
                //个人信息
                startActivity(new Intent(getContext(), PersonalActivity.class));
                break;
            case R.id.me_layout_work:
                //我的作业
                startActivity(new Intent(getContext(), WorkActivity.class));
                break;
            case R.id.me_layout_sport:
                //我的活动
                startActivity(new Intent(getActivity(), HotActivity.class));
                break;
            case R.id.me_layout_moeny:
                //我的优惠券
                startActivity(new Intent(getContext(), DiscountActivity.class));
                break;
            case R.id.me_layout_parent:
                //家长专区
                startActivity(new Intent(getContext(), ParentActivity.class));
                break;
            case R.id.me_layout_nowchat:
                //在线客服
                startActivity(new Intent(getContext(), CustomerActivity.class));
                break;
            case R.id.me_layout_setting:
                //设置
                startActivity(new Intent(getContext(), ShezhiActivity.class));
                //startActivity(new Intent(getContext(), AboutActivity.class));
                break;

            case R.id.me_collection:
                startActivity(new Intent(getActivity(), CollectAtcivity.class));
                break;
            case R.id.me_dingdan:
                startActivity(new Intent(getActivity(), OrderformActivity.class));
                break;
        }
    }

}
