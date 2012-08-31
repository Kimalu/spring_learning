package com.Kimalu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.Kimalu.dao.UserDao;
import com.Kimalu.model.User;
import com.Kimalu.util.SessionFactoryUtil;

public class UserDaoImpl implements UserDao {
	
	private Session session=SessionFactoryUtil.getSession();

	@Override
	public User findUserByName(String name) {
		session.beginTransaction();
		List<User> list=new ArrayList<User>();
		list=session.createQuery("from User u where u.name=:username").setString("username", name).list();
		if(list.size()>=1){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public void saveUser(User user) {
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
