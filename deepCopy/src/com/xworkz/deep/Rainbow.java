package com.xworkz.deep;
// Creating a copy of object in a different memory location. This is called a Deep copy.
public class Rainbow implements Cloneable {
	int noOfColors;
	String nameOfColors;
	Colors col;

	public Rainbow(int noOfColors, String nameOfColors,Colors col) {
		this.nameOfColors = nameOfColors;
		this.noOfColors = noOfColors;
		
		this.col=col;
	}

	@Override
	protected Rainbow clone() throws CloneNotSupportedException {
		Rainbow rain = (Rainbow) super.clone();
		if(col!=null) {
		rain.col = (Colors) col.clone();
		
		}
		return rain;
	}
	void displayRain() {
		System.out.println(this.nameOfColors);
		System.out.println(this.noOfColors);
		 System.out.println(col.totalNoOfColors);
	}


}
