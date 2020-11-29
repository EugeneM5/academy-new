package by.academy.homework.hw3.Deal;

public class Potato extends Product {
	private double weight;
	public static final double POTATO_DISCOUNT = 0.7;
	
	public Potato(double price, String type, String producerName, int quantity, double weight) {
		super(price, type, producerName, quantity);
		this.weight = weight;
	}

	@Override
	public double discount() {
		if (quantity > 10) {
			return POTATO_DISCOUNT;
		}
		return 1;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
