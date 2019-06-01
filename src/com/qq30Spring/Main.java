package com.qq30Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static  void main(String[] args){
    //创建对象以及给属性赋值交给spring操作
        /**
        HelloWorld helloWorld= new HelloWorld();//创建对象
        helloWorld.setName("qiangqiang");//属性赋值
        **/

        //1.创建spring的IOC容器对象
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从IOC容器获取bean的实例
        HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloworld");
        //调用hello方法
        helloWorld.hello();





    }
}
