package com.codebygaurav.springfirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
		
	}

}
