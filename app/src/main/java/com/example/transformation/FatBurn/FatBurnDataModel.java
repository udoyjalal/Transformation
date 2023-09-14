package com.example.transformation.FatBurn;

public class FatBurnDataModel {
    private  int image_fatBurn_workout;
    private String title_fatBurn_workout;

    public FatBurnDataModel(int image_fatBurn_workout, String title_fatBurn_workout) {
        this.image_fatBurn_workout = image_fatBurn_workout;
        this.title_fatBurn_workout = title_fatBurn_workout;
    }

    public int getImage_fatBurn_workout() {
        return image_fatBurn_workout;
    }

    public String getTitle_fatBurn_workout() {
        return title_fatBurn_workout;
    }

    public void setImage_fatBurn_workout(int image_fatBurn_workout) {
        this.image_fatBurn_workout = image_fatBurn_workout;
    }

    public void setTitle_fatBurn_workout(String title_fatBurn_workout) {
        this.title_fatBurn_workout = title_fatBurn_workout;
    }

}
