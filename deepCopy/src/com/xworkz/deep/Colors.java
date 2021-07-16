package com.xworkz.deep;

public class Colors implements Cloneable {
int totalNoOfColors;

public Colors(int totalNoOfColors) {
this.totalNoOfColors=totalNoOfColors;
}
@Override protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
void dispalyColor() {
	System.out.println(this.totalNoOfColors);
}
}
