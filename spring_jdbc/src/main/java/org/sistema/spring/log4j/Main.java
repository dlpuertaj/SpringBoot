package org.sistema.spring.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sistema.spring.log4j.models.GreetingEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		GreetingEngine greetingEngine = (GreetingEngine) context.getBean("greetingEngine");
		
		 Logger logger = Logger.getLogger(Main.class);
		 
		 logger.setLevel(Level.ALL);
		 logger.trace("Simple trace");
		 logger.debug("Debug message");
		 logger.error("Error message");
		 logger.fatal("Fatal error");
		 
		 System.out.println(greetingEngine.greetMe());
		 
		 //TODO: Create log4j.properties file
	}

}
