package com.epam;

public class Tools extends Stationery {
	private String handyOrMechanic;

	@Override
	public String toString() {
		return "\n" + "Название " + getName() + ". Механический или ручной " + handyOrMechanic + ". Цена: "
				+ getPrice();
	}

	public String getHandyOrMechanic() {
		return handyOrMechanic;
	}

	public void setHandyOrMechanic(String handyOrMechanic) {
		this.handyOrMechanic = handyOrMechanic;
	}

}
