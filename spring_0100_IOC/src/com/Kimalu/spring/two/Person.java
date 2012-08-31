package com.Kimalu.spring.two;

public class Person {
	@Override
	public String toString() {
		return "idCard.id="+idCard.getId()+"&idCard.address="+idCard.getAddress()+"&name="+name+"&age="+age;
	}

	private IdCard idCard;
	private String name;
	private int age;

	public Person(){
		
	}
	public Person(IdCard idCard,String name,int age){
		this.idCard=idCard;
		this.name=name;
		this.age=age;
	}


}
