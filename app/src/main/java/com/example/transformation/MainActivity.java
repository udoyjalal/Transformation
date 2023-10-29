package com.example.transformation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.transformation.FatBurn.FatBurnListActivity;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    LinearLayout fatBurnLayout, heightAndWeightList, calorieCountLayout;
   // SliderView sliderView;
   ImageView imageView_1,imageView_2, imageView_3, imageView_4;
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 50;
    final long PERIOD_MS = 2500;
    int count = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide the action bar
        getSupportActionBar().hide();

        // Hide the status bar.
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Hide the navigation bar
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        fatBurnLayout = findViewById(R.id.layoutBiceps);
        fatBurnLayout.setClickable(true);

        imageView_1 = findViewById(R.id.img1);
        imageView_2 = findViewById(R.id.img2);
        imageView_3 = findViewById(R.id.img3);
        imageView_4 = findViewById(R.id.img4);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {

                if (currentPage == 0) {
                    one();
                    currentPage++;
                } else if (currentPage == 1) {
                    two();
                    currentPage++;
                } else if (currentPage == 2) {
                    three();
                    currentPage++;
                } else if (currentPage == 3) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 4) {
                    one();
                    currentPage++;
                } else if (currentPage == 5) {
                    two();
                    currentPage++;
                } else if (currentPage == 6) {
                    three();
                    currentPage++;
                } else if (currentPage == 7) {
                    four();
                    currentPage++;
                }

               else if (currentPage == 8) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 9) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 10) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 11) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 12) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 13) {
                    two();
                    currentPage++;
                }

                else if (currentPage == 14) {
                    three();
                    currentPage++;
                } else if (currentPage == 15) {
                    four();
                    currentPage++;
                }
                else if (currentPage == 16) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 17) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 18) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 19) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 20) {
                    one();
                    currentPage++;
                } else if (currentPage == 21) {
                    two();
                    currentPage++;
                } else if (currentPage == 22) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 23) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 24) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 25) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 26) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 27) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 28) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 29) {
                    two();
                    currentPage++;
                }

                else if (currentPage == 30) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 31) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 32) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 33) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 34) {
                    three();
                    currentPage++;
                } else if (currentPage == 35) {
                    four();
                    currentPage++;
                }
                else if (currentPage == 36) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 37) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 38) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 39) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 40) {
                    one();
                    currentPage++;
                } else if (currentPage == 41) {
                    two();
                    currentPage++;
                } else if (currentPage == 42) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 43) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 44) {
                    one();
                    currentPage++;
                }
                else if (currentPage ==45 ) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 46) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 47) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 48) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 49) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 50) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 51) {
                    four();
                    currentPage++;
                }

                else if (currentPage == 52) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 53) {
                    two();
                    currentPage++;
                }

                else if (currentPage == 54) {
                    three();
                    currentPage++;
                } else if (currentPage == 55) {
                    four();
                    currentPage++;
                }
                else if (currentPage == 56) {
                    one();
                    currentPage++;
                }
                else if (currentPage == 57) {
                    two();
                    currentPage++;
                }
                else if (currentPage == 58) {
                    three();
                    currentPage++;
                }
                else if (currentPage == 59) {
                    four();
                    currentPage++;
                }

            }
        };

        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);

        fatBurnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FatBurnListActivity.class);
                startActivity(intent);
            }
        });

        heightAndWeightList = findViewById(R.id.heightAndWeight);
        heightAndWeightList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HeightAndWeightActivity.class);
                startActivity(intent);
            }
        });

        calorieCountLayout = findViewById(R.id.layoutCalorieCount);
        calorieCountLayout.setClickable(true);
        calorieCountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalorieCountActivity.class);
                startActivity(intent);
            }
        });

    }

    private void four() {
        imageView_1.setVisibility(View.GONE);
        imageView_2.setVisibility(View.GONE);
        imageView_3.setVisibility(View.GONE);
        imageView_4.setVisibility(View.VISIBLE);
    }

    private void three() {
        imageView_1.setVisibility(View.GONE);
        imageView_2.setVisibility(View.GONE);
        imageView_3.setVisibility(View.VISIBLE);
        imageView_4.setVisibility(View.GONE);
    }

    private void two() {
        imageView_1.setVisibility(View.GONE);
        imageView_2.setVisibility(View.VISIBLE);
        imageView_3.setVisibility(View.GONE);
        imageView_4.setVisibility(View.GONE);
    }

    private void one() {
        imageView_1.setVisibility(View.VISIBLE);
        imageView_2.setVisibility(View.GONE);
        imageView_3.setVisibility(View.GONE);
        imageView_4.setVisibility(View.GONE);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}