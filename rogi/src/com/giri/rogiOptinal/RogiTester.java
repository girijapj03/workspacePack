package com.giri.rogiOptinal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.giri.rogiOptinal.dao.RogiDAO;
import com.giri.rogiOptinal.dao.RogiDAOimpl;
import com.giri.rogiOptinal.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {
		RogiDTO dto=new RogiDTO(121,"Bhuvi", 29, "Marivine kayile", false);
		RogiDTO dto1=new RogiDTO(131,"Varudhini", 30, "daibitic", false);
		RogiDTO dto2=new RogiDTO(141,"Sudeep", 49, "Covid-19", true);
		RogiDTO dto3=new RogiDTO(141,"Darshan", 50, "Pseudobulbar", false);
		RogiDTO dto4=new RogiDTO(151,"Harsha ", 36, "Lung infection", true);
		Collection<RogiDTO> coll=Arrays.asList(dto,dto1,dto,dto3,dto4);
		
		RogiDAO dao=new RogiDAOimpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		Optional<RogiDTO> temp=dao.findOne((r)-> r.getName().equals("Bhuvi"));
		boolean v=temp.isPresent();
		System.out.println("present :"+v);
		if(temp.isPresent()) {
			RogiDTO rogidto=temp.get();
			System.out.println("found :"+rogidto);
		}else {
			System.out.println("dto not found");
		}
		
		Optional<RogiDTO> dt1=dao.findByMaxAge();
		System.out.println(dt1);
		System.out.println(dao.findByMinAge());
		Optional<RogiDTO> dt=dao.findOne((n)->n.getName().equals(dto1));
		System.out.println(dt);
		
	}

}
