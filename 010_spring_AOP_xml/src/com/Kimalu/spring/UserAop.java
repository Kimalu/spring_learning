package com.Kimalu.spring;

import org.aspectj.lang.ProceedingJoinPoint;




public class UserAop {
	
	public void before() {
		System.out.println("aop method before");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aop method around start");
		pjp.proceed();
		System.out.println("aop method around end");
	}
}
