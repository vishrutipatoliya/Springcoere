package com.springcore.springannotation;

import org.springframework.stereotype.Component;

//@Component("firststudent") -->@Component annotation used to declare bean
public class Student {
	private Chocolate chocolate;
	
	
	public Chocolate getChocolate() {
		return chocolate;
	}


	public void setChocolate(Chocolate chocolate) {
		this.chocolate = chocolate;
	}


	public Student(Chocolate chocolate) {
		super();
		this.chocolate = chocolate;
	}


	public void study() {
		this.chocolate.eat();
		System.out.println("studying...");
	}

}
