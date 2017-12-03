package com.example.it.travel_plan_project;

/**
 * Created by handongjun on 2017. 11. 24..
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;


public class Travel_Plan_Add extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_add);


        TabHost tabHost = findViewById(R.id.tabHost1);
        tabHost.setup();

        TabHost.TabSpec ts1 = tabHost.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.domestic_tab);
        ts1.setIndicator("국내");
        tabHost.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.oversea_tab);
        ts2.setIndicator("해외");
        tabHost.addTab(ts2);

        Button domestic_start = findViewById(R.id.domestic_start_button);
        Button domestic_destination = findViewById(R.id.domestic_destination_button);
        final Intent domestic = new Intent(this, Plan_Add_Domestic_Province.class);
        domestic_start.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic);
            }
        });
        domestic_destination.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic);
            }
        });

        //해외 버튼클릭
        Button oversea_start = findViewById(R.id.oversea_start_button);
        Button oversea_destination = findViewById(R.id.oversea_destination_button);
        Button oversea_Food = findViewById(R.id.oversea_Food_button);
        Button oversea_Room = findViewById(R.id.oversea_Rooms_button);
        //Button oversea_Carnival = findViewById(R.id.);

        final Intent oversea = new Intent(this, Plan_Add_Oversea_Country.class);
        final Intent oversea_foods = new Intent(this, Plan_Add_Oversea_Food.class);
        final Intent oversea_Rooms = new Intent(this, Plan_Add_Oversea_Rooms.class);

        oversea_start.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic);
            }
        });

        oversea_destination.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(oversea);
            }
        });

        oversea_Food.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(oversea_foods);
            }
        });

        oversea_Room.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(oversea_Rooms);
            }
        });

    }

}
