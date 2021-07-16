package com.xworkz.telecast;

import java.io.Serializable;

public class TelevisionDTO implements Serializable {

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfPorts() {
		return noOfPorts;
	}

	public void setNoOfPorts(int noOfPorts) {
		this.noOfPorts = noOfPorts;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	private String brand;
	private double price;
	private int noOfPorts;
	private boolean smart;

	public TelevisionDTO() {
		System.out.println("Init TelevisionDTO");
	}

	public TelevisionDTO(String brand, double price, int noOfPorts, boolean smart) {
		super();
		this.brand = brand;
		this.price = price;
		this.noOfPorts = noOfPorts;
		this.smart = smart;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from TelevisionDTO");
		return "Tom&Jerry";
	}
}
