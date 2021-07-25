package com.giri.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.giri.anonymous.dto.FishDTO;

public class FishTester {

	public static void main(String[] args) {
		FishDTO gouramiFish = new FishDTO("Kissing Gourami", "flesh-colored", 6, 1000d);
		FishDTO molliesFish = new FishDTO("Mollies", "white", 3, 20d);
		FishDTO PlecostomusFish = new FishDTO("Plecostomus", "	Brown", 10, 435.48d);
		FishDTO BettaFish = new FishDTO("Betta Fish", "Red", 3, 150.00d);
		List<FishDTO> list = new ArrayList<FishDTO>();
		list.add(gouramiFish);
		list.add(molliesFish);
		list.add(PlecostomusFish);
		list.add(BettaFish);
		Comparator<FishDTO> sortBycostDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				if(o2.getCost() == o1.getCost()) return 0;
				else if(o2.getCost() > o1.getCost()) return -1;
				else return 1;
			}

		};
		

		Comparator<FishDTO> sortBylisfeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return Integer.valueOf(o2.getLifeSpan()).compareTo(o1.getLifeSpan());
			}
		};

		Comparator<FishDTO> sortByname = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}

		};
		Comparator<FishDTO> sortByColor = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
		};
		Comparator<FishDTO> sortBynameDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};

		
		Collections.sort(list, sortBynameDesc);
		Iterator<FishDTO> itr1 = list.iterator();
		while (itr1.hasNext()) {
			FishDTO fishdt = itr1.next();
			System.out.println("desc name :" +fishdt.getName());
			

	}
		/*Collections.sort(list, sortByname.thenComparing(sortBylisfeSpan).thenComparing(sortByColor)
				.thenComparing(sortBycostDesc));

		
		Iterator<FishDTO> itr = list.iterator();
		while (itr.hasNext()) {
			FishDTO fishdt = itr.next();
			System.out.println("name :" + fishdt.getName() + "," + " lifespan:" + fishdt.getLifeSpan() + "," + "color:"
					+ fishdt.getColor() + " ," +  "cost:" + fishdt.getCost()  );
			
			}*/
		Collections.sort(list,sortBylisfeSpan);
		Iterator<FishDTO> itr4 = list.iterator();
		while (itr4.hasNext()) {
			FishDTO fishdt = itr4.next();
			System.out.println("life span :"+fishdt.getLifeSpan());
		
}
		Collections.sort(list,sortBycostDesc);
		Iterator<FishDTO> itr2 = list.iterator();
		while (itr2.hasNext()) {
			FishDTO fishdt = itr2.next();
			System.out.println("desc cost :" +fishdt.getCost());

		}
		Collections.sort(list,sortByColor);
		Iterator<FishDTO> itr3 = list.iterator();
		while (itr3.hasNext()) {
			FishDTO fishdt = itr3.next();
			System.out.println("color :" +fishdt.getColor());

		}
		
}
	}
