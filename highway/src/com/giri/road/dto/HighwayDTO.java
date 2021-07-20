package com.giri.road.dto;

import java.io.Serializable;

import com.giri.constant.HighwayType;

public class HighwayDTO implements Serializable {
	private int id;
	private int number;
	private double length;
	private boolean roadCondition;
	private String contractCompany;
	private String stateName;
	private HighwayType type;

	public HighwayDTO() {
	}

	public HighwayDTO(int id, int number, double length, boolean roadCondition, String contractCompany,
			HighwayType type,String stateName) {
		super();
		this.id = id;
		this.number = number;
		this.length = length;
		this.roadCondition = roadCondition;
		this.contractCompany = contractCompany;
		this.type = type;
		this.stateName=stateName;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isRoadCondition() {
		return roadCondition;
	}

	public void setRoadCondition(boolean roadCondition) {
		this.roadCondition = roadCondition;
	}

	public String getContractCompany() {
		return contractCompany;
	}

	public void setContractCompany(String contractCompany) {
		this.contractCompany = contractCompany;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public HighwayType getType() {
		return type;
	}

	public void setType(HighwayType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "HighwayDTO [id=" + id + ", number=" + number + ", length=" + length + ", roadCondition=" + roadCondition
				+ ", contractCompany=" + contractCompany + ", stateName=" + stateName + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

}
