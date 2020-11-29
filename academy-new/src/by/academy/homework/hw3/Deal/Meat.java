package by.academy.homework.hw3.Deal;

public class Meat extends Product {
	
	public static final double MEAT_DISCOUNT = 0.95;
	private String kindOf;
	


	public Meat(double price, String type, String producerName, int quantity,String kindOf) {
		super(price, type, producerName, quantity);
		this.kindOf = kindOf;
	}
	
	@Override
	public double discount() {
		if (producerName.contains("ss")) {
			return MEAT_DISCOUNT;
		}
		return 1;
	}

	public String getKindOf() {
		return kindOf;
	}

	public void setKindOf(String kindOf) {
		this.kindOf = kindOf;
	}
}
