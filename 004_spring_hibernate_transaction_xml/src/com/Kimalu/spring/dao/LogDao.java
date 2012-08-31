package com.Kimalu.spring.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.Kimalu.spring.Log;
@Component
public class LogDao {
	@Resource
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void saveLog(Log log){
		Session session=sessionFactory.getCurrentSession();
		session.save(log);
		float a=1/0;
	}
}
