package com.girija.dto.streetDetails;

import java.io.Serializable;

public class Street implements Serializable {
	private String name;
	private int pincode;
	private String landMark;
	private String city;

	public Street(String name, int pincode, String landMark, String city) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.landMark = landMark;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Street [name=" + name + ", pincode=" + pincode + ", landMark=" + landMark + ", city=" + city + "]";
	}

	@Override
	public boolean equals(Object obj) {
		

		return false;
	}

}
