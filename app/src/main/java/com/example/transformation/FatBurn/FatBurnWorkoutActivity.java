package com.example.transformation.FatBurn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.transformation.R;

public class FatBurnWorkoutActivity extends AppCompatActivity {

    private static final String TAG = "FatBurnWorkoutActivity";
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burn_workout);
        getSupportActionBar().hide();


        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            position = (int) bundle.get("index");
            Log.d(TAG, "pn-----> "+position);
        }



    }



}