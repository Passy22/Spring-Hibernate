package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
	
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Estamos entrenando con el coach de Baloncesto";
	}

	@Override
	public String getDailyFortune() {
		return "Es tu día de suerte";
	}

}
