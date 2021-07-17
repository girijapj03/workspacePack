package com.xworkz.dto.dtoEx;

public class PlaceDTO {
	private String name;
	private int pincode;
	private String famousFor;
	private String location;
	private boolean inKarnataka;

	public PlaceDTO(String name, int pincode, String famousFor, String location, boolean inKarnataka) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.famousFor = famousFor;
		this.location = location;
		this.inKarnataka = inKarnataka;
	}

	public PlaceDTO() {
		System.out.println("Invoked explicit Default constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(" name :" + name);
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
		System.out.println("pincode :" + pincode);
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
		System.out.println(this.name + " " + "is famous For" + " " + famousFor);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isInKarnataka() {
		return inKarnataka;
	}

	public void setInKarnataka(boolean inKarnataka) {
		this.inKarnataka = inKarnataka;
	}

}
