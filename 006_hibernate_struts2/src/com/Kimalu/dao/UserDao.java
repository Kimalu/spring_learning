package com.Kimalu.dao;

import com.Kimalu.model.User;

public interface UserDao {

	public User findUserByName(String name);
	public void saveUser(User user);
}
