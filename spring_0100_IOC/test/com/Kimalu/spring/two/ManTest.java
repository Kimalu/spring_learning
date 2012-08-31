package com.Kimalu.spring.two;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kimalu.spring.three.Man;

public class ManTest {
	private ApplicationContext ap;
	@Before
	public void setUp() throws Exception {
		ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	

	@After
	public void tearDown() throws Exception {
		
	}
	@Test
	public void test() {
		Man m=ap.getBean("man",Man.class);
		System.out.println(m.getA().getId());
	}

}
