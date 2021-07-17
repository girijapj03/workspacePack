package com.xworkz.dto.dtoEx;

import java.io.Serializable;

public class countryDTO implements Serializable{
	private String countryName;
	private int numOfStates;
	private int totalCountries;
	private String subRegion;

	public countryDTO(String countryName, int numOfStates, int totalCountries, String subRegion) {
		super();
		this.countryName = countryName;
		this.numOfStates = numOfStates;
		this.totalCountries = totalCountries;
		this.subRegion = subRegion;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getNumOfStates() {
		return numOfStates;
	}

	public void setNumOfStates(int numOfStates) {
		this.numOfStates = numOfStates;
	}

	public int getTotalCountries() {
		return totalCountries;
	}

	public void setTotalCountries(int totalCountries) {
		this.totalCountries = totalCountries;
	}

	public String getSubRegion() {
		return subRegion;
	}

	public void setSubRegion(String subRegion) {
		this.subRegion = subRegion;
	}

}
