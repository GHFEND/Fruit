package com.example.materialdesign;

/**
 * Created by ${Zhang} on 2019/8/6
 */
public class Fruit {
    private String name;
    private int imageID;
    public Fruit(String name,int imageID){
        this.name = name;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }
}
