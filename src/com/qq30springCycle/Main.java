package com.qq30springCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean-cycle.xml");
        Car car =(Car)ctx.getBean("car");
        System.out.println(car);

        //关闭IOC容器
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
