package com.example.transformation.FatBurn.ActivityWorkoutDays;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.transformation.FatBurn.FatBurnDataModel;
import com.example.transformation.R;

import pl.droidsonroids.gif.GifImageView;

public class FatBurnSatWorkoutActivity extends AppCompatActivity {

    public static String TAG = "FatBurnSatWorkoutActivity";
    int position;
    GifImageView gifImageView;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burn_sat_workout);
        getSupportActionBar().hide();

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            position = (int) bundle.get("index");
            Log.d(TAG, ">>>>>>>>> "+ position);
        }

        gifImageView = findViewById(R.id.fatBurnWorkOutGif);
        textView = findViewById(R.id.fatBurnWorkOutTextView);

        //stop watch







        if(position == 0){
            gifImageView.setBackgroundResource(R.drawable.fit);
            textView.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
        else if(position == 1){
            gifImageView.setBackgroundResource(R.drawable.concentrated);
            textView.setText("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");

        }
        else if(position == 2){
            gifImageView.setBackgroundResource(R.drawable.concentrated);
            textView.setText("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");

        }
        else if(position == 3){
            gifImageView.setBackgroundResource(R.drawable.concentrated);
            textView.setText("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");

        }
        else if(position == 4){
            gifImageView.setBackgroundResource(R.drawable.concentrated);
            textView.setText("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");

        }
        else if(position == 5){
            gifImageView.setBackgroundResource(R.drawable.concentrated);
            textView.setText("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");

        }



    }
}