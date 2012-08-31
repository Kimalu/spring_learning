package com.Kimalu.spring.dao;



import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Kimalu.spring.User;
@Component
public class UserDao {
	@Resource
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void saveUser(User user){
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		
	}
}
