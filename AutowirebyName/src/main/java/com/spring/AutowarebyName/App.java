package com.spring.AutowarebyName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.emp.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);
       Employee e1 = (Employee)ctx.getBean("emp");
       System.out.println(e1);
    }
}
