package com.xworkz.dtoExample.dto;

import java.io.Serializable;

import com.xworkz.dtoExample.constant.ChocoType;

public class ChocolateDTO implements Serializable {
	private String brand;
	private String name;
	private ChocoType type;
	private double price;
	private double weight;
	private boolean crispy;

	public ChocolateDTO() {
		System.out.println("defaut const of chocolate");
	}

	public ChocolateDTO(String brand, String name, ChocoType type, double price, double weight, boolean crispy) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.crispy = crispy;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return "changingReturntype";
	}

	public void setType(ChocoType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isCrispy() {
		return crispy;
	}

	public void setCrispy(boolean crispy) {
		this.crispy = crispy;
	}

	@Override
	public String toString() {

		return "ChocolateDTO [brand=" + brand + ",name=" + name + ",price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals checking method");
		if (obj == null)
			return false;
		if (obj instanceof ChocolateDTO) {
			ChocolateDTO casting = (ChocolateDTO) obj;
			if (this.brand.equalsIgnoreCase(casting.brand) && this.name.equals(casting.name)) {
				System.out.println("both are equal :" + this.brand);
				return true;
			} else {
				System.out.println("not equal :" );
				return false;
			}

		}return false;
	}
	
}
