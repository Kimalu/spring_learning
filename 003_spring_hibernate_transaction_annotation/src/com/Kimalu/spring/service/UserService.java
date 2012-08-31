package com.Kimalu.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Kimalu.spring.Log;
import com.Kimalu.spring.User;
import com.Kimalu.spring.dao.LogDao;
import com.Kimalu.spring.dao.UserDao;
@Service
public class UserService {
	@Autowired
	private LogDao logDao;
	@Autowired
	private UserDao userDao;
	
	public LogDao getLogDao() {
		return logDao;
	}
	
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Transactional
	public void addUser(){
		Log log=new Log();
		log.setMsg("save user");
		User user=new User();
		user.setName("Kimalu");
		userDao.saveUser(user);
		
		logDao.saveLog(log);
	}

}
