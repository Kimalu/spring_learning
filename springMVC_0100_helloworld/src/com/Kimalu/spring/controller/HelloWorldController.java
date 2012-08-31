package com.Kimalu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/HelloWorldController")//@RequestMapping("/flowcard/FlowCardController")
public class HelloWorldController {
	@RequestMapping(params = "command=sayHello",method=RequestMethod.GET)
	public String sayHello(){
		System.out.println("hello");
		return "hello2";
	}
//	@RequestMapping(method=RequestMethod.GET)
//	@ResponseBody
//	public String get(){
//		System.out.println("get method");
//		//return "forward:/springmvc/hello.html";
//		return "fuck anyone";
//	}
//	@RequestMapping(method=RequestMethod.POST)
//	public String post(){
//		System.out.println("post method");
//		return "springmvc/hello";
//	}
//	@RequestMapping(value="/{id}")
//	public String getForDay2(@PathVariable("id") String id){
//		System.out.println(id+"2");
//		return "hello2";
//	}
//	@RequestMapping(value="/{name}")
//	public String getForDay(@PathVariable("name") String name){
//		System.out.println(name);
//		return "hello";
//	}
//	@RequestMapping(value="/model", method=RequestMethod.POST)
//	public String getForDay3(User user){
//		System.out.println(user.getName());
//		System.out.println(user.getAge());
//		user.setName(user.getName()+"1");
//		user.setAge(user.getAge()+1);
//		return "forward:/springmvc/aaa.html";
//	}
//	
//	@RequestMapping(value="/aaa", method=RequestMethod.POST)
//	@ModelAttribute("user")
//	public String getForDay6(@ModelAttribute User user){
//		System.out.println(user.getName());
//		System.out.println(user.getAge());
//		return "hello2";
//	}
//	
//	@RequestMapping(value="/request", method=RequestMethod.GET)
//	public void getForDay4(@RequestBody String body, Writer writer) throws IOException {
//		  writer.write(body);
//	}
}
