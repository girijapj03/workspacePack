package com.giri.dataAccessObj.dao;

import com.giri.dataAccessObj.RiverDTO;

public interface RiverDAO {
boolean save(RiverDTO dto);//create
int totlNoOfRivers();
void update(RiverDTO dto);
boolean delete(RiverDTO dto);
boolean readTheData(RiverDTO dto);
}
