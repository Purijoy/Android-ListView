package com.example.project1;

public class Fruit {
    //定一个实体类，作为ListView适配器的适配类型
    private String name;
    private int imageId;
    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
