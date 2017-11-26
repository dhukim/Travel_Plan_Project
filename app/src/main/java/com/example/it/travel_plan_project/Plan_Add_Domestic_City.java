package com.example.it.travel_plan_project;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017-11-24.
 */
public class Plan_Add_Domestic_City extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_add_domestic_city);

        final LinearLayout lm = findViewById(R.id.cityLl);
        for(int i =0; i <5;i++){
            final Button btn = new Button(this);
            btn.setId(i + 1);
            btn.setText("" + (i + 1));
            btn.setWidth(80);
            lm.addView(btn);
        }
    }
}
