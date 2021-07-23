package com.giri.game.service;

import com.giri.game.dao.GameDAO;
import com.giri.game.dao.GameDAOImpl;
import com.giri.game.dto.GameDTO;

public class ImpleGameService implements GameService {
private GameDAO dao=new GameDAOImpl();
	@Override
	public boolean validateAndSave(GameDTO dto) {
		boolean nameVAlidate = false;
		boolean versionValidate = false;
		if (dto != null) {
			System.out.println("dto is not null,will start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() <= 3 && name.length() <= 10) {
				System.out.println("name is valid");
				nameVAlidate = true;
			} else {
				System.out.println("name is invalid");
				nameVAlidate = false;
			}
		}
		String ver = dto.getVersion();
		if (ver != null && !ver.isEmpty() && ver.length() >1 && ver.length() < 8) {
			System.out.println("version is valid");
			versionValidate = true;

		} else {
			System.out.println("version is not valid");
			versionValidate = false;
		}
		if (versionValidate && nameVAlidate) {
			System.out.println("data is valid");
			dao.save(dto);
			return true;
		}
		return false;
	}

}
