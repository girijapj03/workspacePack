package com.shallow.clone;

public class Language implements Cloneable {
	String name;
	String region;
	int howOld;

	public Language(String name, String region, int howOld) {
		this.howOld=howOld;
		this.name=name;
		this.region=region;
	}

	public void languageInfo() {
		System.out.println(this.name);
		System.out.println(this.region);
		System.out.println(this.howOld);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
