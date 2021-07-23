package com.giri.mapExample;

import java.util.Map;
import java.util.TreeMap;

public class NameFavFood {

	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String, String>();
		map.put("GIRIJA", "AllCookedByMom");
		map.put("Mridula", "Fish");
		map.put("Darshan", "RaagiMudde");
		map.put("Pavitra", "Patrode");
		map.put("Vaishnavi", "Rotti");
		map.put("Aishwarya", "Akki roti");
		map.put("Sunil", "chicken");
		map.put("Sachin", "Mutton");
		map.put("Ranjitha", "RiceItems");
		System.out.println(map.size());
		for (String value : map.keySet()) {
			System.out.println("Population :" + value);
		}
		for (String string : map.values()) {
			System.out.println("Name:" + string);
		}
		for (String string : map.keySet()) {
			System.out.println("key: " + string + " value: " + map.get(string));
		}
		map.clear();
		System.out.println(map.size());
	}

}
