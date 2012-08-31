package com.Kimalu.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitTest {
	private ApplicationContext ap;

	@Before
	public void setUp() throws Exception {
		ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void test(){
		LazyInit lazyInit=ap.getBean("lazyInit",LazyInit.class);
		System.out.println(lazyInit.getId());
	}

	@After
	public void tearDown() throws Exception {
		
	}

}
