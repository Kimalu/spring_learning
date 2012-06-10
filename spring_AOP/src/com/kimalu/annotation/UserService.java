package com.kimalu.annotation;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public void addUser(){
		System.out.println("user add...");
	}
	public void delUser(){
		System.out.println("user del...");
	}

}
