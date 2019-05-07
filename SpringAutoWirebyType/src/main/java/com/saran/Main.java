package com.saran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saran.config.MariusConfig;
import com.saran.marius.MariusDriver;
 

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new 
				AnnotationConfigApplicationContext(MariusConfig.class);
		
		MariusDriver m=(MariusDriver)ctx.getBean("driver");
		System.out.println(m);
		
	}

}
