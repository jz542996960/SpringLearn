package com.learn.bean;

/**
 * Created by  jiazhi on 2017/8/9.
 */
public class Car {
    private  String color;
    private  String brand;
    private  String maxSpeed;

    public  Car(){

    }

    public Car(String color,String brand,String maxSpeed){
        this.color = color;
        this.brand =brand;
        this.maxSpeed = maxSpeed;
    }

    public void show(){
      //System.out.println("car:color" + color  + "color:barnd" + brand + "maxspeed" + maxSpeed);
        System.out.println("car:color" + color);
        System.out.println("car:brand" + brand);
        System.out.println("car:maxSpeed" + maxSpeed);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
