package by.academy.homework.hw3.Deal;

import by.academy.homework.hw3.Deal.annotation.Producer;

@Producer(country = "New Zeland",founderName = "NewZelander",startYear = 1850)

public class Onion extends Product {

	public static final double ONION_DISCOUNT = 0.85;
	private String color;

	public Onion(double price, String type, String producerName, int quantity, String color) {
		super(price, type, producerName, quantity);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double discount() {
		if (quantity > 10) {
			return ONION_DISCOUNT;
		} else {
			return 1;
		}
	}
}
