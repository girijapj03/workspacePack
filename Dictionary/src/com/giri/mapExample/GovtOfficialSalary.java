package com.giri.mapExample;

import java.util.HashMap;
import java.util.Map;

public class GovtOfficialSalary {

	public static void main(String[] args) {
		Map<String, Integer> govt = new HashMap<String, Integer>();
		govt.put("President", 500000);
		govt.put("Vice-President", 400000);
		govt.put("Prime MInister", 160000);
		govt.put("Governors of states", 350000);
		govt.put("Chief justice of supreme Court", 280000);
		govt.put("Judges of supreme Court", 250000);
		govt.put("Chief ustice and HighCourts", 250000);
		govt.put("Judges of high Court", 225000);
		System.out.println("Total Size () :" + govt.size());
		for (String key : govt.keySet()) {
			System.out.println("Population :" + key);
		}
		for (Integer value : govt.values()) {
			System.out.println("Country :" + value);
		}
		for (String i : govt.keySet()) {
			System.out.println("key: " + i + " value: " + govt.get(i));
		}
		System.out.println(govt.containsKey("Judges of high Court"));
		System.out.println(govt.containsValue(225000));
		System.out.println(govt.get("Prime MInister"));
		boolean check = govt.isEmpty();
		System.out.println("checking is empty():" + check);
		Integer removed = govt.remove("Prime MInister");
		System.out.println("removed prime minister:" + removed);

		govt.clear();
		System.out.println("after clear:" + govt.size());
	}

}
