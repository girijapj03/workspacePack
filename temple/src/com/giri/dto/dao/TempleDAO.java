package com.giri.dto.dao;

import java.util.Collection;


import com.giri.dto.TempleDTO;

public interface TempleDAO {
boolean save(TempleDTO dto);
int totalItems();
boolean delete(TempleDTO dto);
TempleDTO findFirstItem();
TempleDTO findLastItem();
TempleDTO findByName(String name);
TempleDTO findByLocation(String location);
TempleDTO findByLocationAndName(String name,String location);
Collection<TempleDTO> findAll();
Collection<TempleDTO> findAllTempleByLocationStartsWith(String s);
Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost);
String findLocationByName(String name);
Collection<String> findAllLocations();
}
