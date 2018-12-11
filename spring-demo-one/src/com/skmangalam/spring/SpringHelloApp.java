package com.skmangalam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method for fortune
		System.out.println(theCoach.getDailyFortunes());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		theCoach.setEmail("smangalam@egain.com");
		// close the context
		//context.close();
		
		CricketCoach newCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(newCoach.getEmail());
		context.close();
	}

}
