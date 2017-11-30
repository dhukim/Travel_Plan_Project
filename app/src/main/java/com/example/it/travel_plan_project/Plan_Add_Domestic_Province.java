package com.example.it.travel_plan_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by hu on 2017-11-26.
 */

public class Plan_Add_Domestic_Province extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_add_domestic_province);

        Button domestic1 = findViewById(R.id.domestic1);
        Button domestic2 = findViewById(R.id.domestic2);
        Button domestic3 = findViewById(R.id.domestic3);
        Button domestic4 = findViewById(R.id.domestic4);
        Button domestic5 = findViewById(R.id.domestic5);
        Button domestic6 = findViewById(R.id.domestic6);

        final Intent domestic_city = new Intent(this, Plan_Add_Domestic_City.class);

        domestic1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic_city);
            }
        });
        domestic2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic_city);
            }
        });
        domestic3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic_city);
            }
        });
        domestic4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic_city);
            }
        });
        domestic5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic_city);
            }
        });
        domestic6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic_city);
            }
        });
    }
}
