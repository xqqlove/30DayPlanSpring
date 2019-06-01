package com.qq30SpringRelation;

import com.qq30springAutowire.Address;
import com.qq30springAutowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   public static void main(String[] args){
       ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-relation.xml");

//       Address address=(Address) ctx.getBean("address");
//       System.out.println(address);

       Address address1=(Address)ctx.getBean("address2");
       System.out.println(address1);

       Person person=(Person)ctx.getBean("person1");
       System.out.println(person);
   }


}
