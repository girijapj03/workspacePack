package com.giri.grocery.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

import com.giri.grocery.dto.GroceryDTO;
import com.giri.grocery.search.GrocerySearch;

public class GroceryDAOImple implements GroceryDAO {
	private Collection<GroceryDTO> collection = new ArrayList<GroceryDTO>();

	@Override
	public boolean create(GroceryDTO dto) {
		boolean save = this.collection.add(dto);
		return save;
	}

	@Override
	public Optional<GroceryDTO> findOneGrocerySearch(GrocerySearch search) {

		return this.collection.stream().filter(a -> search.test(a)).findFirst();
	}

	@Override
	public Optional<GroceryDTO> findByMaxQuantity() {

		GroceryDTO dto = Collections.max(collection, Comparator.comparing(s -> s.getQuantity()));

		System.out.println("The Max quuatity is : " + dto.getQuantity());
		return Optional.of(dto);
		//return this.collection.stream().max(comp);
	}

	@Override
	public Optional<GroceryDTO> findByManufacturedDate(Date date) {
		Optional<GroceryDTO> opt = Optional
				.of(Collections.max(collection, Comparator.comparing(s -> s.getManufactureDate())));
		return opt;
		//return this.collection.stream().filter(d -> d.getManufacturedDate().equals(date)).findFirst();
	}

	@Override
	public Collection<GroceryDTO> findAllGrocerySearch(GrocerySearch search) {
		GroceryDTO dto = null;

		Collection<GroceryDTO> grocery = collection.stream().collect(Collectors.toList());
		return grocery;
	}

	@Override
	public Collection<GroceryDTO> findAllByExpiredDate() {
		// collection.stream().filter(c->c.getExpiryDate());
		return null;
	}

	@Override
	public Optional<GroceryDTO> findone(String name) {

		return this.collection.stream().filter(dto -> dto.getName().equals(name)).findFirst();
	}

	@Override
	public Optional<GroceryDTO> findbyManufacturingDate(String date) {
		this.collection.stream().filter(dto -> dto.getManufactureDate().equals(date)).findFirst();
		return null;
	}

	@Override
	public Optional<GroceryDTO> findAllByExpiredDate(String date) {
		this.collection.stream().filter(dto -> dto.getManufactureDate().equals(date)).findFirst();
		return null;
	}

}
