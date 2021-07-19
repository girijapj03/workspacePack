package com.giri.templeEX.dto;

import java.io.Serializable;

public class TempleDTO implements Serializable {
	private int id;
	private String name;
	private String location;
	private double entryFee;
	private String specialPrasada;
	private int noOfPujaris;
	private boolean male;
	private String mainGod;
	private boolean kalyani;

	public TempleDTO() {
	}

	public TempleDTO(int id, String name, String location, double entryFee, String specialPrasada, int noOfPujaris,
			boolean male, String mainGod, boolean kalyani) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.entryFee = entryFee;
		this.specialPrasada = specialPrasada;
		this.noOfPujaris = noOfPujaris;
		this.male = male;
		this.mainGod = mainGod;
		this.kalyani = kalyani;
	}

	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", entryFee=" + entryFee
				+ ", specialPrasada=" + specialPrasada + ", noOfPujaris=" + noOfPujaris + ", male=" + male
				+ ", mainGod=" + mainGod + ", kalyani=" + kalyani + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public String getSpecialPrasada() {
		return specialPrasada;
	}

	public void setSpecialPrasada(String specialPrasada) {
		this.specialPrasada = specialPrasada;
	}

	public int getNoOfPujaris() {
		return noOfPujaris;
	}

	public void setNoOfPujaris(int noOfPujaris) {
		this.noOfPujaris = noOfPujaris;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public boolean isKalyani() {
		return kalyani;
	}

	public void setKalyani(boolean kalyani) {
		this.kalyani = kalyani;
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

}
