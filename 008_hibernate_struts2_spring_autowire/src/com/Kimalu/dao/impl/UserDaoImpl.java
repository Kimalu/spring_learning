package com.Kimalu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Kimalu.dao.UserDao;
import com.Kimalu.model.User;
import com.Kimalu.util.SessionFactoryUtil;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sf;
	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}



	@Override
	public User findUserByName(String name) {
		Session session=sf.getCurrentSession();
		//session.beginTransaction();
		List<User> list=new ArrayList<User>();
		list=session.createQuery("from User u where u.name=:username").setString("username", name).list();
		//session.getTransaction().commit();
		if(list.size()>=1){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public void saveUser(User user) {
		Session session=sf.getCurrentSession();
		//session.beginTransaction();
		session.save(user);
		//session.getTransaction().commit();
	}

}
