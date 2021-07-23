package com.giri.game;

import com.giri.game.dto.TransformerDTO;
import com.giri.game.dto.constant.CharacterTyp;
import com.giri.game.service.TransService;
import com.giri.game.service.TransServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {
		// String name, String place, String angry, String happy, String sad, String
		// likeToDo,CharacterTyp type
		TransformerDTO dto = new TransformerDTO("GIRIJA P  Janagond", "MUDHOL", "HUNGRY", "HANGOUTWITHFRIENDS",
				"WHENIDIDNTGETWHICHIWANT", "TRAVELLING&exploring diiferent type food ", CharacterTyp.ALWAYShAPPY);

		TransformerDTO dto1 = new TransformerDTO("GIRIJA P  Janagond", "MUDHOL", "HUNGRY", null,
				"WHENIDIDNTGETWHICHIWANT", "TRAVELLING&exploring diiferent type food ", CharacterTyp.ALWAYShAPPY);
		TransService service = new TransServiceImpl();
		String saving = service.validateAndSave(dto);
		System.out.println(saving);
		String saving_s = service.validateAndSave(dto1);
		System.out.println(saving_s);
	}

}
