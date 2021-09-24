package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import helloconstraint.R;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view) {
        mCount++;
        if(mShowCount != null)
        {
            mShowCount.setText(Integer.toString(mCount));
        }
        if((mCount % 2) == 0)
        {
            view.setBackgroundColor(Color.MAGENTA);
        }
        else
        {
            view.setBackgroundColor(Color.rgb(100, 255, 100));
        }
        findViewById(R.id.make0).setBackgroundColor(Color.GRAY);
    }

    public void setZero(View view) {
        mCount = 0;
        if (mShowCount != null)
        {
            mShowCount.setText(Integer.toString(mCount));
        }
       view.setBackgroundColor(Color.rgb(255, 100, 100));
    }
}