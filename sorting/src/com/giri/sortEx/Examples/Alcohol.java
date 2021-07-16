package com.giri.sortEx.Examples;

import java.io.Serializable;

public class Alcohol implements Serializable,Comparable<Alcohol> {
	private String brand;
	private int price;
	private String scotch;
	private int quantity;
	public Alcohol(String brand, int price, String scotch, int quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Alcohol obj) {
		String brand1=obj.getBrand();
		
		
		return 0;
	}
	public Alcohol(String brand) {
		super();
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Alcohol [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
