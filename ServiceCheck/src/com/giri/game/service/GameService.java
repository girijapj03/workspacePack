package com.giri.game.service;

import com.giri.game.dto.GameDTO;

public interface GameService {

	boolean validateAndSave(GameDTO dto);
}
