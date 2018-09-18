package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public  TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		// TODO Auto-generated constructor stub
	}
	*/
	
	public  TennisCoach() {
		System.out.println(">> TennisCoach: Estás dentro del constructor por defecto");
	}
	

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// Definimos un metodo setter
	
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Dentro del metodo setFortuneService()");
		this.fortuneService = fortuneService;
	}
	
}