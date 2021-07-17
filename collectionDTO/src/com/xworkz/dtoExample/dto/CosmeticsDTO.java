package com.xworkz.dtoExample.dto;

import java.io.Serializable;

import com.xworkz.dtoExample.constant.CosmeticsType;

public class CosmeticsDTO implements Serializable{
	private String cosmeticName;
	private String brand;
	private CosmeticsType type;
	private boolean suitableForAllTypeSkin;
	private double uptoHours;

	public CosmeticsDTO(String cosmeticName, String brand, CosmeticsType type, boolean suitableForAllTypeSkin,
			double uptoHours) {
		super();
		this.cosmeticName = cosmeticName;
		this.brand = brand;
		this.type = type;
		this.suitableForAllTypeSkin = suitableForAllTypeSkin;
		this.uptoHours = uptoHours;
	}

	public String getCosmeticName() {
		return cosmeticName;
	}

	public void setCosmeticName(String cosmeticName) {
		this.cosmeticName = cosmeticName;
	}

	public CosmeticsType getType() {
		return type;
	}

	public void setType(CosmeticsType type) {
		this.type = type;
	}

	public boolean isSuitableForAllTypeSkin() {
		return suitableForAllTypeSkin;
	}

	public void setSuitableForAllTypeSkin(boolean suitableForAllTypeSkin) {
		this.suitableForAllTypeSkin = suitableForAllTypeSkin;
	}

	@Override
	public String toString() {
		return "CosmeticsDTO [cosmeticName=" + cosmeticName + ", brand=" + brand + ", type=" + type
				+ ", suitableForAllTypeSkin=" + suitableForAllTypeSkin + ", uptoHours=" + uptoHours + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");
		if (obj == null)
			return false;
		if (obj instanceof CosmeticsDTO) {
			CosmeticsDTO casting = (CosmeticsDTO) obj;
			if (this.brand.equalsIgnoreCase(casting.brand) && this.cosmeticName.equals(casting.cosmeticName)&& this.type.equals(getType())) {
				System.out.println("both are equal :" + this.brand);
				return true;
			} else {
				System.out.println("not equal :" );
				return false;
			}

		}return false;
	}

}
