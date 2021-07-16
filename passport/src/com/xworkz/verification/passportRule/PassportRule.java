package com.xworkz.verification.passportRule;

public interface PassportRule {
	//boolean CRIMINAL_CASE=false;
	boolean detailsMatch();

	boolean indianCitizen();

	boolean criminalCase();
	

}
