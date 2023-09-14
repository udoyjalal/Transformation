package com.example.transformation.FatBurn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.transformation.R;

import java.util.ArrayList;

public class FatBurnListActivity extends AppCompatActivity implements FatBurnAdapterAction {

    private static final String TAG = "FatBurnActivity";

    RecyclerView fatLossRV;
    FatBurnAdapter fatBurnAdapter;
    ArrayList<FatBurnDataModel> fatBurnDataModelList;
    ItemClickListenerFatBurn itemClickListenerFatBurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burn);
        getSupportActionBar().hide();

        fatLossRV = (RecyclerView) findViewById(R.id.fatLossListView);

        fatBurnDataModelList =  new ImageData().getAllMusic(this);

        fatBurnAdapter = new FatBurnAdapter(this, fatBurnDataModelList, itemClickListenerFatBurn);
        LinearLayoutManager fatBurn = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        fatLossRV.setLayoutManager(fatBurn);
        fatLossRV.setAdapter(fatBurnAdapter);

    }

    @Override
    public void addFatBurnAdapterAction(int index) {

        Intent intent = new Intent(FatBurnListActivity.this, FatBurnWorkoutActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }
}