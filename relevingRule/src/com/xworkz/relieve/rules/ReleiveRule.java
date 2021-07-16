package com.xworkz.relieve.rules;

public interface ReleiveRule {
	int NOTICE_PERIOD_DAYS = 60;

	boolean completeBond();

	int serveNoticePeriod();
}
