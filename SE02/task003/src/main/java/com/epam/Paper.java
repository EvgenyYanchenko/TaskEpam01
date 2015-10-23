package com.epam;

public class Paper extends Stationery {
	private String accessory;

	@Override
	public String toString() {
		return "\n" + "Название " +getName() + ". Принадлежность: " + accessory + ". Цена: " + getPrice();
	}

	public String getAccessory() {
		return accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}
}
