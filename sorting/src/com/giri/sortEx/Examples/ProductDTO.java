package com.giri.sortEx.Examples;

import java.io.Serializable;

public class ProductDTO implements Serializable,Comparable<ProductDTO>{
	private String name;
	private String brand;
	private int price;
	private double quantity;
	
	public ProductDTO(String name, String brand, int price, double quantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(ProductDTO product) {
		int pdtPrice=product.getPrice();
		if(this.price==pdtPrice)return 0;
		if(this.price>pdtPrice)return 1;
		if(this.price<pdtPrice)return -1;
		return 0;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

}
