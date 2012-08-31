package com.Kimalu.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CollectionsssTest {
	@Test
	public void test(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Collectionsss c=ac.getBean("c",Collectionsss.class);
		for(String s:c.getArray()){
			System.out.print(s+" ");
		} 
		System.out.println();
		System.out.println(c.getList());
		System.out.println(c.getMap());
		System.out.println(c.getPros());
		System.out.println(c.getSet());
	}

}
