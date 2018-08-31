package org.sistema.spring.aspects.monitors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;

public class MonitoringCircuit {
	@AfterReturning(value = "execution(* org.sistema.spring.aspects.models.Circuit.difficulty(...))", returning = "distance")
	public void movingKart(JoinPoint joinPoint, int difficultyValue) {
		System.out.println(joinPoint.getThis().toString() + "Circuit Difficulty: " + difficultyValue);
	}
	
	
}
