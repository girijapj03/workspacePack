package com.xworkz.collectionsEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {
		long me=9945413703l;
		long tom=9090884545l;
		long jerry=8908908900l;
		long doreamon=8989896767l;
		long nobita=7654321099l;
		long sizuka=8899005665l;
		long oggy=9898067676l;
		long scoob=9090900000l;
		long cindrella=89076509094l;
		
		Collection collection = new ArrayList();
		boolean collectionReturn = false;

		collectionReturn = collection.add(me);
		collectionReturn = collection.add(tom);
		collectionReturn = collection.add(jerry);
		collectionReturn = collection.add(doreamon);
		collectionReturn = collection.add(nobita);
		collectionReturn = collection.add(sizuka);
		collectionReturn = collection.add(oggy);
		collectionReturn = collection.add(scoob);
		collectionReturn = collection.add(cindrella);
		collectionReturn = collection.add(9080999980l);
		System.out.println(collectionReturn);
		System.out.println("total size:"+collection.size());
		System.out.println("it checks the provided content is there or not:" + collection.contains(9080883456l));
		System.out.println("it removes specified element from collection :" + collection.remove(me));
		System.out.println("Array List Size after remove():" + collection.size());

		Iterator sameAsFor = collection.iterator();

		Object obj = sameAsFor.next();
		System.out.println("1st next :" + obj);
		System.out.println("2nd next :" + sameAsFor.next());
		System.out.println("3rd next :" + sameAsFor.next());// every hasnext needs next method
		System.out.println("4th next :" + sameAsFor.next());
		System.out.println("5thnext :" + sameAsFor.next());
		System.out.println("6thnext :" + sameAsFor.next());
		System.out.println("7thnext :" + sameAsFor.next());
		System.out.println("8thnext :" + sameAsFor.next());
		System.out.println("9thnext :" + sameAsFor.next());
		//System.out.println("10thnext :" + sameAsFor.next());//NoSuchElementException
		collection.clear();
		System.out.println("Array List Size after clear():" + collection.size());

		
	}

}
