package com.example.transformation.FatBurn;

import android.content.Context;

import com.example.transformation.R;

import java.util.ArrayList;

public class ImageData {

    private static final String TAG = "FatBurnImageData";
    Context context;


    public static ArrayList<FatBurnDataModel> getAllMusic(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.squats,"Saturday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.push_ups,"Sunday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.skipping_without_rope,"Monday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.butt_bridge,"Tuesday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.lateral_plank_walk,"Wednesday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.jumping_jacks,"Thursday"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.heel_touch,"Friday"));

        return  fatBurnDataModelList;
    }



    public static ArrayList<FatBurnDataModel> getSatData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.squats,"Squats"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.jumping_jacks,"Jumping  Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.high_stepping,"High Stepping"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.mountain_climber,"Mountain Climber"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.push_ups,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.triceps_dips,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.bicycle_crunches,"Bicycle Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.butt_bridge,"Butt Bridge"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.v_up,"V Up"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getSunData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.push_ups,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.lunges,"Lunges"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.burpees,"Burpees"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.reverse_crunches,"Reverse Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.plank,"Plank"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.cobra_stretch,"Cobra Stretch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.long_arm_crunches,"Long Arm Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.abdominal_crunches,"Abdominal  Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.plank_jacks,"Plank Jacks"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getMonData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.skipping_without_rope,"Skipping Without Rope"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.squat_pulses,"Squat Pulses"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.heel_touch,"Heel Touch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.flutter_kicks,"Flutter Kicks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.lateral_plank_walk,"Lateral Plank Walk"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.leg_raises,"Leg Raises"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.plank_jacks,"Plank Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.butt_bridge,"Butt Bridge"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.v_up,"V Up"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getTuesData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.squats,"Squats"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.step_up_onto_chair,"Step Up onto Chair"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.v_up,"V Up"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.push_ups,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.jumping_jacks,"Jumping  Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.burpees,"Burpees"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.triceps_dips,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.cobra_stretch,"Cobra Stretch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.butt_bridge,"Butt Bridge"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getWedData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.squats,"Squats"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.jumping_jacks,"Jumping Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.mountain_climber,"Mountain Climber"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.push_ups,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.triceps_dips,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.lateral_plank_walk,"Lateral Plank Walk"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.step_up_onto_chair,"Step Up onto Chair"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.burpees,"Burpees"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.squat_pulses,"Squat Pulses"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getThurData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.push_ups,"Push Ups"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.jumping_jacks,"Jumping Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.reverse_crunches,"Reverse Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.plank,"Plank"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.cobra_stretch,"Cobra Stretch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.long_arm_crunches,"Long Arm Crunches"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.leg_raises,"Leg Raises"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.butt_bridge,"Butt Bridge"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.v_up,"V Up"));

        return  fatBurnDataModelList;
    }

    public static ArrayList<FatBurnDataModel> getFriData(Context context){
        ArrayList<FatBurnDataModel> fatBurnDataModelList = new ArrayList<>();
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.skipping_without_rope,"Skipping Without Rope"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.squat_pulses,"Squat Pulses"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.heel_touch,"Heel Touch"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.flutter_kicks,"Flutter Kicks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.lateral_plank_walk,"Lateral Plank Walk"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.triceps_dips,"Triceps Dips"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.leg_raises,"Leg Raises"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.plank_jacks,"Plank Jacks"));
        fatBurnDataModelList.add(new FatBurnDataModel(R.drawable.bicycle_crunches,"Bicycle Crunches"));

        return  fatBurnDataModelList;
    }


}
