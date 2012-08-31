package com.Kimalu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.Kimalu.model.User;
import com.Kimalu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
@Component
@Scope(value="prototype")
public class UserAction extends ActionSupport {
	@Autowired
	private UserService us;

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

	//	private String username;
//	private String password;
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute(){
		System.out.println(user.getName());
		System.out.println(user.getPassword());
			System.out.println("UserAction hashCode:"+this.hashCode());
			us.auto();
		return SUCCESS;
	}

}
