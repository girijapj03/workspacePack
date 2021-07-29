package com.giri.rogiOptinal.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import java.util.Optional;

import com.giri.rogiOptinal.dto.RogiDTO;
import com.giri.rogiOptinal.search.RogiSearch;

public class RogiDAOimpl implements RogiDAO {
	Collection<RogiDTO> collection = new ArrayList<RogiDTO>();

	@Override
	public Optional<RogiDTO> findOne(RogiSearch search) {
		Iterator<RogiDTO> itr = this.collection.iterator();
		Optional<RogiDTO> optinal = Optional.empty();
		while (itr.hasNext()) {
			RogiDTO dto = itr.next();
			if (search.huduku(dto)) {
				optinal = Optional.of(dto);
			}
		}
		return null;
	}

	@Override
	public Optional<Integer> totalSize() {

		Optional<Integer> size=Optional.of(collection.size());
		return size;
	}

	@Override
	public Optional<RogiDTO> findByMaxAge() {
		Optional<RogiDTO> opt = Optional.empty();
		RogiDTO dto1 = null;

		Iterator<RogiDTO> itr = this.collection.iterator();
		while (itr.hasNext()) {
			RogiDTO dto = itr.next();
			dto = Collections.max(collection, Comparator.comparing(s -> s.getAge()));
			System.out.println("The Max length is : " + dto.getAge());
			dto1 = dto;
		}
		return Optional.ofNullable(dto1);

	}

	@Override
	public Optional<RogiDTO> findByMinAge() {
		Optional.ofNullable(collection).orElse(Collections.emptyList()).forEach((n)-> {
		RogiDTO dto = Collections.min(collection, Comparator.comparing(s -> s.getAge()));
		System.out.println("The Min length is : " + dto.getAge());
		
		});
		return null;
	}

	
	

	@Override
	public Collection<RogiDTO> findAll() {

		return this.collection;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch search) {
		Collection<RogiDTO> dt = new ArrayList<RogiDTO>();

		collection.forEach((s -> {
			if (search.huduku(s)) {
				collection.add(s);
			}
		}));
		return null;
	}

}
