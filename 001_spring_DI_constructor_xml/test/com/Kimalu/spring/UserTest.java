package com.Kimalu.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {
	@Test
	public void test(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		User u=ac.getBean("user", User.class);
		System.out.println(u);
	}
}
