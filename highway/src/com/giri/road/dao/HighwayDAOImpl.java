package com.giri.road.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.giri.constant.HighwayType;
import com.giri.road.dto.HighwayDTO;


public class HighwayDAOImpl implements HighwayDAO {
	private List<HighwayDTO> list = new LinkedList<>();

	@Override
	public boolean save(HighwayDTO dto) {
		boolean check = list.add(dto);
		System.out.println("dto was added :" + check);
		System.out.println(dto);
		return check;
	}

	@Override
	public Collection<HighwayDTO> findAll() {
		return this.list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Iterator<HighwayDTO> itr = this.list.iterator();
		Collection<Integer> temparoryColl = new ArrayList<Integer>();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			temparoryColl.add(highwayDTO.getNumber());
		}
		return temparoryColl;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		System.out.println("total no of Highway added :" + total);
		return total;
	}

	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Iterator<HighwayDTO> itr = list.iterator();
		Collection<HighwayDTO> temp = new ArrayList<HighwayDTO>();
		while (itr.hasNext()) {
			HighwayDTO high = itr.next();
			if (high.getType().equals(type)) {
				// System.out.println("Find by HighwayType :" + high.toString());
				temp.add(high);

			}
		}
		return temp;
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String name) {
		Iterator<HighwayDTO> itr = list.iterator();
		Collection<HighwayDTO> temp = new ArrayList<HighwayDTO>();
		while (itr.hasNext()) {
			HighwayDTO high = itr.next();
			if (high.getStateName().equals(name)) {
				// System.out.println("find by state name :" + high.getLength());
				temp.add(high);
			}
		}
		return temp;
	}

	@Override
	public Collection<Integer> findNumberByStateName(String sname) {
		Iterator<HighwayDTO> itr = list.iterator();
		Collection<Integer> temp = new ArrayList<Integer>();
		while (itr.hasNext()) {
			HighwayDTO high = itr.next();
			if (high.getStateName().equals(sname)) {
				// System.out.println("find by state name :"+high.getNumber());
				temp.add(high.getNumber());
			}
		}
		return temp;
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		boolean exit=this.list.contains(dto);
		if(exit) {
			System.out.println("dto found :"+dto);
		}
		else {
			System.out.println("does not exist");
		}
		return  exit;
	}

	@Override
	public boolean isCondition(int number) {
		Iterator<HighwayDTO> itr = list.iterator();
		boolean check = false;
		while (itr.hasNext()) {
			HighwayDTO high = itr.next();
			int num = high.getNumber();
			if (num == number) {

				check = high.isRoadCondition();
			}
		}
		return check;
	}

	@Override
	public double findLengthByNumber(int no) {
		Iterator<HighwayDTO> itr = list.iterator();
		double number = 0;
		while (itr.hasNext()) {
			HighwayDTO high = itr.next();
			number=high.getNumber();
			if (number== no) {
				number = high.getLength();
				System.out.println("find length by num :" +high.getLength());
			}
		}
		return number;
	}

	@Override
	public HighwayDTO findByMaxLength() {
		//HighwayDTO dto=null;
		HighwayDTO dto =  Collections.max(list, Comparator.comparing(s -> s.getLength()));
        System.out.println("The Max length is : " + dto.getLength());

		return dto;
	}
	@Override
	public HighwayDTO findByMinLength() {
		HighwayDTO dto =  Collections.min(list, Comparator.comparing(s -> s.getLength()));
        System.out.println("The Min length is : " + dto.getLength());
		return dto;
	}

}
