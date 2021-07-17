package com.xworkz.dto.dtoEx;

import com.xworkz.dto.constant.MovieType;

public class MovieDTO {
	private String name;
	private String languge;
	private double hours;
	private MovieType type;
	private boolean availInPrime;

	public MovieDTO() {
		System.out.println("Invoked explicit Default constructor");
	}

	public MovieDTO(String name, String languge, double hours, MovieType type, boolean availInPrime) {
		super();
		this.name = name;
		this.languge = languge;
		this.hours = hours;
		this.type = type;
		this.availInPrime = availInPrime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(this.name + ":my fvrt movie");
		this.name = name;
	}

	public String getLanguge() {
		return languge;
	}

	public void setLanguge(String languge) {
		this.languge = languge;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public MovieType getType() {
		return type;
	}

	public void setType(MovieType type) {
		this.type = type;
	}

	public boolean isAvailInPrime() {
		return availInPrime;
	}

	public void setAvailInPrime(boolean availInPrime) {
		System.out.println("You can watch it in Prime");
		this.availInPrime = availInPrime;
	}
}
