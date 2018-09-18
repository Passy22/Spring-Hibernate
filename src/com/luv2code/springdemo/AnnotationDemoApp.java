package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// Leemos el archivo de configuración de spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Obtenemos el bean desde el contenedor de spring
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Llamamos un metodo del bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Llamamos al metodo para conseguir la fortuna diaria
		System.out.println(theCoach.getDailyFortune());
		
		// Cerramos el contexto
		context.close();
	}

}
