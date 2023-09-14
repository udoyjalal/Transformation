package com.example.transformation.FatBurn;

import android.content.Context;

import com.example.transformation.R;

import java.util.ArrayList;

public class ImageData {

    private static final String TAG = "FatBurnImageData";
    Context context;


    public static ArrayList<FatBurnDataModel> getAllMusic(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.ic_back_arrow,"Its working"));

        return  fatBurnDataModelList;
    }

}
