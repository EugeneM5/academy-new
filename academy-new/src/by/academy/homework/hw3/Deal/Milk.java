package by.academy.homework.hw3.Deal;

public class Milk extends Product {
	public static final double MILK_DISCOUNT = 0.75;
	private String color;

	public Milk(double price, String type, String name, int quantity, String color) {
		super(price, type, name, quantity);
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
		if (quantity > 3) {
			return MILK_DISCOUNT;
		}
		return 1;
	}

}