package com.giri.templeEX;

//import com.giri.templeEX.dao.TempleDAO;
//import com.giri.templeEX.dao.TempleDAOImpl;
import com.giri.templeEX.dto.TempleDTO;

import java.util.Collection;

import com.giri.templeEX.dao.*;

public class TempleTester {

	public static void main(String[] args) {
		/*
		 * int id, String name, String location, double entryFee, String specialPrasada,
		 * int noOfPujaris, boolean male, String mainGod, boolean kalyani
		 */
		TempleDTO dto = new TempleDTO(1, "Shree Krishna temple", "Udupi", 200, "payasam", 10, true, "Shree Krishna",
				true);
		TempleDTO dto1 = new TempleDTO(2, "Alagar temple", "Maduaia", 2000, "Dosas", 100, true, "Vishnu", true);
		TempleDTO dto2 = new TempleDTO(3, "Annapoorneswari temple", "Hornadu", 200, "Anna&sambar", 10, false,
				"AnnaPoorneswari devi", false);
		TempleDTO dto3 = new TempleDTO(4, "Tirumala temple", "Tirupati", 500, "Laddu", 1000, true, "sri venkateswara ",
				true);
		TempleDTO dto4 = new TempleDTO(5, "Danamma temple", "Savadthi", 200, "Holige", 100, false, "Danamma Devi",
				true);
		TempleDAO dao = new TempleDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.totalItems();
		dao.findFirstItem();
		dao.findLastItem();
		TempleDTO find = dao.findByName("Alagar temple");
		System.out.println(find);
		TempleDTO findLoc = dao.findByLocation("Udupi");
		System.out.println(findLoc);
		TempleDTO findNameLoc = dao.findByLocationAndName("Danamma temple", "Savadthi");
		System.out.println(findNameLoc);

		Collection<TempleDTO> coll = dao.findAll();
		for (TempleDTO templeDTO : coll) {

			System.out.println("find all:" + templeDTO);
		}
		Collection<TempleDTO> coll1 = dao.findAllTempleByLocationStartsWith('T');
		for (TempleDTO templeDTO : coll1) {
			System.out.println("***********");
			System.out.println("starts with :" + templeDTO);
		}

		Collection<TempleDTO> coll2=dao.findAllTempleByEntryFeeGreaterThan(500);
		for(TempleDTO templeDTO:coll2) {
			System.out.println("Greater than:"+templeDTO);
		}
		String check = dao.findLocationByName("Danamma temple");
		System.out.println("checking :" + check);
		System.out.println(dao.findLocationByName("Danamma temple"));
		
		Collection<String> temp = dao.findAllLocations();
		for (String string : temp) {
			System.out.println("find all locations :" + string);
		}

	}
}
