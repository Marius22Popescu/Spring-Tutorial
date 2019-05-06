package com.spring.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(EmpConfig.class);
         CustomerService cs = (CustomerService)ctx.getBean("cust");
         cs.setMsg("Test");
         System.out.println(cs.getMsg());
         
         CustomerService cs2 = (CustomerService)ctx.getBean("cust");
         System.out.println(cs2.getMsg());
         ctx.registerShutdownHook(); 
         
    }
}
