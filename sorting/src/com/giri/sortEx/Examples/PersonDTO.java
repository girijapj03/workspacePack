package com.giri.sortEx.Examples;

import java.io.Serializable;

public class PersonDTO implements Serializable,Comparable<PersonDTO>{
	private String name;
	private int age;
	private String email;
	
	public PersonDTO() {}

	public PersonDTO(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}


	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", email=" + email + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(PersonDTO otherAge) {
		int age1=otherAge.getAge();
		if(this.age==age1)return 0;
		if(this.age>age1)return 1;
		if(this.age<age1)return -1;
		
		return 0;
	}

}
