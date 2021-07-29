package com.giri.rogiOptinal.dto;

import java.io.Serializable;

public class RogiDTO implements Serializable{
	private int id;
	private String name;
	private int age;
	private String kayile;
	private boolean badukuGurantee;
	
	public RogiDTO() {}

	public RogiDTO(int id, String name, int age, String kayile, boolean badukuGurantee) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.kayile = kayile;
		this.badukuGurantee = badukuGurantee;
	}

	@Override
	public String toString() {
		return "RogiDTO [id=" + id + ", name=" + name + ", age=" + age + ", kayile=" + kayile + ", badukuGurantee="
				+ badukuGurantee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((kayile == null) ? 0 : kayile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RogiDTO other = (RogiDTO) obj;
		if (id != other.id)
			return false;
		if (kayile == null) {
			if (other.kayile != null)
				return false;
		} else if (!kayile.equals(other.kayile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getKayile() {
		return kayile;
	}

	public boolean isBadukuGurantee() {
		return badukuGurantee;
	}
	

}
