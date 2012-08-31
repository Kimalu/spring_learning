package com.Kimalu.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Kimalu.spring.Log;
import com.Kimalu.spring.User;
import com.Kimalu.spring.dao.LogDao;
import com.Kimalu.spring.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private LogDao logDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public LogDao getLogDao() {
		return logDao;
	}

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
	public void addUser(User user){
		userDao.saveUser(user);
		Log l=new Log();
		l.setMsg("user saved");
		logDao.saveLog(l);
	}
}
