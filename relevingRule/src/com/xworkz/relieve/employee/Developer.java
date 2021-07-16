package com.xworkz.relieve.employee;

import com.xworkz.relieve.rules.ReleiveRule;

public class Developer implements ReleiveRule {
	private String name;
	
	public Developer(String name) {
		this.name=name;
	}

	@Override
	public boolean completeBond() {
		System.out.println(this.name +" "+ "completed bond");
		return false;
	}

	@Override
	public int serveNoticePeriod() {
		System.out.println(this.name +" "+ "serve notice period");
		return 60;
	}
}
