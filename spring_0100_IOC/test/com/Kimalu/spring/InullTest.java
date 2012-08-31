package com.Kimalu.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InullTest {
	private ApplicationContext ap;

	@Before
	public void setUp() throws Exception {
		ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testInull() {
		Inull inull=ap.getBean("inull",Inull.class);
		System.out.println(inull.getMyNull());
	}

	@After
	public void tearDown() throws Exception {
		
	}

}
