package by.academy.homework.training.Flower;

public class Flower {
	public static int count = 0;
	private String country;
	private double price;
	private int storageDays;
	
	public Flower(String country, double price, int storageDays) {
		super();
		this.country = country;
		this.price = price;
		this.storageDays = storageDays;
		count++;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStorageDays() {
		return storageDays;
	}
	public void setStorageDays(int storageDays) {
		this.storageDays = storageDays;
	}
	
	public double summ(Flower[] buqet) {
		double summ = 0;
		for(Flower x:buqet) {
			summ += x.getPrice();
		}
		System.out.print(summ);
		return summ;
	}
	
	public static void getCount() {
		System.out.println("Count is " + count);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flower [country=");
		builder.append(country);
		builder.append(", price=");
		builder.append(price);
		builder.append(", storageDays=");
		builder.append(storageDays);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + storageDays;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (storageDays != other.storageDays)
			return false;
		return true;
	}
	
	
}
