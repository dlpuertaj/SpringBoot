package org.sistema.spring.aspects.monitors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.sistema.spring.aspects.models.Kart;

public class MonitoringKart {
	
	@Before("execution(* org.sistema.spring.aspects.models.Kart.move(...))")
	public void movingKart() {
	System.out.println("Kart moving");	
	}
	
	@Before("execution(* org.sistema.spring.aspects.models.Kart.move(...))")
	public void movingKart(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "Kart moving with joint Point");
	}
	
	@AfterReturning(value = "execution(* org.sistema.spring.aspects.models.Kart.move(...))", returning = "distance")
	public void movingKart(JoinPoint joinPoint, int distance) {
		System.out.println(joinPoint.getThis().toString() + "Kart moved: " + distance);
	}
	
	@AfterReturning(value = "execution(* org.sistema.spring.aspects.models.Kart.handle(...))", returning = "handlePoints")
	public void handleKart(JoinPoint joinPoint, int handlePoints) {
		Kart callingKart = (Kart) joinPoint.getThis();
		System.out.println(callingKart.getName() + "Kart handle: " + handlePoints);
	}
}
