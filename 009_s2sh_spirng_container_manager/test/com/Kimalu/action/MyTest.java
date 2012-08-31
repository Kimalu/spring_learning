package com.Kimalu.action;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.Kimalu.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
@Transactional
public class MyTest {
	@Autowired
	private UserAction userAction;
	
	@Test
	public void testUserAction(){
		User user=new User();
		user.setName("Kimalu");
		user.setPassword("ewqewqewq");
		userAction.setUser(user);
		String ret = userAction.execute();
		assertEquals("success", ret);
	}
	
}
