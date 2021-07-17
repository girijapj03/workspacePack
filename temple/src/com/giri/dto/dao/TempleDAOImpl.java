package com.giri.dto.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.giri.dto.TempleDTO;

public class TempleDAOImpl implements TempleDAO {
	private List<TempleDTO> list = new LinkedList<>();

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("dto was added :" + list.add(dto));
		System.out.println(dto);
		return true;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		System.out.println("total no of temples added :" + total);
		return total;
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed" + " " + this.list.remove(dto));
		}
		return false;
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
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(String sam) {
		// TempleDTO dto=null;
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO e = itr.next();
			String s = e.toString();

			if (s.startsWith(sam)) {
				boolean found = s.startsWith(sam);
				System.out.println("found :" + found + " " + e);
				break;
			}
		}
		return null;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO e = itr.next();
			double fee = e.getEntryFee();
			if (fee >= cost) {
				System.out.println("greater than " + cost + " " + e);
			}
		}
		return null;
	}

	@Override
	public Collection<TempleDTO> findAll() {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO temple = itr.next();
			System.out.println("Find All :" + temple);
		}
		return null;
	}

	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templerDTO = itr.next();
			if (templerDTO.getLocation().equals(name)) {
				System.out.println("find by location"+templerDTO);
			}
		}
		return "not found";
	}

	@Override
	public Collection<String> findAllLocations() {
		
		return null;
	}

}
