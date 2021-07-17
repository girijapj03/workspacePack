package com.xworkz.dtoExample.dto;

import java.io.Serializable;

public class MachineDTO implements Serializable{
	
	
	private String machineName;
	private int countOfNWAdapter;
	private double storage;
	private double versionOS;
	private boolean mouseConncted;
	private boolean graphicsWorking;

	public MachineDTO(String machineName, int countOfNWAdapter, double storage, double versionOS, boolean mouseConncted,
			boolean graphicsWorking) {
		super();
		this.machineName = machineName;
		this.countOfNWAdapter = countOfNWAdapter;
		this.storage = storage;
		this.versionOS = versionOS;
		this.mouseConncted = mouseConncted;
		this.graphicsWorking = graphicsWorking;
	}

	@Override
	public String toString() {
		return "MachineDTO [machineName=" + machineName + ", countOfNWAdapter=" + countOfNWAdapter + ", storage="
				+ storage + ", versionOS=" + versionOS + ", mouseConncted=" + mouseConncted + ", graphicsWorking="
				+ graphicsWorking + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");
		return true;
	}
}
