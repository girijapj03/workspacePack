package com.giri.dataAccessObj;

import java.io.Serializable;

public class RiverDTO implements Serializable {
	private String name;
	private String origin;
	private double length;
	private int noOfstatesInflow;
	private boolean hydroPlant;

	public RiverDTO(String name, String origin, double length, int noOfstatesInflow, boolean hydroPlant) {
		super();
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfstatesInflow = noOfstatesInflow;
		this.hydroPlant = hydroPlant;
		
	}

	@Override
	public String toString() {
		return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfstatesInflow="
				+ noOfstatesInflow + ", hydroPlant=" + hydroPlant + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof RiverDTO) {
			RiverDTO other = (RiverDTO) obj;
			if (this.name.equals(other.getName()))
				return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
