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

        final Intent C_Plan_Add = new Intent(this, Travel_Plan_Add.class);
        final Intent C_Plan_Delete = new Intent(this, Travel_Plan_Delete.class);
        final Intent C_Plan_Change = new Intent(this, Travel_Plan_Modified.class);
        Button B_Plan_Add = findViewById(R.id.plan_add);
        Button B_Plan_Delete = findViewById(R.id.plan_del);
        Button B_Plan_Change = findViewById(R.id.plan_change);

        B_Plan_Add.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(C_Plan_Add);
            }
        });

        B_Plan_Delete.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(C_Plan_Add);  // 수정 필요한 부분
            }
        });

        B_Plan_Change.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(C_Plan_Add);  // 수정 필요한 부분
            }
        });
    }
}
