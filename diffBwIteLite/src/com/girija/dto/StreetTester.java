package com.girija.dto;

import java.util.*;

import com.girija.dto.streetDetails.Street;

public class StreetTester {

	public static void main(String[] args) {
		// Street(String name, int pincode, String landMark, String city)

		Street way = new Street("ANAND_NAGAR", 587313, "OM_SHANTINEAR", "MUDHOL");
		Street way1 = new Street("SAI_NAGAR", 587312, "SAINAGAR", "BIJAPUR");
		Street way2 = new Street("BASAV_NAGAR", 587343, "PETROLPUMP", "MAHALINGPUR");
		Street way3 = new Street("Maharaj_colony", 587313, "OM_SHANTINEAR", "MUDHOL");
		Street way4 = new Street("SAI_NAGAR", 587312, "SAINAGAR", "BIJAPUR");
		Street way5 = new Street("BASAV_NAGAR", 587343, "nearHospital", "MAHALINGPUR");

		List<Street> street = new ArrayList<Street>();
		street.add(way);
		street.add(way1);
		street.add(way2);
		List<Street> street1 = new ArrayList<Street>();
		street1.add(way3);
		street1.add(way4);
		street1.add(way5);
		street1.addAll(street);

		System.out.println(street1.size());
		
				
		Iterator itr=street1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		boolean check=street1.containsAll(street);
		System.out.println("yes,it added all street properties :"+check);
		System.out.println(street1.removeAll(street));
		System.out.println(street1.size());
		System.out.println(street1.retainAll(street));
		System.out.println(street1.size());
}
}
