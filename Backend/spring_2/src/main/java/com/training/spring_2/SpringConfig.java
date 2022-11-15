package com.training.spring_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public Teacher getTeacher() {
		return new Teacher(10);
	}
	
	@Bean
	public School getSchool() {
		return new School();
	}

}
