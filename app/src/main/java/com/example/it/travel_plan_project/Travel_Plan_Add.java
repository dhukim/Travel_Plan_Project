package com.example.it.travel_plan_project;

/**
 * Created by handongjun on 2017. 11. 24..
 */

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
import dbconnect.AddRequest;
import dbconnect.RegisterRequest;


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

        final Button domestic_start = findViewById(R.id.domestic_start_button);
        final Button domestic_destination = findViewById(R.id.domestic_destination_button);
        final Button domestic_Food = findViewById(R.id.domestic_Food_button);
        final Button domestic_Rooms = findViewById(R.id.domestic_Rooms_button);
        final Button domestic_Add = findViewById(R.id.domestic_Add_button);
        final Button domestic_Cancel = findViewById(R.id.domestic_Cancel_button);

        final EditText domestic_start_text = (EditText) findViewById(R.id.domestic_start_text);
        final EditText domestic_destination_text = (EditText) findViewById(R.id.domestic_destination_text);
        final EditText domestic_startDate_text = (EditText) findViewById(R.id.domestic_startDate_text);
        final EditText domestic_endDate_text = (EditText) findViewById(R.id.domestic_endDate_text);
        final EditText domestic_Food_text = (EditText) findViewById(R.id.domestic_Food_text);
        final EditText domestic_Rooms_Text = (EditText) findViewById(R.id.domestic_Rooms_Text);

        final Intent domestic = new Intent(this, Plan_Add_Domestic_Province.class);
        final Intent plan_view = new Intent(this, Travel_Plan_View.class);

        domestic_start.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(domestic);
            }
        });
        domestic_destination.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {startActivity(domestic);
            }
        });
        domestic_Add.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userid = "test";
                String start = domestic_start_text.getText().toString();
                String destination = domestic_destination_text.getText().toString();
                String start_date = domestic_startDate_text.getText().toString();
                String finish_date = domestic_endDate_text.getText().toString();
                String rooms = domestic_Rooms_Text.getText().toString();
                String course = domestic_Food_text.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Travel_Plan_Add.this);
                                builder.setMessage("여행계획 등록 완료")
                                        .setPositiveButton("확인", null)
                                        .create()
                                        .show();
                                Intent intent = new Intent(Travel_Plan_Add.this, MainActivity.class);
                                Travel_Plan_Add.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Travel_Plan_Add.this);
                                builder.setMessage("여행계획 등록 실패")
                                        .setNegativeButton("다시 시도", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                AddRequest addRequest = new AddRequest(userid, start, destination, start_date, finish_date, rooms, course, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Travel_Plan_Add.this);
                queue.add(addRequest);
            }
        });
        domestic_Cancel.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(plan_view);
            }
        });

        final EditText oversea_start_text = (EditText) findViewById(R.id.oversea_start_text);
        final EditText oversea_destination_Text = (EditText) findViewById(R.id.oversea_destination_Text);
        final EditText oversea_startDate_text = (EditText) findViewById(R.id.oversea_startDate_text);
        final EditText oversea_endDate_text = (EditText) findViewById(R.id.oversea_endDate_text);
        final EditText oversea_Food_Text = (EditText) findViewById(R.id.oversea_Food_Text);
        final EditText oversea_Rooms_Text = (EditText) findViewById(R.id.oversea_Rooms_Text);

        //해외 버튼클릭
        final Button oversea_start = findViewById(R.id.oversea_start_button);
        Button oversea_destination = findViewById(R.id.oversea_destination_button);
        Button oversea_Food = findViewById(R.id.oversea_Food_button);
        Button oversea_Room = findViewById(R.id.oversea_Rooms_button);
        Button oversea_Add = findViewById(R.id.oversea_Add_button);
        Button oversea_Cancel = findViewById(R.id.oversea_Cancel_button);

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
            public void onClick(View view) {startActivity(oversea);}});
        oversea_Food.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {startActivity(oversea_foods);
            }
        });
        oversea_Room.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {startActivity(oversea_Rooms);
            }
        });
        oversea_Add.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view) {
                String userid = "test";
                String start = oversea_start_text.getText().toString();
                String destination = oversea_destination_Text.getText().toString();
                String start_date = oversea_startDate_text.getText().toString();
                String finish_date = oversea_endDate_text.getText().toString();
                String rooms = oversea_Rooms_Text.getText().toString();
                String course = oversea_Food_Text.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Travel_Plan_Add.this);
                                builder.setMessage("여행계획 등록 완료")
                                        .setPositiveButton("확인", null)
                                        .create()
                                        .show();
                                Intent intent = new Intent(Travel_Plan_Add.this, MainActivity.class);
                                Travel_Plan_Add.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Travel_Plan_Add.this);
                                builder.setMessage("여행계획 등록 실패")
                                        .setNegativeButton("다시 시도", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                AddRequest addRequest = new AddRequest(userid, start, destination, start_date, finish_date, rooms, course, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Travel_Plan_Add.this);
                queue.add(addRequest);
            }
        });
        oversea_Cancel.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {startActivity(plan_view);
            }
        });
    }

}
