package com.example.it.travel_plan_project;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by handongjun on 2017. 11. 26..
 */

public class Plan_Add_Oversea_Rooms extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_add_oversea_rooms);

        final LinearLayout O_Rooms_list = findViewById(R.id.o_roomsL);
       for(int i =0; i <5;i++){
            final Button btn = new Button(this);
            btn.setId(i + 1);
            btn.setText("" + (i + 1));
            btn.setWidth(80);
            O_Rooms_list.addView(btn);
        }
    }
}
