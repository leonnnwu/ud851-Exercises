package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }
}
