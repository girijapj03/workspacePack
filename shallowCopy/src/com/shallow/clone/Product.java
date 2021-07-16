package com.shallow.clone;

import com.shallow.clone.constants.ProductType;

public class Product implements Cloneable {
	int productId;
	String name;
	double price;
	ProductType type;
	public Product(String name) {
		this.name=name;
	}

	public void productInfo() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.productId);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
