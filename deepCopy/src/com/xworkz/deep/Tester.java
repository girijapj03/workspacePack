package com.xworkz.deep;

public class Tester {

	public static void main(String[] args) {
		
		
		Colors color=new Colors(1640) ;
		/*Colors col=null;
		try {
			col=(Colors) color.clone();
			col.dispalyColor();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}*/
		Rainbow rainbow=new Rainbow(7,"VIBGYOR", color);
		try {
			rainbow=(Rainbow) rainbow.clone();
			rainbow.displayRain();
		} catch (CloneNotSupportedException e) {
			
		}
		//System.out.println(color.totalNoOfColors);
		
		//col.totalNoOfColors=1640;
		//System.out.println(color.totalNoOfColors);
	}

}
