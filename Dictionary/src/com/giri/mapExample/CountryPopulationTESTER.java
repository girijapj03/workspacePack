package com.giri.mapExample;

import java.util.HashMap;
import java.util.Map;

public class CountryPopulationTESTER {
	public static void main(String[] args) {
		Map<Long, String> countryPopulation = new HashMap<Long, String>();
		countryPopulation.put(1380004385l, "India");
		countryPopulation.put(1439323776L, "china");
		countryPopulation.put(331002651L, "United States");
		countryPopulation.put(273523615L, "Indonesia");
		countryPopulation.put(212559417L, "Brazil");
		countryPopulation.put(206139589L, "Nigeria");
		countryPopulation.put(145934462L, "Russia");
		countryPopulation.put(128932753L, "Mexico");
		countryPopulation.put(102334404L, "Egypt");
		countryPopulation.put(83992949L, "Iran");
		System.out.println(countryPopulation.size());
		for (Long value : countryPopulation.keySet()) {
			System.out.println("Population :" + value);
		}
		for (String string : countryPopulation.values()) {
			System.out.println("Country :" + string);
		}
		for (Long i : countryPopulation.keySet()) {
			System.out.println("key: " + i + " value: " + countryPopulation.get(i));
		}
		System.out.println(countryPopulation.containsKey(102334404L));
		System.out.println(countryPopulation.containsValue("Russia"));
		System.out.println(countryPopulation.get(90909090909l));
		boolean check = countryPopulation.isEmpty();
		System.out.println("checking is empty():" + check);
		boolean removed = countryPopulation.remove(102334404L, "Egypt");
		System.out.println("removed :" + removed);

		System.out.println("remove by key :" + countryPopulation.remove(206139589L));

		// System.out.println(countryPopulation.replace(212559417L, "b"));
		countryPopulation.clear();
		System.out.println(countryPopulation.size());
		boolean check1= countryPopulation.isEmpty();
		System.out.println("checking is empty():" + check1);
	}
}
