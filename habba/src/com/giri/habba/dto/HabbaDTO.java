package com.giri.habba.dto;

import java.io.Serializable;

import com.giri.habba.constant.Religion;

public class HabbaDTO implements Serializable {
private String name;
private String region;
private int noOfDays;
private String specialFood;
private Religion religion;
public HabbaDTO() {}
public HabbaDTO(String name, String region, int noOfDays, String specialFood, Religion religion) {
	super();
	this.name = name;
	this.region = region;
	this.noOfDays = noOfDays;
	this.specialFood = specialFood;
	this.religion = religion;
}
@Override
public String toString() {
	return "HabbaDTO [name=" + name + ", region=" + region + ", noOfDays=" + noOfDays + ", specialFood=" + specialFood
			+ ", religion=" + religion + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((region == null) ? 0 : region.hashCode());
	result = prime * result + ((religion == null) ? 0 : religion.hashCode());
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
	HabbaDTO other = (HabbaDTO) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (region == null) {
		if (other.region != null)
			return false;
	} else if (!region.equals(other.region))
		return false;
	if (religion != other.religion)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public int getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}
public String getSpecialFood() {
	return specialFood;
}
public void setSpecialFood(String specialFood) {
	this.specialFood = specialFood;
}
public Religion getReligion() {
	return religion;
}
public void setReligion(Religion religion) {
	this.religion = religion;
}

}
