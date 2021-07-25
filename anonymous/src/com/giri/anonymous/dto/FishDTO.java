package com.giri.anonymous.dto;

public class FishDTO {
private String name;
private String color;
private int lifeSpan;
private double cost;
public FishDTO() {}

public FishDTO(String name, String color, int lifeSpan, double cost) {
	super();
	this.name = name;
	this.color = color;
	this.lifeSpan = lifeSpan;
	this.cost = cost;
}

@Override
public String toString() {
	return "FishDTO";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getLifeSpan() {
	return lifeSpan;
}
public void setLifeSpan(int lifeSpan) {
	this.lifeSpan = lifeSpan;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

}
