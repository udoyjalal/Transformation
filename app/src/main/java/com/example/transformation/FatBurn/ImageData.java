package com.example.transformation.FatBurn;

import android.content.Context;

import com.example.transformation.R;

import java.util.ArrayList;

public class ImageData {

    private static final String TAG = "FatBurnImageData";
    Context context;


    public static ArrayList<FatBurnDataModel> getAllMusic(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Saturday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Sunday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Monday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Tuesday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Wednesday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Thursday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Friday"));

        return  fatBurnDataModelList;
    }



    public static ArrayList<FatBurnDataModel> getSatData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"A"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"B"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"c"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"D"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"E"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"F"));

        return  fatBurnDataModelList;
    }

}
