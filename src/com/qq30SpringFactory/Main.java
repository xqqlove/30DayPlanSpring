package com.qq30SpringFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean-factory.xml");
        Car car1=(Car)ctx.getBean("car1");
        System.out.println(car1);
        Car car2=(Car)ctx.getBean("car2");
        System.out.println(car2);
    }
}
