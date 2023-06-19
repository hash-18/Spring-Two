package com.spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	FortuneService fortuneService;
	
	//Constructor Injection using autowiring
//	@Autowired
//	public CricketCoach(FortuneService fortuneService) {
//		System.out.println("Constructor injection using autowiring");
//		this.fortuneService = fortuneService;
//	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	//Setter Injection using autowiring
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter injection using autowiring");
		this.fortuneService = fortuneService;
	}





	public void getTraining() {
		System.out.println("Practice Batting");
	}

	public CricketCoach() {
	}
	
	public void getFortune()
	{
		System.out.println("Using DI");
		fortuneService.getFortune();
	}

}
