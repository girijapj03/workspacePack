package com.giri.game.dto;

import java.io.Serializable;

import com.giri.game.dto.constant.CharacterTyp;
import com.giri.game.dto.*;

public class TransformerDTO implements Serializable {
	private String name;
	private String place;
	private String angry;
	private String happy;
	private String sad;
	private String likeToDo;
	private CharacterTyp type;

	public TransformerDTO() {
	}

	public TransformerDTO(String name, String place, String angry, String happy, String sad, String likeToDo,
			CharacterTyp type) {
		super();
		this.name = name;
		this.place = place;
		this.angry = angry;
		this.happy = happy;
		this.sad = sad;
		this.likeToDo = likeToDo;
		this.type = type;
	}

	@Override
	public String toString() {
		return "TransformerDTO [name=" + name + ", place=" + place + ", angry=" + angry + ", happy=" + happy + ", sad="
				+ sad + ", likeToDo=" + likeToDo + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null)
			return false;
		if (obj instanceof TransformerDTO) {
			TransformerDTO change = (TransformerDTO) obj;
			if (this.place.equals(change.place) && this.likeToDo.equals(change.likeToDo)) {
				return true;
			}
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getAngry() {
		return angry;
	}

	public void setAngry(String angry) {
		this.angry = angry;
	}

	public String getHappy() {
		return happy;
	}

	public void setHappy(String happy) {
		this.happy = happy;
	}

	public String getSad() {
		return sad;
	}

	public void setSad(String sad) {
		this.sad = sad;
	}

	public String getLikeToDo() {
		return likeToDo;
	}

	public void setLikeToDo(String likeToDo) {
		this.likeToDo = likeToDo;
	}

	public CharacterTyp getType() {
		return type;
	}

	public void setType(CharacterTyp type) {
		this.type = type;
	}

}
