package com.example.it.travel_plan_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        final Intent loginIntent = new Intent(this, Plan_View.class);
        final Intent signIntent = new Intent(this, Plan_sign.class);
        Button login = (Button) findViewById(R.id.login_button);
        Button sign = (Button) findViewById(R.id.login_sign_button);

        login.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(loginIntent);
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
