package by.academy.homework.hw3.Deal;

public class Potato extends Product {
	double weight;

	public static final double POTATO_DISCOUNT = 0.7;

	public Potato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Potato(double price, String type, String producerName, int quantity, double weight) {
		super(price, type, producerName, quantity);
		this.weight = weight;
	}

	public Potato(double weight) {
		super();
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	protected double calcDiscount() {
		if (producerName.contains("a")) {
			return POTATO_DISCOUNT;
		} else {
			return 1;
		}
	}

	@Override
	public double discount() {
		if (quantity > 10) {
			return POTATO_DISCOUNT;
		}
		return 1;
	}

}
