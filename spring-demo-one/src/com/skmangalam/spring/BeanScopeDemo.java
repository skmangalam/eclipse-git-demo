package com.skmangalam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach1 = context.getBean("myCoach", Coach.class);

		Coach coach2 = context.getBean("myCoach", Coach.class);

		System.out.println(coach1.hashCode());
		System.out.println(coach2.hashCode());
	}

}
