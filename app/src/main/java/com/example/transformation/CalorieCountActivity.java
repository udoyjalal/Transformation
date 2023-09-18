package com.example.transformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
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

import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.regex.Pattern;

public class CalorieCountActivity extends AppCompatActivity {
    private static final String TAG = "CalorieCountActivity";
    private TextInputEditText age, height, weight;
    private RadioGroup gender;
    private RadioGroup activityRG;
    private MaterialRadioButton zeroActivity, oneOrThreeTimes, threeOrFourTimes, fourOrFiveTimes,
            sixOrSevenTimes, dailyActivity;
    private MaterialRadioButton male, female;
    private TextView calories, required;
    private AppCompatButton calculate, reset;
    double totalCalories = 0;
    TextView finalCalorieTV;

    @SuppressLint({"CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_count);
        getSupportActionBar().hide();

        age = findViewById(R.id.age);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        gender = findViewById(R.id.gender);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        finalCalorieTV = findViewById(R.id.finalCalorie);
        required = findViewById(R.id.required);
        calculate = findViewById(R.id.calculate);
        reset = findViewById(R.id.reset);

        activityRG = findViewById(R.id.activityrG);
        zeroActivity = findViewById(R.id.zeroTimes);
        oneOrThreeTimes = findViewById(R.id.oneOrThreeTimes);
        threeOrFourTimes = findViewById(R.id.threeOrfourTimes);
        fourOrFiveTimes = findViewById(R.id.fourOrFiveTimes);
        sixOrSevenTimes = findViewById(R.id.sixOrSevenTimes);
        dailyActivity = findViewById(R.id.dailyTimes);

        reset.setOnClickListener(v -> {
            age.setText("");
            height.setText("");
            weight.setText("");
            gender.clearCheck();
            required.setVisibility(View.GONE);
            activityRG.clearCheck();
        });

        calculate.setOnClickListener(v -> {

            // Getting the values from the text fields
            String ageText = age.getText().toString();
            String heightText = height.getText().toString();
            String weightText = weight.getText().toString();

            // Creating the pattern for the regular expression
            // This will check if the value is a number or not
            Pattern pattern = Pattern.compile("[0-9]+");

            // Creating the variables for the checks and setting them to false
            // These will be used to check if the values are empty or not
            boolean ageCheck = false;
            boolean heightCheck = false;
            boolean weightCheck = false;

            // Checking if the age text field is empty or not
            // If it is empty, then it will show an error message
            if (ageText.isEmpty()) {
                age.setError("Please enter your age");
                age.requestFocus();
                ageCheck = false;
            } else if (!pattern.matcher(ageText).matches()) {
                age.setError("Please enter your age correctly");
                age.requestFocus();
                ageCheck = false;
            } else {
                age.setError(null);
                ageCheck = true;
            }

            // Checking if the height text field is empty or not
            // If it is empty, then it will show an error message
            if (heightText.isEmpty()) {
                height.setError("Please enter your height");
                height.requestFocus();
                heightCheck = false;
            } else if (!pattern.matcher(ageText).matches()) {
                age.setError("Please enter your age correctly");
                age.requestFocus();
                heightCheck = false;
            } else {
                height.setError(null);
                heightCheck = true;
            }

            // Checking if the weight text field is empty or not
            // If it is empty, then it will show an error message
            if (weightText.isEmpty()) {
                weight.setError("Please enter your weight");
                weight.requestFocus();
                weightCheck = false;
            } else if (!pattern.matcher(ageText).matches()) {
                age.setError("Please enter your age correctly");
                age.requestFocus();
                weightCheck = false;
            } else {
                weight.setError(null);
                weightCheck = true;
            }

            if (activityRG.getCheckedRadioButtonId() == -1 && gender.getCheckedRadioButtonId() == -1) {
                required.setText("Please Select Gender and Activity");
                required.setVisibility(View.VISIBLE);
            }
            else if (activityRG.getCheckedRadioButtonId() == -1 || gender.getCheckedRadioButtonId() == -1) {
                required.setText("Please Select Gender and Activity");
                required.setVisibility(View.VISIBLE);
            }
            else if (activityRG.getCheckedRadioButtonId() == -1) {
                required.setText("Please Select Activity");
                required.setVisibility(View.VISIBLE);
            }
            else if (gender.getCheckedRadioButtonId() == -1) {
                required.setText("Please Select Gender");
                required.setVisibility(View.VISIBLE);
            }
            else {
                required.setText("");
                required.setVisibility(View.GONE);

                // Checking if all the values are not empty
                if (ageCheck && heightCheck && weightCheck) {

                    // Calling the calculateBMR method
                    calculateCalorie();
                }
            }
        });
    }

    public void calculateCalorie() {

        // Getting the values from the text fields
        int ageValue = Integer.parseInt(age.getText().toString());
        int heightValue = Integer.parseInt(height.getText().toString());
        int weightValue = Integer.parseInt(weight.getText().toString());

        // Creating the variable for the total calories


        if (gender.getCheckedRadioButtonId() == male.getId()) {
            // If user is "Male" then the following formula will be used to calculate the calories
            totalCalories = (10 * weightValue) + (6.25 * heightValue) - (5 * ageValue + 5);

        } else {
            // If user is "Female" then the following formula will be used to calculate the calories
            totalCalories = (10 * weightValue) + (6.25 * heightValue) - (5 * ageValue - 161);
            calories.setText(String.format("%.2f", totalCalories) + "*");
        }

        finalCalories();

        // Setting the text to the text view and making it visible
        required.setText("*" + "Calculation is based on the Mifflin-St Jeor Equation");
        required.setTextSize(12);
      //  required.setVisibility(View.VISIBLE);

    }

    private void finalCalories() {

        finalCalorieTV.setTextSize(25);
        if (activityRG.getCheckedRadioButtonId() == zeroActivity.getId()) {
            finalCalorieTV.setText("Daily Calories needed: " + String.format("%.2f", totalCalories));
        }
        else if (activityRG.getCheckedRadioButtonId() == oneOrThreeTimes.getId()) {
            finalCalorieTV.setText("Daily Calories needed: " + String.format("%.2f", totalCalories * 1.149));
        }
        else if (activityRG.getCheckedRadioButtonId() == threeOrFourTimes.getId()) {
            finalCalorieTV.setText("Daily Calories needed: " +String.format("%.2f", totalCalories * 1.220));
        }
        else if (activityRG.getCheckedRadioButtonId() == fourOrFiveTimes.getId()) {
            finalCalorieTV.setText("Daily Calories needed: " +String.format("%.2f", totalCalories * 1.292));
        }
        else if (activityRG.getCheckedRadioButtonId() == sixOrSevenTimes.getId()) {
            finalCalorieTV.setText("Daily Calories needed: " +String.format("%.2f", totalCalories * 1.437));
        }
        else if (activityRG.getCheckedRadioButtonId() == dailyActivity.getId()) {
            finalCalorieTV.setText("Daily Calories needed: " +String.format("%.2f", totalCalories * 1.583));
        }


    }
}