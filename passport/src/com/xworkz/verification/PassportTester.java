package com.xworkz.verification;

import com.xworkz.verification.externalAffairs.PassportSeva;
import com.xworkz.verification.implement.Citizen;
import com.xworkz.verification.passportRule.PassportRule;

public class PassportTester {

	public static void main(String[] args) {
		PassportRule rule=new Citizen("Girija",9945413703l);
	PassportSeva verify =new PassportSeva();
	verify.setRule(rule);
	verify.passportVerification();

	}

}
