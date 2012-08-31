package com.Kimalu.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/springmvc")
public class HelloWorldController {
	@RequestMapping(value="/binding", method=RequestMethod.POST)
	public String getForDay3(@RequestParam("name")String name){
		System.out.println(name);
		name+="1";
		return "forward:index.html";
	}
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String getA(HttpServletRequest request,@RequestParam("name")String name){
		System.out.println(name);
		return "hello2";
	}
}
