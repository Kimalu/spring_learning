package com.Kimalu.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	private ApplicationContext ap;

	@Before
	public void setUp() throws Exception {
		ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testUser() {
		User user=(User)ap.getBean("User");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	}

	@After
	public void tearDown() throws Exception {
		
	}

}
