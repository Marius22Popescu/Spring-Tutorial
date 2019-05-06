package com.spring.SpringCoreMulticonfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	@Bean(name="customer")
	public Customer getName() {
		return new Customer();
	}
}
