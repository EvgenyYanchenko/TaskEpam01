package com.epam;

public class UserKit extends Stationery {

	private String userName;
	private String userPol;
	private int stationeryKol;

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getPol() {
		return userPol;
	}

	public void setPol(String pol) {
		this.userPol = pol;
	}

	public int getKol() {
		return stationeryKol;
	}

	public void setKol(int kol) {
		this.stationeryKol = kol;
	}

}
