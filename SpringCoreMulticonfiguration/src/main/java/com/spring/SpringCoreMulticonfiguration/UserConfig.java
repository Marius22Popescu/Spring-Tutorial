package com.spring.SpringCoreMulticonfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	@Bean(name="user")
	public User getName() {
		return new User();
	}
}
