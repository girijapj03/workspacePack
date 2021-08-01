package com.giri.grocery;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.giri.grocery.dao.GroceryDAO;
import com.giri.grocery.dao.GroceryDAOImple;
import com.giri.grocery.dto.GroceryDTO;

public class GroceryTester {

	public static void main(String[] args) {
		Calendar manuDate = Calendar.getInstance();
		manuDate.set(2018, 9, 21);
		Calendar expDate = Calendar.getInstance();
		expDate.set(2034, 9, 21, 12, 48);
		Date date = new Date();

		GroceryDTO dto2 = new GroceryDTO("HesaruBelle", 88, 5d, "jawari",manuDate.getTime(),date ,"2030/7/9", "11/5/2015",  true, true,
				66689789787l);
		GroceryDTO dto1 = new GroceryDTO("soap", 115, 1d, "DOVE", manuDate.getTime(),expDate.getTime(), "2034/3/9", "2013/4/5", true, true, 455454554455l);
		GroceryDTO dto3 = new GroceryDTO("oil", 156d, 1d, "Freedom-sunflower oil",manuDate.getTime(),expDate.getTime(), "2023/5/7", "2021/3/4", true, true,
				87989089789l);
		GroceryDTO dto4 = new GroceryDTO("Chocolate", 450, 25, "KIT_KAT",manuDate.getTime(),expDate.getTime(), "25/12/2021", "1/03/2015", true, true,
				789122331l);
		GroceryDAO dao = new GroceryDAOImple();
		dao.create(dto1);
		dao.create(dto3);
		dao.create(dto2);
		List<GroceryDTO> list = Arrays.asList(dto1, dto3, dto2, dto4);
		
		
		
		Optional<GroceryDTO> findone = dao.findOneGrocerySearch(f -> f.getName().equals("HesaruBelle"));
		if (findone.isPresent()) {
			GroceryDTO dt = findone.get();
			System.out.println("found : " + dt);
		} else {
			System.out.println("dto not found");
		}
		

		Optional<GroceryDTO> dtofound1 = list.stream().filter(q -> q.getManufactureDate().equals("1/03/2015"))
				.findAny();
		if (dtofound1.isPresent()) {
			GroceryDTO opt1 = dtofound1.get();
			System.out.println("ManufactureDate:"+opt1);
		} else {
			System.out.println("manufactue date not found");
		}

		Collection<GroceryDTO> coll = dao.findAllGrocerySearch(b -> b.getName().equals("soap"));
		for (GroceryDTO grocery : coll) {
			System.out.println(grocery);
		}

		System.out.println(dao.findByMaxQuantity());

		Optional<GroceryDTO> dtofound2 = list.stream().filter(s -> s.getExpireDate().equals("1/03/2015")).findAny();
		if (dtofound2.isPresent()) {
			GroceryDTO opt1 = dtofound2.get();
			System.out.println(opt1);

		} else {
			System.out.println("expirydate not found");
		}

	}

}
