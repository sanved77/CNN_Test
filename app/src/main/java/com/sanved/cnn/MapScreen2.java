package com.sanved.cnn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sanved on 03-06-2018.
 */

public class MapScreen2 extends AppCompatActivity {

    TextView tvRes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_screen2);

        tvRes = findViewById(R.id.tvRes);

    }

}
