package com.xworkz.verification.externalAffairs;

import com.xworkz.verification.passportRule.PassportRule;

public class PassportSeva {
	private PassportRule passportRule;

	public PassportSeva() {
		System.out.println("Calling external affairs");
	}

	public void passportVerification() {
		if (passportRule != null) {
			System.out.println("passport verification can start now");
			boolean match = this.passportRule.detailsMatch();
			boolean indian = this.passportRule.indianCitizen();
			boolean criminal = this.passportRule.criminalCase();
			if (match == true && indian == true && criminal ==true) {
				System.out.println("Verification success"); 
			} else {
				System.out.println("verification failed");
			}
		} else {
			System.out.println("All rules not followed,cant proceed to next");
		}
	}

	public void setRule(PassportRule passportRule) {
		this.passportRule = passportRule;
	}
}
