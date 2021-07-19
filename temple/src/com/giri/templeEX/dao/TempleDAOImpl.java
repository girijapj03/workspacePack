package com.giri.templeEX.dao;

import java.util.*;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;

import com.giri.templeEX.dto.TempleDTO;

public class TempleDAOImpl implements TempleDAO {
	private List<TempleDTO> list = new LinkedList<>();

	@Override
	public boolean save(TempleDTO dto) {
		boolean check = list.add(dto);
		System.out.println("dto was added :" + check);
		System.out.println(dto);
		return check;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		System.out.println("total no of temples added :" + total);
		return total;
	}

	@Override
	public boolean delete(TempleDTO dto) {
		boolean check = this.list.remove(dto);
		if (this.list.contains(dto)) {
			System.out.println("removed" + " " + check);
		}
		return check;
	}

	@Override
	public TempleDTO findFirstItem() {
		TempleDTO first = list.get(0);
		System.out.println("First Temple:" + first);
		return first;
	}

	@Override
	public TempleDTO findLastItem() {
		TempleDTO last = list.get(list.size() - 1);
		System.out.println("Last Temple:" + last);
		return last;
	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;

		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {

			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				System.out.println("find by name");
				dto = templeDTO;
				break;
			}
		}
		return dto;

	}

	@Override
	public TempleDTO findByLocation(String location) {
		TempleDTO dto = null;

		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templerDTO = itr.next();
			if (templerDTO.getLocation().equals(location)) {
				System.out.println("find by location");
				dto = templerDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {

			TempleDTO templerDTO = itr.next();
			if (templerDTO.getName().equals(name) && templerDTO.getLocation().equals(location)) {
				System.out.println("find by name&location");
				dto = templerDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(char value) {
		char values = value;
		String s = Character.toString(values);
		Collection<TempleDTO> temparoryColl = new ArrayList<>();
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeRUN = itr.next();

			if (templeRUN.getLocation().startsWith(s)) {

				temparoryColl.add(templeRUN);

			}
		}
		return temparoryColl;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {

		Iterator<TempleDTO> itr = list.iterator();
		Collection<TempleDTO> temparoryColl = new ArrayList<TempleDTO>();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			// TempleDTO fee = temp.getEntryFee();
			if (temp.getEntryFee() >= cost) {
				temparoryColl.add(temp);
			}
		}
		return temparoryColl;
	}

	@Override
	public Collection<TempleDTO> findAll() {
		return this.list;
	}

	@Override
	public String findLocationByName(String name) {
		
		Iterator<TempleDTO> itr = this.list.iterator();
		String temparory = null;
		while (itr.hasNext()) {
			TempleDTO templerDTO = itr.next();
			if (templerDTO.getName().equals(name)) {
				 //System.out.println("find by location:" + " " + templerDTO.getLocation());
				temparory=templerDTO.getLocation();
			}
		}
		return temparory;
	}

	@Override
	public Collection<String> findAllLocations() {
		Iterator<TempleDTO> itr = this.list.iterator();
		Collection<String> temparoryColl = new ArrayList<String>();
		while (itr.hasNext()) {
			TempleDTO templerDTO = itr.next();
			// System.out.println(templerDTO.getLocation());
			temparoryColl.add(templerDTO.getLocation());
		}
		return temparoryColl;
	}

}
