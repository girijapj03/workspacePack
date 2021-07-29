package com.giri.rogiOptinal.dao;

import java.util.Collection;
import java.util.Optional;

import com.giri.rogiOptinal.dto.RogiDTO;
import com.giri.rogiOptinal.search.RogiSearch;

public interface RogiDAO {
	boolean save(RogiDTO dto);
Optional<RogiDTO> findOne(RogiSearch search);
Optional<Integer> totalSize();
Optional<RogiDTO> findByMaxAge();
Optional<RogiDTO> findByMinAge();
Collection<RogiDTO> findAll();
Collection<RogiDTO> findAll(RogiSearch search);
}
