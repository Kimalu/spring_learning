package com.Kimalu.spring.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kimalu.spring.User;
import com.Kimalu.spring.service.UserService;

public class UserDaoTest {
	@Test
	public  void testSave(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao ud=(UserDao)ac.getBean("userDao");
		User user=new User();
		user.setName("Kimalu");
		
		ud.saveUser(user);
	}
	public static void main(String[] args){
		UserDaoTest udt=new UserDaoTest();
		udt.testAdd();
	}
	@Test
	public  void testAdd(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us=(UserService)ac.getBean("userService");
		us.addUser();
	}
}
