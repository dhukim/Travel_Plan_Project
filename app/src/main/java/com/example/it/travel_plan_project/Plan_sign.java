package com.example.it.travel_plan_project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import dbconnect.RegisterRequest;

/**
 * Created by Administrator on 2017-11-24.
 */

public class Plan_sign extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        final EditText idText = (EditText) findViewById(R.id.sign_id_editText);
        final EditText passwordText1 = (EditText) findViewById(R.id.sign_pass1_editText);
        final EditText passwordText2 = (EditText) findViewById(R.id.sign_pass2_editText);
        final Button registerButton = (Button) findViewById(R.id.sign_ok_btn);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userID = idText.getText().toString();
                String userPassword = passwordText1.getText().toString();
                String userpassword2 = passwordText2.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Plan_sign.this);
                                builder.setMessage("회원 등록 완료")
                                        .setPositiveButton("확인", null)
                                        .create()
                                        .show();
                                Intent intent = new Intent(Plan_sign.this, MainActivity.class);
                                Plan_sign.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Plan_sign.this);
                                builder.setMessage("회원 등록 실패")
                                        .setNegativeButton("다시 시도", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(userID, userPassword, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Plan_sign.this);
                queue.add(registerRequest);
            }
        });
    }
}
