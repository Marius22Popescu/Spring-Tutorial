package com.spring.SpringCoreConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate 
//bean definitions and service requests for those beans at runtime.
public class VehicleConfig {
	@Bean(name="sedan") //Indicates that a method produces a bean to be managed by the Spring container.
	public Vehicle getSedanName() {
		return new Sedan();
	}
}
