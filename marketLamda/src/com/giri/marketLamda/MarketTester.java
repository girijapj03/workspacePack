package com.giri.marketLamda;

import java.util.ArrayList;
import java.util.Collection;

import com.giri.marketLamda.dao.MarketDAIimpl;
import com.giri.marketLamda.dao.MarketDAO;
import com.giri.marketLamda.dto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {
		MarketDTO dto=new MarketDTO("APMC", "APMC ward", 25, "All");
		MarketDTO dto1=new MarketDTO("K-Mart", "Rann Circle", 1, "Grocery");
		MarketDTO dto2=new MarketDTO("Homeee", "Lokapur-Road", 8, "Home-Accesories");
		MarketDTO dto3=new MarketDTO("Kichen-look", "Shivaji-Circle", 4, "Kitchen-decor");
	MarketDAO dao=new MarketDAIimpl();
		boolean added=dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		System.out.println("checking dto saved :" +added);
		
		MarketDTO found=dao.find((n)-> n.getName().equals("Homeee"));
			System.out.println(found);
			
			 found=dao.find((l)-> l.getLocation().equals("Rann Circle"));
			System.out.println(found);
			
			//found=dao.find((t)->t.getType().equals("All"));
			System.out.println(dao.find((t)->t.getType().equals("All")));
			
			found=dao.find((no)->no.getNoOfshops()>5);
			System.out.println(found);
			
			
			Collection<MarketDTO> market=dao.findAll((many)->many.getNoOfshops() >4);
			System.out.println(market);
	}

}
