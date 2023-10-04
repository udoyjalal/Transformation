package com.example.transformation.FatBurn.ActivityListDays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.transformation.FatBurn.ActivityWorkoutDays.FatBurnSatWorkoutActivity;
import com.example.transformation.FatBurn.ActivityWorkoutDays.FatBurnThurWorkoutActivity;
import com.example.transformation.FatBurn.FatBurnAdapter;
import com.example.transformation.FatBurn.FatBurnAdapterAction;
import com.example.transformation.FatBurn.FatBurnDataModel;
import com.example.transformation.FatBurn.ImageData;
import com.example.transformation.FatBurn.ItemClickListenerFatBurn;
import com.example.transformation.R;

import java.util.ArrayList;

public class FatBurnThursListActivity extends AppCompatActivity implements FatBurnAdapterAction {
    private static final String TAG = "FatBurnThursListActivity";

    RecyclerView fatLossSatRV;
    FatBurnAdapter fatBurnAdapter;
    ArrayList<FatBurnDataModel> fatBurnDataModelList;
    ItemClickListenerFatBurn itemClickListenerFatBurn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burn_thurs_list);
        getSupportActionBar().hide();

        TextView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        fatLossSatRV = (RecyclerView) findViewById(R.id.fatBurnSatRecyclerView);
        fatBurnDataModelList =  new ImageData().getThurData(this);

        fatBurnAdapter = new FatBurnAdapter(this, fatBurnDataModelList, itemClickListenerFatBurn);
        LinearLayoutManager fatBurn = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        fatLossSatRV.setLayoutManager(fatBurn);
        fatLossSatRV.setAdapter(fatBurnAdapter);
    }
    @Override
    public void addFatBurnAdapterAction(int index) {

        if(index == 0){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 1){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 2){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 3){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 4){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 5){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 6){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 7){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
        else if(index == 8){
            Intent intent = new Intent(FatBurnThursListActivity.this, FatBurnThurWorkoutActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }




    }

}