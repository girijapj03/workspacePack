package com.giri.road.dao;

import java.util.Collection;

import com.giri.constant.HighwayType;
import com.giri.road.dto.HighwayDTO;

public interface HighwayDAO {
boolean save(HighwayDTO dto);
Collection<HighwayDTO> findAll();
Collection<Integer> findAllNumber();
 int totalItems();
 Collection<HighwayDTO> findByHighwayType(HighwayType type);
 Collection<HighwayDTO> findByStateName(String name);
 Collection<Integer> findNumberByStateName(String sname);
 boolean exist(HighwayDTO dto);
 boolean isCondition(int number);
 double findLengthByNumber(int no);
 HighwayDTO findByMaxLength();
 HighwayDTO findByMinLength();
}

