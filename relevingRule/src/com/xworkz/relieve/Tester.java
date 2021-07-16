package com.xworkz.relieve;

import com.xworkz.relieve.company.Xworkz;
import com.xworkz.relieve.employee.Developer;
import com.xworkz.relieve.rules.ReleiveRule;

public class Tester {

	public static void main(String[] args) {
		ReleiveRule relieveRule=new Developer("XYZ");
		Xworkz xworkz=new Xworkz();
		xworkz.setRule(relieveRule);
		xworkz.employeeExit();
		

	}

}
