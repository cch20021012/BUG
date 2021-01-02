package com.example.gug.cch.ui.class1;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gug.R;
import com.example.gug.base.BaseAdapter;

import java.util.List;

public class XilieAdapter extends BaseAdapter {
    public XilieAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.cch_xilie_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        TextView tv_price_no = (TextView) vh.getViewById(R.id.tv_price_no);
        tv_price_no.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG);
        ImageView img_pic = (ImageView) vh.getViewById(R.id.img_pic);
    }
}
