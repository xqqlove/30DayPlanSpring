package com.qq30SpringCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        NewPerson person = (NewPerson) ctx.getBean("newPerson");
        System.out.println(person);

        DataSource dataSource=(DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

        Person person1=(Person) ctx.getBean("person5");
        System.out.println(person1);
    }


}
