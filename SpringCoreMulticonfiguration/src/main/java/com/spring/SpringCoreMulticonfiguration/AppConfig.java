package com.spring.SpringCoreMulticonfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CustomerConfig.class, UserConfig.class})
public class AppConfig {
	
}
