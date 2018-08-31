package org.sistema.spring.log4j;

import org.apache.logging.log4j.Logger;
import org.sistema.spring.log4j.models.GreetingEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		GreetingEngine greetingEngine = (GreetingEngine) context.getBean("greetingEngine");
		
		 Logger logger = Logger.getLogger(Main.class);
		 
		 logger.set
	}

}
