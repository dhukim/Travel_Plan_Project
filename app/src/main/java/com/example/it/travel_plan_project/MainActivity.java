package com.example.it.travel_plan_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button login = (Button) findViewById(R.id.login_button);
        Button sign = (Button) findViewById(R.id.login_sign_button);

        login.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                setContentView(R.layout.plan_view);
            }
        });

        sign.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                setContentView(R.layout.signup);
            }
        });
    }
}
