package com.example.comidanordestinas.model;

public class food {
     int imgfood;
     String foodname;
     String fooddescription;
     String price;

    public food(int imgfood, String foodname, String fooddescription, String price) {
        this.imgfood = imgfood;
        this.foodname = foodname;
        this.fooddescription = fooddescription;
        this.price = price;
    }

    public int getImgfood() {
        return imgfood;
    }

    public void setImgfood(int imgfood) {
        this.imgfood = imgfood;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFooddescription() {
        return fooddescription;
    }

    public void setFooddescription(String fooddescription) {
        this.fooddescription = fooddescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
