package com.Kimalu.spring.one;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kimalu.spring.Inull;

public class PersonTest {
	private ApplicationContext ap;
	@Before
	public void setUp() throws Exception {
		ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	

	@After
	public void tearDown() throws Exception {
		
	}
	@Test
	public void testToString() {
		Person p=ap.getBean("person",Person.class);
		System.out.println(p);
		
	}

}
