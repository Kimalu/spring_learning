package com.Kimalu.spring.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.Kimalu.spring.User;
@Component
public class UserDao extends HibernateDaoSupport {
	
	public void saveUser(User user){
	}
}
