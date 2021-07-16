package com.giri.sortEx;

import java.util.*;

import com.giri.sortEx.Examples.Alcohol;

public class AlcoholTester {

	public static void main(String[] args) {
		Alcohol drinks = new Alcohol("McDowells", 700, "blended scotch", 500);
		Alcohol drinks1 = new Alcohol("KingFisher", 700, "blended scotch", 500);
		Alcohol drinks2 = new Alcohol("Ricardr", 700, "blended scotch", 500);
		Alcohol drinks3 = new Alcohol("ChivaRegal", 700, "blended scotch", 500);
		Alcohol drinks4 = new Alcohol("Jackdaniels", 700, "blended scotch", 500);
		Alcohol drinks5 = new Alcohol("Havana Club", 700, "blended scotch", 500);

		List<Alcohol> list = new ArrayList<>();
		list.add(drinks);
		list.add(drinks1);
		list.add(drinks2);
		list.add(drinks3);
		list.add(drinks4);
		list.add(drinks5);
		
		List<String> list1=new ArrayList<>();
		list1.add(McDowells)

		for (Alcohol alcohol : list) {
			System.out.println(alcohol);
		}
		System.out.println("*******");
		
		Collections.sort(list);

		for (Alcohol alcohol : list) {
			System.out.println(alcohol);
		}
	}

}
