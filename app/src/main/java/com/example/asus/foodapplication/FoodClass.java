package com.example.asus.foodapplication;

/**
 * Created by asus on 20/06/2017.
 */

public class FoodClass {
    private String name;
    private String desc;
    private int imageID;

    public FoodClass(String name,String desc,int imageID) {

        this.name = name;
        this.desc = desc;
        this.imageID =imageID;

    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public static FoodClass[] foods = {
            new FoodClass("pizza", "4saisons",R.drawable.pizza),
            new FoodClass("Chaneb", "5saisons",R.drawable.pizza),
            new FoodClass("Kafteji","6saisons",R.drawable.pizza)

};

    }

