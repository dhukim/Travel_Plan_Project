package com.example.it.travel_plan_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lee on 2017-12-03.
 */

public class Travel_Plan_Delete extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_delete);

        final Intent intent = new Intent(this, Travel_Plan_View.class);
        Button plan_delete = findViewById(R.id.delete);
        Button delete_cancel = findViewById(R.id.delete_cancel);

        plan_delete.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        delete_cancel.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
