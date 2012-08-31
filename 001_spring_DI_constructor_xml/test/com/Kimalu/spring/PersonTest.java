package com.Kimalu.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	@Test
	public void test(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p=ac.getBean("person", Person.class);
		System.out.println(p);
	}

}
