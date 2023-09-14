package com.example.transformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CalorieCountActivity extends AppCompatActivity {
    private static final String TAG = "CalorieCountActivity";
    private EditText weightEt, hightEt, ageEt, munitesEt;
    private TextView resultTv;
    private RadioGroup radioGroup1, radioGroup2;
    private RadioButton maleR, femaleR, lowR, moderateR, activeR;
    private ImageButton submitBtn;
    private LinearLayout layoutIpt, layoutOutpt, layoutBack1, layoutBack2;

    double age;
    double hight;
    double weight;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_count);
        getSupportActionBar().hide();

        layoutIpt = findViewById(R.id.layoutInput);
        layoutOutpt = findViewById(R.id.lOut);
        layoutBack1 = findViewById(R.id.lBack1);
        layoutBack2 = findViewById(R.id.lBack2);

        resultTv = findViewById(R.id.resultTV);
        weightEt = findViewById(R.id.weightET);
        hightEt = findViewById(R.id.hightET);
        ageEt = findViewById(R.id.ageET);
        munitesEt = findViewById(R.id.workoutTimeET);

        radioGroup1 = findViewById(R.id.rg1);
        int radioButtonId1 = radioGroup1.getCheckedRadioButtonId();
        maleR = radioGroup1.findViewById(R.id.radioMale);
        femaleR = radioGroup1.findViewById(R.id.radioFemale);

        radioGroup2 = findViewById(R.id.rg2);
        int radioButtonId2 = radioGroup2.getCheckedRadioButtonId();
        lowR = radioGroup2.findViewById(R.id.radioLow);
        moderateR = radioGroup2.findViewById(R.id.radioModerate);
        activeR = radioGroup2.findViewById(R.id.radioHigh);

        layoutBack1.setClickable(true);
        layoutBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalorieCountActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        submitBtn = findViewById(R.id.submitBTN);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                layoutIpt.setVisibility(View.GONE);
                layoutBack1.setVisibility(View.GONE);
                layoutOutpt.setVisibility(View.VISIBLE);
                layoutBack2.setVisibility(View.VISIBLE);
                submitBtn.setVisibility(View.GONE);
            }
        });

        layoutBack2.setClickable(true);
        layoutBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutIpt.setVisibility(View.VISIBLE);
                layoutBack1.setVisibility(View.VISIBLE);
                layoutOutpt.setVisibility(View.GONE);
                layoutBack2.setVisibility(View.GONE);
                submitBtn.setVisibility(View.VISIBLE);
            }
        });

    }

    private void calculate() {

        String ageS =ageEt.getText().toString();
        String weightS =weightEt.getText().toString();
        String heightS =hightEt.getText().toString();
        if(!ageS.isEmpty() && !weightS.isEmpty() && !heightS.isEmpty())
            try
            {
                age = Double.parseDouble(ageS);
                weight = Double.parseDouble(weightS);
                hight = Double.parseDouble(heightS);
                // it means it is double
            } catch (Exception e1) {
                // this means it is not double
                e1.printStackTrace();
            }

        Log.d(TAG, "calculate: ---"+age);
        Log.d(TAG, "calculate: ---"+weight);
        Log.d(TAG, "calculate: ---"+hight);

        result = ( (weight * 13.75) + (hight * 5) - (age * 6.76) + 66);
        Log.d(TAG, "calculate: ---"+result);
        String resultS = Double.toString(result);

        resultTv.setText(resultS);
    }
}