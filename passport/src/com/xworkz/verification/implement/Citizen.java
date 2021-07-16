package com.xworkz.verification.implement;

import com.xworkz.verification.passportRule.PassportRule;

public class Citizen implements PassportRule {
	private String name;
	private long mobileNum;
	
	public Citizen(String name,long num) {
		this.name=name;
		this.mobileNum=num;
		System.out.println(this.mobileNum +"after verifying all your documents ,you will get update ");
	}
	
	@Override
	public boolean detailsMatch() {
		System.out.println("all details are mathing..");
		return true;
	}
	@Override
	public boolean indianCitizen() {
		System.out.println(this.name +": is Indian Citizen");
		return true;
	}
	@Override
	public boolean criminalCase() {
		//System.out.println(" criminal cases...);
		 return false;
	}

}
