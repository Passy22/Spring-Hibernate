package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// Creamos un array de strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// Creamos un generador de numeros aleatorios
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		//Elegimos un string de random desde el array 
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
