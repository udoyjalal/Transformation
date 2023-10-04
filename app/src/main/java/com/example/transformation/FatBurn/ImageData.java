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
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Squats"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Jumping  Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"High Stepping"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Mountain Climber"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Bicycle Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Butt Bridge"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"V Up"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getSunData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Lunges"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Burpees"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Reverse Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Plank"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Cobra Stretch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Long Arm Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Abdominal  Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Plank Jacks"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getMonData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Skipping Without Rope"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Squat Pulses"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Heel Touch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Flutter Kicks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Lateral Plank Walk"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Leg Raises"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Plank Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Butt Bridge"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"V Up"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getTuesData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Squats"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Step Up onto Chair"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"V Up"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Jumping  Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Burpees"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Cobra Stretch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Butt Bridge"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getWedData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Squats"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Jumping Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Mountain Climber"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Lateral Plank Walk"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Step Up onto Chair"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Burpees"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Squat Pulses"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getThurData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Jumping Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Reverse Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Plank"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Cobra Stretch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Long Arm Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Leg Raises"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Butt Bridge"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"V Up"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getFriData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Skipping Without Rope"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Squat Pulses"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Heel Touch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Flutter Kicks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Lateral Plank Walk"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Leg Raises"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Plank Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.concentrated,"Bicycle Crunches"));

        return  fatBurnDataModelList;
    }


}
