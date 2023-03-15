package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Testspel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo d1 = (Demo) cont.getBean("demo");
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression ex = temp.parseExpression("22+44");
		System.out.println(ex.getValue());
	}

}
