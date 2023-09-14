package com.example.transformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.transformation.FatBurn.FatBurnListActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout fatBurnLayout, calorieCountLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        calorieCountLayout = findViewById(R.id.layoutCalorieCount);
        calorieCountLayout.setClickable(true);
        calorieCountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalorieCountActivity.class);
                startActivity(intent);
            }
        });

        fatBurnLayout = findViewById(R.id.layoutBiceps);
        fatBurnLayout.setClickable(true);

        fatBurnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FatBurnListActivity.class);
                startActivity(intent);
            }
        });
    }
}