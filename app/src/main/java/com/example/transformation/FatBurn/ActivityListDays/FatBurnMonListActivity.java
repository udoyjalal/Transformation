package com.example.transformation.FatBurn.ActivityListDays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.transformation.R;

public class FatBurnMonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burn_mon_list);
        getSupportActionBar().hide();

    }
}