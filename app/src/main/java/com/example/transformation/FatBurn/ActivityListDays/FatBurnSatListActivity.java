package com.example.transformation.FatBurn.ActivityListDays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.transformation.FatBurn.ActivityWorkoutDays.FatBurnSatWorkoutActivity;
import com.example.transformation.FatBurn.FatBurnAdapter;
import com.example.transformation.FatBurn.FatBurnAdapterAction;
import com.example.transformation.FatBurn.FatBurnDataModel;
import com.example.transformation.FatBurn.FatBurnListActivity;
import com.example.transformation.FatBurn.ImageData;
import com.example.transformation.FatBurn.ItemClickListenerFatBurn;
import com.example.transformation.R;

import java.util.ArrayList;

public class FatBurnSatListActivity extends AppCompatActivity implements FatBurnAdapterAction {

    private static final String TAG = "FatBurnSatListActivity";

    RecyclerView fatLossSatRV;
    FatBurnAdapter fatBurnAdapter;
    ArrayList<FatBurnDataModel> fatBurnDataModelList;
    ItemClickListenerFatBurn itemClickListenerFatBurn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burn_sat_list);
        getSupportActionBar().hide();

        fatLossSatRV = (RecyclerView) findViewById(R.id.fatBurnSatRecyclerView);
        fatBurnDataModelList =  new ImageData().getSatData(this);

        fatBurnAdapter = new FatBurnAdapter(this, fatBurnDataModelList, itemClickListenerFatBurn);
        LinearLayoutManager fatBurn = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        fatLossSatRV.setLayoutManager(fatBurn);
        fatLossSatRV.setAdapter(fatBurnAdapter);


    }

    @Override
    public void addFatBurnAdapterAction(int index) {
        if(index == 0){
            Intent intent = new Intent(FatBurnSatListActivity.this, FatBurnSatWorkoutActivity.class);
            startActivity(intent);
        }
    }
}