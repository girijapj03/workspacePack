package com.giri.game.dao;

import com.giri.game.dto.GameDTO;

public class GameDAOImpl implements GameDAO {

	@Override
	public boolean save(GameDTO dto) {
		System.out.println("<<<<<<< saved dto >>>>>>>>>");
		return false;
	}

}
