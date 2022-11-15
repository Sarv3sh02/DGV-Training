package com.training.spring_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
//        Staff staff=(Staff)applicationContext.getBean("student");
//        staff.print();
    	SpringInjection springInjection=(SpringInjection)applicationContext.getBean("springinjection");
    	springInjection.print();
    }
}
