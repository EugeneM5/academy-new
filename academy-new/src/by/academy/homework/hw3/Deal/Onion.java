package by.academy.homework.hw3.Deal;

public class Onion extends Product {

	public static final double ONION_DISCOUNT = 0.85;
	public String color;

	public Onion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Onion(double price, String type, String producerName, int quantity, String color) {
		super(price, type, producerName, quantity);
		this.color = color;
	}

	protected double calcDiscount() {
		if (quantity > 10) {
			return ONION_DISCOUNT;
		} else {
			return 1;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double discount() {
		if (producerName == "Bel") {
			return ONION_DISCOUNT;
		}
		return 1;
	}
}
