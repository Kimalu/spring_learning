package com.Kimalu.service;

import com.Kimalu.dao.UserDao;
import com.Kimalu.dao.impl.UserDaoImpl;
import com.Kimalu.model.User;

public class UserService {
	private UserDao userDao=new UserDaoImpl();
	private static UserService us=new UserService();
	private UserService(){
		
	}
	public static UserService getInstance(){
		return us;
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
