package com.example.gug.zzx;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gug.R;

import java.util.Calendar;

public class LeaveActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mShenqingLl;

    int mYear, mMonth, mDay;
    TextView dateDisplay;
    final int DATE_DIALOG = 1;
    private ImageView mCancelImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);
        initView();
    }

    private void initView() {
        mShenqingLl = (LinearLayout) findViewById(R.id.ll_shenqing);
        dateDisplay = (TextView) findViewById(R.id.txt_time);
        mShenqingLl.setOnClickListener(this);
        final Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);
        mCancelImg = (ImageView) findViewById(R.id.img_cancel);
        mCancelImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_shenqing:
                // TODO 21/01/07
                showDialog(DATE_DIALOG);
                break;
            case R.id.img_cancel:// TODO 21/01/07
                finish();
                break;
            default:
                break;
        }
    }

    /**
     * 设置日期 利用StringBuffer追加
     */
    public void display() {
        dateDisplay.setText(new StringBuffer().append(mYear).append("-").append(mMonth + 1).append("-").append(mDay).append(" "));
    }

    private DatePickerDialog.OnDateSetListener mdateListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            mYear = year;
            mMonth = monthOfYear;
            mDay = dayOfMonth;
            display();
        }
    };

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG:
                return new DatePickerDialog(this, mdateListener, mYear, mMonth, mDay);
        }
        return null;
    }


}