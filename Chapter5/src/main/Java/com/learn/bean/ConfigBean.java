package com.learn.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by  jiazhi on 2017/8/9.
 */
@Configurable
public class ConfigBean {
    @Bean(name="beancar")
    Car  getCarBean(){
        Car car = new Car();
        car.setMaxSpeed("100");
        car.setColor("red");
        car.setBrand("baoma");
        return car;
    }
}
