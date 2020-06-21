package com.codebygaurav.springfirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (coach == alphaCoach);
		
		System.out.println("\n Poiniting to the same Object : "+ result);
		
		System.out.println("\n memory location for the Coach : " +coach);
		
		System.out.println("\n memory location for the alphaCoach : " +alphaCoach);
		
		context.close();
		
	}

}
