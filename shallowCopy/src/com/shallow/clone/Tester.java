package com.shallow.clone;

public class Tester {
//Creating a new reference that points to the same memory location. This is also called a Shallow copy.
	public static void main(String[] args) {
		Product product = new Product("HEADSET");
		product.price = 2999.0;

		System.out.println("cloning....");
		try {
			Product product1 = (Product) product.clone();
			product1.productInfo();
			System.out.println("Product name :" + product1.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		Language language = new Language("KANNADA", "KARNATAKA", 2500);// Unhandled exception type
																		// CloneNotSupportedException
		try {
			Language language1 = (Language) language.clone();
			System.out.println("how old KANNADA language is:" + language1.howOld);
		} catch (CloneNotSupportedException e) {
			System.out.println("EXCEPTION ..");
			// e.printStackTrace();
		}

	}

}
