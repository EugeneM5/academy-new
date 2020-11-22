package by.academy.homework.hw3.Deal;


import java.io.Serializable;

public abstract class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	protected double price;
	protected String type;
	protected String producerName;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(double price, String type, String producerName, int quantity) {
		super();
		this.price = price;
		this.type = type;
		this.producerName = producerName;
		this.quantity = quantity;
	}

	public final double calcTotalPrice() {
		return quantity * price * discount();
	}

	public abstract double discount();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((producerName == null) ? 0 : producerName.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Product other = (Product) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (producerName == null) {
			if (other.producerName != null)
				return false;
		} else if (!producerName.equals(other.producerName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [price=");
		builder.append(price);
		builder.append(", type=");
		builder.append(type);
		builder.append(", producerName=");
		builder.append(producerName);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

}
