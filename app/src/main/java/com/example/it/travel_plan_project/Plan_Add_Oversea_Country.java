package com.example.it.travel_plan_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by handongjun on 2017. 11. 26..
 */


public class Plan_Add_Oversea_Country extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_add_oversea_country);

        Button oversea1 = findViewById(R.id.oversea1);
        Button oversea2 = findViewById(R.id.oversea2);
        Button oversea3 = findViewById(R.id.oversea3);
        Button oversea4 = findViewById(R.id.oversea4);
        Button oversea5 = findViewById(R.id.oversea5);
        Button oversea6 = findViewById(R.id.oversea6);
        Button oversea7 = findViewById(R.id.oversea7);
        Button oversea8 = findViewById(R.id.oversea8);

        final Intent oversea = new Intent(this, Plan_Add_Domestic_City.class);
        oversea1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(oversea);
            }
        });

    }
}
