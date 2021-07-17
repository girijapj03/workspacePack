package com.giri.dataAccessObj;

import com.giri.dataAccessObj.dao.RiverDAO;
import com.giri.dataAccessObj.dao.RiverDAOImpl;

public class RiverTester {

	public static void main(String[] args) {
		RiverDAO dao = new RiverDAOImpl();
		RiverDTO river = new RiverDTO("Kaveri", "Tala kaveri", 805d, 2, true);
		RiverDTO river1 = new RiverDTO("Ganga", "Gomukh", 2525d, 5, true);

		dao.save(river);
		dao.save(river1);
		
		RiverDTO gangaUpdate = new RiverDTO("Ganga", "Gomukh", 2525d, 5, false);
		dao.update(gangaUpdate);
		dao.totlNoOfRivers();
		
		
		RiverDTO riverRemove = new RiverDTO("Kaveri", "Gomukh", 2525d, 5, false);
		dao.delete(riverRemove);
		dao.totlNoOfRivers();
		dao.readTheData(riverRemove);
		
	}

}
