package com.codebygaurav.springfirst;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call method
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		//close context
		context.close();
	}

}
