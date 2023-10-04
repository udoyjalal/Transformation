package com.example.transformation.FatBurn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.transformation.FatBurn.ActivityListDays.FatBurnFriListActivity;
import com.example.transformation.FatBurn.ActivityListDays.FatBurnMonListActivity;
import com.example.transformation.FatBurn.ActivityListDays.FatBurnSatListActivity;
import com.example.transformation.FatBurn.ActivityListDays.FatBurnSunListActivity;
import com.example.transformation.FatBurn.ActivityListDays.FatBurnThursListActivity;
import com.example.transformation.FatBurn.ActivityListDays.FatBurnTuesListActivity;
import com.example.transformation.FatBurn.ActivityListDays.FatBurnWedListActivity;
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

        TextView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        fatLossRV = (RecyclerView) findViewById(R.id.fatLossListView);

        fatBurnDataModelList =  new ImageData().getAllMusic(this);

        fatBurnAdapter = new FatBurnAdapter(this, fatBurnDataModelList, itemClickListenerFatBurn);
        LinearLayoutManager fatBurn = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        fatLossRV.setLayoutManager(fatBurn);
        fatLossRV.setAdapter(fatBurnAdapter);

    }

    @Override
    public void addFatBurnAdapterAction(int index) {

        if(index == 0){
            Intent intent = new Intent(FatBurnListActivity.this, FatBurnSatListActivity.class);
            startActivity(intent);
        }
        else if(index == 1){
            Intent intent = new Intent(FatBurnListActivity.this, FatBurnSunListActivity.class);
            startActivity(intent);
        }
        else if(index == 2){
            Intent intent = new Intent(FatBurnListActivity.this, FatBurnMonListActivity.class);
            startActivity(intent);
        }
        else if(index == 3){
            Intent intent = new Intent(FatBurnListActivity.this, FatBurnTuesListActivity.class);
            startActivity(intent);
        }
        else if(index == 4){
            Intent intent = new Intent(FatBurnListActivity.this, FatBurnWedListActivity.class);
            startActivity(intent);
        }
        else if(index == 5){
            Intent intent = new Intent(FatBurnListActivity.this, FatBurnThursListActivity.class);
            startActivity(intent);
        }
        else if(index == 6){
            Intent intent = new Intent(FatBurnListActivity.this, FatBurnFriListActivity.class);
            startActivity(intent);
        }
    }





}