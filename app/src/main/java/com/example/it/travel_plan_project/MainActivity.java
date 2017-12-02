package com.example.it.travel_plan_project;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import dbconnect.LoginRequest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        final Intent loginIntent = new Intent(this, Plan_View.class);
        final Intent signIntent = new Intent(this, Plan_sign.class);
        final Button login = findViewById(R.id.login_button);
        final Button sign = findViewById(R.id.login_sign_button);
        final EditText idText = (EditText) findViewById(R.id.login_email);
        final EditText passwordText = (EditText) findViewById(R.id.login_password);

        login.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                final String userid = idText.getText().toString();
                final String passwd = passwordText.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success) {
                                String userid = jsonResponse.getString("userid");
                                String passwd = jsonResponse.getString("passwd");
                                Intent intent = new Intent(MainActivity.this, Plan_View.class);
                                intent.putExtra("userid", userid);
                                intent.putExtra("passwd", passwd);
                                MainActivity.this.startActivity(intent);
                            }
                            else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setMessage("로그인에 실패하였습니다.")
                                        .setNegativeButton("다시 시도", null)
                                        .create()
                                        .show();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };

                LoginRequest loginRequest = new LoginRequest(userid, passwd, responseListener);
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                queue.add(loginRequest);
            }
        });

        sign.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(signIntent);
            }
        });
    }
}
