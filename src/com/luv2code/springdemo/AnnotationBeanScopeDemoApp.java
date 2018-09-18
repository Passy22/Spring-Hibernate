package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// Chequeamos si son los mismos
		boolean result = (theCoach == alphaCoach);
		
		// Dibujamos los resultados
		System.out.println("\nApuntando al mismo objeto: " + result);
		
		System.out.println("\n Localización de memoria para theCoach: " + theCoach);
		
		System.out.println("\n Localización de memoria para alphaCoach: " + alphaCoach);
		
		//Cerramos el contexto
		context.close();

	}

}