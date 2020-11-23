package by.academy.homework.hw3.Deal;

public class Meat extends Product {
	
	public static final double MILK_DISCOUNT = 0.7;

	public Meat(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	public double discount() {
		if (producerName.contains("rus")) {
			return MILK_DISCOUNT;
		}
		return 1;
	}

}
