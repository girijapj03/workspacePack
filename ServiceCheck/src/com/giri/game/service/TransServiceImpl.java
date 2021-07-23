package com.giri.game.service;

import com.giri.game.dto.TransformerDTO;

public class TransServiceImpl implements TransService {

	@Override
	public String validateAndSave(TransformerDTO dto) {
		boolean nameVAlidate = false;
		boolean placeVAlidate = false;
		boolean angryVAlidate = false;
		boolean happyVAlidate = false;
		boolean sadVAlidate = false;
		boolean likeTodoVAlidate = false;
		System.out.println("checking");
		if (dto != null) {

			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >5 && name.length() <= 50) {
				System.out.println("name is valid");
				nameVAlidate = true;
			} else {
				System.out.println("name is invalid");
				nameVAlidate = false;
			}
			String place = dto.getPlace();

			if (place != null && !place.isEmpty() && place.length() > 4 && place.length() <= 20) {
				System.out.println("place is valid");
				placeVAlidate = true;
			} else {
				System.out.println(" place is not valid");
				placeVAlidate = false;
			}
			String angry = dto.getAngry();
			if (angry != null && !angry.isEmpty() && angry.length() > 4 && angry.length() < 12) {
				System.out.println("angry is valid");
				angryVAlidate = true;
			} else {
				System.out.println("angry is not valid");
				angryVAlidate = false;
			}
			String happy = dto.getHappy();
			if (happy != null && !happy.isEmpty() && happy.length() >4 && happy.length() < 20) {
				System.out.println("happy is valid");
				happyVAlidate = true;
			} else {
				System.out.println("happy is not valid");
				happyVAlidate = false;
			}
			String sad = dto.getSad();
			if (sad != null && !sad.isEmpty() && sad.length() > 4 && sad.length() < 25) {
				System.out.println("sad is valid");
				sadVAlidate = true;
			} else {
				System.out.println("sad is not valid");
				sadVAlidate = false;
			}
			String likeTodo = dto.getLikeToDo();
			if (likeTodo != null && !likeTodo.isEmpty() && likeTodo.length() >15 && likeTodo.length() < 300) {
				System.out.println("likeTodo is valid");
				likeTodoVAlidate = true;
			} else {
				System.out.println("likeTodo is not valid");
				likeTodoVAlidate = false;
			}
			if (likeTodoVAlidate && sadVAlidate && happyVAlidate && angryVAlidate && placeVAlidate && nameVAlidate) {
				System.out.println("data is valid");
				return "SUCCESS";
			}

		}
		return "Failed";
	}

}
