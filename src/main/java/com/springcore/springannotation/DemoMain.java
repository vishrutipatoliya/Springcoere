package com.springcore.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
				
				//ClassPathXmlApplicationContext("com/springcore/springannotation/springannotationconfig.xml");
		Student s =context.getBean("student",Student.class);
		System.out.println(s);
		s.study();
		
	}

}
