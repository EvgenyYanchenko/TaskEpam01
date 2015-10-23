package com.epam;


public class Kanztov {
	private String name;
	private int price;
	private int kol;
	
	
	public int getAllCost(int price, int kol) {
	    return price * kol;
	}
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getKol() {
		return kol;
	}

	public void setKol(int kol) {
		this.kol = kol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
