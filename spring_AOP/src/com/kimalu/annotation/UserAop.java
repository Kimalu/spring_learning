package com.kimalu.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class UserAop {
	@Pointcut("execution(public * com.kimalu.annotation.UserService.*User(..))")
	private void myAop(){}
	
	@Before("myAop()")
	public void before() {
		System.out.println("aop method before");
	}
	
	@Around("myAop()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aop method around start");
		pjp.proceed();
		System.out.println("aop method around end");
	}
}
