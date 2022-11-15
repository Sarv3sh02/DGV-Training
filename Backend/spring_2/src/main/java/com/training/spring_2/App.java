package com.training.spring_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
    		annotationConfigApplicationContext.register(SpringConfig.class);
    		annotationConfigApplicationContext.refresh();
    		
    		School school=annotationConfigApplicationContext.getBean(School.class);
    		school.print();
    		
    		annotationConfigApplicationContext.close();
    }
}
