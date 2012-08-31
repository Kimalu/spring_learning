package com.Kimalu.spring.one;

public class Person {
	@Override
	public String toString() {
		return "idCard.id=" + idCard.getId() + "&idCard.address="
				+ idCard.getAddress() + "&name=" + name + "&age=" + age;
	}

	private IdCard idCard;
	private String name;
	private int age;

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
