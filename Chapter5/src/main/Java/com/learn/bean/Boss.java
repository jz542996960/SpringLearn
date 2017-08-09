package com.learn.bean;

/**
 * Created by  jiazhi on 2017/8/9.
 */
public class Boss {
    private Car car;
    public Boss(){

    }
    public Boss(Car car){
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
