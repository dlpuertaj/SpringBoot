package org.sistema.spring.aspects.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Race race = (Race) context.getBean("race");
		System.out.println(race.toString());
		race.run();
		System.out.println(race.showResult());
	}

}
