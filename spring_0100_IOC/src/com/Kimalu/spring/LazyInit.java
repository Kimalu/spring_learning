package com.Kimalu.spring;

public class LazyInit {

	public LazyInit(){
		System.out.println("initial A ...");
	}
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
