package com.example.transformation.FatBurn.ActivityWorkoutDays;

import static android.view.View.GONE;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.transformation.DoneScreen;
import com.example.transformation.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class FatBurnThurWorkoutActivity extends AppCompatActivity {
    public static String TAG = "FatBurnSatWorkoutActivity";
    int position;
    GifImageView gifImageView;
    TextView textView, title;
    TextView setsView;

    private int seconds = 0;
    private int secondsStop = 0;
    private boolean running;
    private boolean wasRunning;
    int secs;

    ProgressBar mProgressBar;
    CountDownTimer mCountDownTimer;
    int i=0;
    private SharedPreferences prefs, sherdHelp2;
    MediaPlayer soundPlayer;


    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burn_thur_workout);
        Bundle bundle = getIntent().getExtras();
        // Hide the action bar
        getSupportActionBar().hide();

        // Hide the status bar.
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Hide the navigation bar
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        if(bundle != null){
            position = (int) bundle.get("index");
            Log.d(TAG, ">>>>>>>>> "+ position);
        }

        soundPlayer = MediaPlayer.create(this, R.raw.beep_1);


//        sherdHelp2 = PreferenceManager.getDefaultSharedPreferences(this);
//
//        if (sherdHelp2.getBoolean("b", true)) {
//            Intent intent = new Intent(FatBurnSatWorkoutActivity.this, DoneScreen.class);
//            startActivity(intent);
//        }


        TextView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                running = false;
                mCountDownTimer.onFinish();
                soundPlayer.stop();
                finish();
            }
        });



        setsView = (TextView)findViewById(R.id.sets);
        setsView.setText("Set 1");

        gifImageView = findViewById(R.id.fatBurnWorkOutGif);
        textView = findViewById(R.id.fatBurnWorkOutTextView);
        textView.setTextSize(14);

        title = (TextView)findViewById(R.id.fatBurnWorkOutTitle);
        title.setTextSize(20);
        title.setTypeface(Typeface.DEFAULT_BOLD);



        if(position == 0){
            gifImageView.setBackgroundResource(R.drawable.squats);
            textView.setText(R.string.pushups);
            title.setText("SQUATS");

        }
        else if(position == 1){
            gifImageView.setBackgroundResource(R.drawable.jumping_jacks);
            textView.setText(R.string.jumpingjacks);
            title.setText("JUMPING JACKS");
        }
        else if(position == 2){
            gifImageView.setBackgroundResource(R.drawable.reverse_crunches);
            textView.setText(R.string.reversecrunches);
            title.setText("REVERSE CRUNCHES");
        }
        else if(position == 3){
            gifImageView.setBackgroundResource(R.drawable.plank);
            textView.setText(R.string.plank);
            title.setText("PLANK");
        }
        else if(position == 4){
            gifImageView.setBackgroundResource(R.drawable.cobra_stretch);
            textView.setText(R.string.cobrastretch);
            title.setText("COBRA STRETCH");
        }
        else if(position == 5){
            gifImageView.setBackgroundResource(R.drawable.long_arm_crunches);
            textView.setText(R.string.longarmcrunches);
            title.setText("LONG ARM CRUNCHES");
        }
        else if(position == 6){
            gifImageView.setBackgroundResource(R.drawable.leg_raises);
            textView.setText(R.string.legraises);
            title.setText("LEG RAISES");
        }
        else if(position == 7){
            gifImageView.setBackgroundResource(R.drawable.butt_bridge);
            textView.setText(R.string.buttbridge);
            title.setText("BUTT BRIDGE");
        }
        else if(position == 8){
            gifImageView.setBackgroundResource(R.drawable.v_up);
            textView.setText(R.string.vup);
            title.setText("V UP");
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
                        soundPlayer.start();
                        seconds = 0;
                        mProgressBar.setVisibility(GONE);
                        Intent intent = new Intent(FatBurnThurWorkoutActivity.this, DoneScreen.class);
                        startActivity(intent);

                    }

                    else if(seconds == 10 ){
                        running = false;
                        soundPlayer.start();
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        running = false;
        mCountDownTimer.onFinish();
        soundPlayer.stop();
        finish();
    }
}