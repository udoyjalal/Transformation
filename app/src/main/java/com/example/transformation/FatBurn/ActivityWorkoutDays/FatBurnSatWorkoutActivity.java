package com.example.transformation.FatBurn.ActivityWorkoutDays;

import static android.view.View.GONE;

import static com.example.transformation.R.color.purple_500;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.transformation.DoneScreen;
import com.example.transformation.FatBurn.FatBurnDataModel;
import com.example.transformation.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class FatBurnSatWorkoutActivity extends AppCompatActivity {

    public static String TAG = "FatBurnSatWorkoutActivity";
    int position;
    GifImageView gifImageView;
    TextView textView;
    TextView setsView;

    private int seconds = 0;
    private int secondsStop = 0;
    private boolean running;
    private boolean wasRunning;
    int secs;

    ProgressBar mProgressBar;
    CountDownTimer mCountDownTimer;
    int i=0;

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

        TextView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        setsView = (TextView)findViewById(R.id.sets);
        setsView.setText("Set 1");

        gifImageView = findViewById(R.id.fatBurnWorkOutGif);
        textView = findViewById(R.id.fatBurnWorkOutTextView);

        if(position == 0){
            gifImageView.setBackgroundResource(R.drawable.fit);
            textView.setText(R.string.content);
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


        mProgressBar=(ProgressBar)findViewById(R.id.progressbar);
        mProgressBar.setVisibility(GONE);
        mProgressBar.setProgress(i);
        mCountDownTimer=new CountDownTimer(10000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.v("Log_tag", "Tick of Progress"+ i+ millisUntilFinished);
                i++;
                mProgressBar.setProgress((int)i*100/(10000/100));
            }
            @Override
            public void onFinish() {
                //Do what you want
                i++;
                mProgressBar.setProgress(100);
                    mProgressBar.setVisibility(GONE);
                    running = true;
                    i = 0;
                seconds = 0;
            }
        };

        //stop watch
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();

    }
    @Override
    public void onSaveInstanceState(
            Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }

    public void onClickStart(View view)
    {
        running = true;
        seconds = 0;
        secondsStop = 0;
        setsView.setText("Set 1");
    }

    public void onClickStop(View view)
    {
            running = false;
    }

    public void onClickReset(View view)
    {
        running = false;
        mProgressBar.setVisibility(GONE);
        seconds = 0;
        secondsStop = 0;
        setsView.setText("Set 1");

    }
    private void runTimer()
    {
        final TextView timeView = (TextView)findViewById(R.id.time_view);

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run()
            {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                secs = seconds % 60;

                String time
                        = String
                        .format(Locale.getDefault(),
                                "%d:%02d:%02d", hours,
                                minutes, secs);

                timeView.setText(time);

                    if (running) {
                        seconds++;
                        secondsStop++;

                         if(secondsStop == 30 && seconds == 10){
                            running = false;
                            seconds = 0;
                            mProgressBar.setVisibility(GONE);

                        }

                        else if(seconds == 10 ){
                            running = false;
                            mProgressBar.setVisibility(View.VISIBLE);
                            mCountDownTimer.start();
                        }

                    }

                if (secondsStop == 11){
                    setsView.setText("Set 2");
                }
                else if (secondsStop == 21){
                    setsView.setText("Set 3");
                }

                handler.postDelayed(this, 1000);
            }
        });
    }




}