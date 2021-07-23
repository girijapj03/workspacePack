package com.giri.game;

import com.giri.game.dto.GameDTO;
import com.giri.game.service.GameService;
import com.giri.game.service.ImpleGameService;

public class GameTester {

	public static void main(String[] args) {
		GameDTO dto = new GameDTO(null, "10", "ba", 0, 6000, false);

		GameService gameservice = new ImpleGameService();
		boolean saved = gameservice.validateAndSave(dto);
		System.out.println(saved);
	}

}
