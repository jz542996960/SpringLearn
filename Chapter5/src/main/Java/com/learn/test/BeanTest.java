package com.learn.test;

import com.learn.bean.Car;
import com.learn.bean.ConfigBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by  jiazhi on 2017/8/9.
 */
public class BeanTest {
    @Test
    public void BeanIdTest(){
        ApplicationContext  act = new ClassPathXmlApplicationContext("spring-bean.xml");
        Car car = (Car) act.getBean("car");
        car.setBrand("hongqi");
        car.setColor("red");
        car.setMaxSpeed("100");
        car.show();
    }

    @Test
    public void BeanCofTest(){
        //@Configurable 中取出bean 需要指定其name 属性才可以，没有指定 通过全局限定名取不出来bean
        ApplicationContext  act = new AnnotationConfigApplicationContext(ConfigBean.class);
        Car car = (Car)act.getBean("beancar");
        car.show();
    }


    @Test
    public void BeanNameTest(){
       ApplicationContext act = new ClassPathXmlApplicationContext("spring-bean.xml");
        Car car = (Car)act.getBean("car2");
        car.setBrand("hongqi1");
        car.setColor("red1");
        car.setMaxSpeed("1001");
        car.show();
      //xml中定义的bean 没有id 也没有name 可以用bean的全局限定名取出该bean
        // 如果有多个bean实例没有指定id和name，可以通过全局名+#顺序获得
       act = new ClassPathXmlApplicationContext("spring-bean.xml");
       car = (Car)act.getBean("com.learn.bean.Car");
      car.setBrand("hongqi1");
      car.setColor("red1");
      car.setMaxSpeed("1002");
      car.show();


      car = (Car)act.getBean("car4");
      car.show();
    }



}
