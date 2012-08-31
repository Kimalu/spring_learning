package com.Kimalu.spring;

public class IdCard {
	private int id;
	private String address;
	
	public IdCard(){
		
	}
	public IdCard(int id,String address){
		this.id=id;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	

}
