package com.Kimalu.spring;

public class User {
	@Override
	public String toString() {
		return "userName="+username+"&password="+password+"&age="+(age+1);
	}

	private String username;
	private String password;
	private int age;
	
	public User(){
		
	}
	
	public User(String username,String password,int age) {
		this.username = username;
		this.password = password;
		this.age=age;
	}
	
	
	
}
