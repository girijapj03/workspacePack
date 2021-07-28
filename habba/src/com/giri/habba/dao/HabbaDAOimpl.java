package com.giri.habba.dao;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

import com.giri.habba.dto.HabbaDTO;
import com.giri.habba.search.HabbaSearch;

public class HabbaDAOimpl implements HabbaDAO {
	private List<HabbaDTO> list = new ArrayList<>();

	// private HabbaDTO dto;

	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean add=list.add(dto);
		System.out.println("calling save :" + add);
		return add;
	}

	@Override
	public HabbaDTO ondunaHuduku(HabbaSearch huduku) {
		List<HabbaDTO> temp = new ArrayList<HabbaDTO>();
		list.forEach((dt) -> {
			if (huduku.huduku(dt)) {
				temp.add(dt);

			}
		});

		return temp.get(0);
	}

	@Override
	public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch huduku) {

		Collection<HabbaDTO> coll = new ArrayList<HabbaDTO>();
		list.forEach((dto) -> {
			if (huduku.huduku(dto))
				coll.add(dto);
		});
		System.out.println("yellavanuHuduku");
		return coll;
	}

	/*
	 * @Override public HabbaDTO ondunaHuduku(HabbaSearch search) {
	 * Iterator<HabbaDTO> itr = list.iterator(); HabbaDTO habba = null; while
	 * (itr.hasNext()) { HabbaDTO habbDTO = itr.next(); if (search.huduku(habbDTO))
	 * { habba = habbDTO; break; } } return habba; }
	 * 
	 * @Override public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search) {
	 * Iterator<HabbaDTO> loop = list.iterator(); Collection<HabbaDTO> temp = new
	 * ArrayList<HabbaDTO>(); while (loop.hasNext()) { HabbaDTO habbadTO =
	 * loop.next(); if (search.huduku(habbadTO)) { temp.add(habbadTO); } } return
	 * temp; }
	 */

}
