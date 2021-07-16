package com.xworkz.relieve.company;

import com.xworkz.relieve.rules.ReleiveRule;

public class Xworkz {
	private ReleiveRule rule;

	public Xworkz() {
		System.out.println("created Xworkz");
	}

	public void employeeExit() {
		if (rule != null) {
			System.out.println("rules exist can process with other");
			boolean completed = this.rule.completeBond();
			int period = this.rule.serveNoticePeriod();
			if (completed && period >= ReleiveRule.NOTICE_PERIOD_DAYS) {
				System.out.println("employee can exit...");
			} else {
				System.out.println("cannot exit,as rules are not exist");
			}
		} else {
			System.out.println("rules not exist,cannot exit");
		}

	}

	public void setRule(ReleiveRule rule) {
		this.rule = rule;
	}
}
