package com.shallow.clone;

public class Industry implements Cloneable{
	String name;
	int noOfEmp;

	public Industry(String name, int noOfEmp) {
		this.name = name;
		this.noOfEmp = noOfEmp;
	}

	public void industryInfo() {
		System.out.println("Industry name:" + this.name);
		System.out.println("Num of emp:" + this.noOfEmp);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
