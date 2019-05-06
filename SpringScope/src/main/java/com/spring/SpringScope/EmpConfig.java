package com.spring.SpringScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean(name="cust")
	public CustomerService display() {
		return new CustomerService();
	}
}
