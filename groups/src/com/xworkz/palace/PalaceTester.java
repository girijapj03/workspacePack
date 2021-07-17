package com.xworkz.palace;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
import java.util.*;

public class PalaceTester {

	public static void main(String[] args) {
		String mysore = "Mysore Palace";
		String udaipur = "Udaivilas Palace";
		String jaipur = "Rambagh Palace ";
		String shimla = "Wildflower Hall";
		String ooty = "Fernhills Royal";
		String udaipur1 = "Taj Lake PAlace";
		String hyderbad = "Chowmahalla Palace";
		String bhuj = "Prag Mahal";
		String leh = "Leh Palace";
		String jammu = "Mubarak Mandi Palace";

		Collection collection = new ArrayList();
		boolean adder = false;
		adder = collection.add(mysore);//Mysore Palace
		adder = collection.add("Taj MAhal");//Udaivilas Palace
		adder = collection.add(udaipur);//Rambagh Palace
		adder = collection.add(jaipur);//Wildflower Hall
		adder = collection.add(shimla);
		adder = collection.add(ooty);
		adder = collection.add(udaipur1);
		adder = collection.add(bhuj);
		adder = collection.add(leh);
		adder = collection.add(jammu);
		System.out.println(adder);

		System.out.println("Array List Size:" + collection.size());

		String check = "Taj MAhal";
		System.out.println("it checks the provided content is there or not:" + collection.contains(check));
		System.out.println("it checks the provided content is there or not:" + collection.contains("Disney Palace"));

		boolean removeThis = collection.remove(leh);
		System.out.println(removeThis);
		System.out.println("it removes specified element from collection :" + collection.remove(ooty));
		System.out.println("Array List Size after remove():" + collection.size());

		Iterator sameAsFor = collection.iterator();
		/*sameAsFor.hasNext();
		Object obj = sameAsFor.next();
		System.out.println("1st next :"+obj);
		sameAsFor.hasNext();
		sameAsFor.hasNext();
		System.out.println("2nd next :"+sameAsFor.next());
		//sameAsFor.hasNext();
		//sameAsFor.hasNext();
		System.out.println("3rd next :"+sameAsFor.next());//every hasnext needs next method 
		System.out.println("4th next :"+sameAsFor.next());
		System.out.println("5thnext :"+sameAsFor.next());
		System.out.println("6thnext :"+sameAsFor.next());*/
		
		while(sameAsFor.hasNext()) {
			Object obj=sameAsFor.next();//abstract
			System.out.println(obj);
		}
		collection.clear();
		System.out.println("Array List Size after clear():" + collection.size());
		
		
	}

}
