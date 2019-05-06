package com.spring.SpringCoreMulticonfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       
       Customer c = (Customer) ctx.getBean("customer");
       c.getName("Emre");
       
       User u = (User) ctx.getBean("user");
       u.getUserName("Marius");
       
    }
}
