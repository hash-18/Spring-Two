package com.spring.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//Initialising spring container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("AnnoapplicationContext.xml");
		//Retreiving beans from Container
		Coach theCoach=context.getBean("cricketCoach",Coach.class);
		//Calling methods using beans
		theCoach.getTraining();
		theCoach.getFortune();
		//Closing the context
		context.close();
	}

}
