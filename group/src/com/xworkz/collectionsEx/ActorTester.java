package com.xworkz.collectionsEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActorTester {

	public static void main(String[] args) {
		String Actor1 = "SRK";
		String Actor2 = "Shahid";
		String Actor3 = "Sudeep";
		String Actor4 = "Yash";
		String Actor5 = "Leonardo_cobb";
		String Actor6 = "KatrinaKaif";
		String Actor7 = "Samantha ";
		String Actor8 = "Allu-Arjun";
		String Actor9 = "Prabhas";
		String Actor10 = "Anushka";

		Collection collection = new ArrayList();
		boolean collectionReturn = false;

		collectionReturn = collection.add(Actor1);
		collectionReturn = collection.add(Actor2);
		collectionReturn = collection.add(Actor3);
		collectionReturn = collection.add(Actor4);
		collectionReturn = collection.add(Actor5);
		collectionReturn = collection.add(Actor6);
		collectionReturn = collection.add(Actor7);
		collectionReturn = collection.add(Actor8);
		collectionReturn = collection.add(Actor9);
		collectionReturn = collection.add(Actor10);
		System.out.println(collectionReturn);
		System.out.println(collection.size());
		System.out.println("it checks the provided content is there or not:" + collection.contains("Sonu Sood"));
		System.out.println("it removes specified element from collection :" + collection.remove(Actor2));
		System.out.println("Array List Size after remove():" + collection.size());

		Iterator sameAsFor = collection.iterator();

		Object obj = sameAsFor.next();
		System.out.println("1st next :" + obj);
		System.out.println("2nd next :" + sameAsFor.next());
		System.out.println("3rd next :" + sameAsFor.next());// every hasnext needs next method
		System.out.println("4th next :" + sameAsFor.next());
		System.out.println("5thnext :" + sameAsFor.next());
		System.out.println("6thnext :" + sameAsFor.next());
		collection.clear();
		System.out.println("Array List Size after clear():" + collection.size());

	}

}
