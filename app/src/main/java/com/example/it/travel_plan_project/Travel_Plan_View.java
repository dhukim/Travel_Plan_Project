package com.example.it.travel_plan_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017-11-24.
 */

public class Travel_Plan_View extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_view);

        final Intent C_Plan_Add = new Intent(this, Plan_Add.class);

        Button B_Plan_Add = findViewById(R.id.plan_add);

        B_Plan_Add.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(C_Plan_Add);
            }
        });

    }
}
