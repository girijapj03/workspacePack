package com.giri.game.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {
	private String name;
	private String version;
	private String developedBy;
	private int maxPlayers;
	private double memoryRequired;
	private boolean online;

	public GameDTO() {
	}

	public GameDTO(String name, String version, String developedBy, int maxPlayers, double memoryRequired,
			boolean online) {
		super();
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
		this.maxPlayers = maxPlayers;
		this.memoryRequired = memoryRequired;
		this.online = online;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", maxPlayers="
				+ maxPlayers + ", memoryRequired=" + memoryRequired + ", online=" + online + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof GameDTO) {
			GameDTO casting = (GameDTO) obj;
			if (this.name.equals(casting.name) && this.version.equals(casting.version)
					&& this.developedBy.equals(casting.developedBy)) {
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public double getMemoryRequired() {
		return memoryRequired;
	}

	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

}
