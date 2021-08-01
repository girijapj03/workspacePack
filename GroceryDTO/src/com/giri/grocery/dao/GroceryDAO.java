package com.giri.grocery.dao;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.giri.grocery.dto.GroceryDTO;
import com.giri.grocery.search.GrocerySearch;

public interface GroceryDAO {
	boolean create(GroceryDTO dto);

	Optional<GroceryDTO> findone(String name);

	Optional<GroceryDTO> findOneGrocerySearch(GrocerySearch search);

	Optional<GroceryDTO> findByMaxQuantity();

	Optional<GroceryDTO> findByManufacturedDate(Date date);

	Collection<GroceryDTO> findAllGrocerySearch(GrocerySearch search);

	Collection<GroceryDTO> findAllByExpiredDate();

	Optional<GroceryDTO> findbyManufacturingDate(String date);

	Optional<GroceryDTO> findAllByExpiredDate(String date);
}
