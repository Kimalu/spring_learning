package com.Kimalu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello2 {
	@RequestMapping("/")
	public void sayHello(){
		System.out.println("aaaaaa");
	}
	
}
