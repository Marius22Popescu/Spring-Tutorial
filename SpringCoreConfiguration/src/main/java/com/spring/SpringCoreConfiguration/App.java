package com.spring.SpringCoreConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	//ApplicationContext is a central interface to provide configuration for an application
    	//AnnotationConfigApplicationContext - Create a new AnnotationConfigApplicationContext, deriving bean definitions from 
    	//the given annotated classes and automatically refreshing the context.
        ApplicationContext ctx=new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle v= (Vehicle)ctx.getBean("sedan");
        v.getName("Maserati");
    }
}
