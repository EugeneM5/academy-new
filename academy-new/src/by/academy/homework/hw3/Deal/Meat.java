package by.academy.homework.hw3.Deal;

public class Meat extends Product {
	
	public static final double MEAT_DISCOUNT = 0.8;
	
	
	public Meat() {
		super();
	}

	public Meat(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	public double discount() {
		if (producerName.contains("Bel")) {
			return MEAT_DISCOUNT;
		}
		return 1;
	}

}
