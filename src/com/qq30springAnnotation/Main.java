package com.qq30springAnnotation;

import com.qq30springAnnotation.controller.UserController;
import com.qq30springAnnotation.repository.UserRepository;
import com.qq30springAnnotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean-annotation.xml");

//        TestObject testObject= (TestObject) ctx.getBean("testObject");
//        System.out.println(testObject);

        UserController userController= (UserController) ctx.getBean("userController");
        userController.execute();
        System.out.println(userController);

//        UserService userService= (UserService) ctx.getBean("userService");
//        System.out.println(userService);
//
//        UserRepository userRepository= (UserRepository) ctx.getBean("userRepository");
//        System.out.println(userRepository);
    }
}
