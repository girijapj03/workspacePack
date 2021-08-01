package com.giri.grocery.dto;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class GroceryDTO implements Serializable {
	private String name;
	private double price;
	private double quantity;
	private String brand;
	private Date expiryDate;
	private Date manufcatureDate;
	private String expireDate;
	private String manufactureDate;
	private boolean organic;
	private boolean veg;
	private long barCodeNUm;

	public GroceryDTO() {
	
	}

	public GroceryDTO(String name, double price, double quantity, String brand, Date expiryDate, Date manufcatureDate,
			String expireDate, String manufactureDate, boolean organic, boolean veg, long barCodeNUm) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.expiryDate = expiryDate;
		this.manufcatureDate = manufcatureDate;
		this.expireDate = expireDate;
		this.manufactureDate = manufactureDate;
		this.organic = organic;
		this.veg = veg;
		this.barCodeNUm = barCodeNUm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (barCodeNUm ^ (barCodeNUm >>> 32));
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
		result = prime * result + ((manufcatureDate == null) ? 0 : manufcatureDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (organic ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (veg ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryDTO other = (GroceryDTO) obj;
		if (barCodeNUm != other.barCodeNUm)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		if (manufcatureDate == null) {
			if (other.manufcatureDate != null)
				return false;
		} else if (!manufcatureDate.equals(other.manufcatureDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (organic != other.organic)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(quantity) != Double.doubleToLongBits(other.quantity))
			return false;
		if (veg != other.veg)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", price=" + price + ", quantity=" + quantity + ", brand=" + brand
				+ ", expiryDate=" + expiryDate + ", manufcatureDate=" + manufcatureDate + ", expireDate=" + expireDate
				+ ", manufactureDate=" + manufactureDate + ", organic=" + organic + ", veg=" + veg + ", barCodeNUm="
				+ barCodeNUm + "]";
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	public String getBrand() {
		return brand;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public Date getManufcatureDate() {
		return manufcatureDate;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public boolean isOrganic() {
		return organic;
	}

	public boolean isVeg() {
		return veg;
	}

	public long getBarCodeNUm() {
		return barCodeNUm;
	}
	
	
	
}