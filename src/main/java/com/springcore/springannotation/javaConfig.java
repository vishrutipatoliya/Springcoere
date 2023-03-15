package com.springcore.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.springannotation")  --> used in @Componet annotation
public class javaConfig {
//	@Bean
	public Chocolate getChocolate() {
		return new Chocolate();
	}
	
	
	@Bean(name= {"student","student1","student"})
	public Student getStudent() {
		//creating a new object
		
		Student student = new Student(getChocolate());
		return student;
		
	}
 
}
