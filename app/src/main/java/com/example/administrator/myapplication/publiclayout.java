package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/5/9.
 */
public class publiclayout extends LinearLayout implements View.OnClickListener {
    Button button;

    public publiclayout(Context context, AttributeSet attrs) { //被引用的时候，就会被调用。
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_layout, this);//加载子控件。
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ((Activity) getContext()).finish();
    }
}
