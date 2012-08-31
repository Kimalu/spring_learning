package com.Kimalu.spring.three;

public class Man {

	private A a=new A();//需要先给一个初始化对象
	private String name;
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
