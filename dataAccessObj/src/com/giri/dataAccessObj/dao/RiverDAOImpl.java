package com.giri.dataAccessObj.dao;

import java.util.*;

import com.giri.dataAccessObj.RiverDTO;

public class RiverDAOImpl implements RiverDAO {
	private List<RiverDTO> list = new ArrayList<>();

	@Override
	public boolean save(RiverDTO dto) {
		System.out.println("dto was added :" + list.add(dto));// saving all dto
		System.out.println(dto);// ref cl the toString()
		// this.totlNoOfRivers();
		return true;

	}

	@Override
	public int totlNoOfRivers() {
		int total = list.size();
		System.out.println("total no of rives added :" + total);
		return total;
	}

	@Override
	public void update(RiverDTO dto) {
		boolean exist = list.contains(dto);

		if (exist) {
			System.out.println("River found ,will update it" + dto);
			int indexOfRiver = this.list.indexOf(dto);
			list.set(indexOfRiver, dto);
		} else {
			System.out.println("River does not exist");
		}

	}

	@Override
	public boolean delete(RiverDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed" + " " + this.list.remove(dto));
		}
		return false;
	}

	@Override
	public boolean readTheData(RiverDTO dto) {
		boolean avail = list.contains(dto);
		if (avail) {
			System.out.println("read the data" + dto);
			return avail;
		}
		else {System.out.println("no such data found");
	}
		return false;
}
}
