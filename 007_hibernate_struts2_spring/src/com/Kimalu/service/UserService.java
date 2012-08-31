package com.Kimalu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kimalu.dao.UserDao;
import com.Kimalu.dao.impl.UserDaoImpl;
import com.Kimalu.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String addUser(User user){
		String page="error";
		String result=this.exist(user.getName());
		if("no exist".equalsIgnoreCase(result)){
			userDao.saveUser(user);
			page="success";
		}
		return page;
		
	}
	
	private  String exist(String name){
		String result="already exist";
		User u=userDao.findUserByName(name);
		if(u==null){
			result="no exist";
		}
		return result;
	}
}
