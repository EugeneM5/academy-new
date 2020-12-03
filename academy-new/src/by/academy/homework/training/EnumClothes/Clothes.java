package by.academy.homework.training.EnumClothes;

import java.util.Arrays;

public abstract class Clothes {
	protected Size size; //чтобы был доступ к Enum, так нужно указать переменную. Тип Size, имя любое
	protected double price;
	protected String color;
	Clothes [] clothes;
	
	public Clothes(Size size, double price, String color, Clothes[] clothes) { // потом уже сгенерить конструктор суперкласса
		super();
		this.size = size;
		this.price = price;
		this.color = color;
		this.clothes = clothes;
	}
	public Clothes[] getClothes() {
		return clothes;
	}
	public void setClothes(Clothes[] clothes) {
		this.clothes = clothes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(clothes);
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Clothes other = (Clothes) obj;
		if (!Arrays.equals(clothes, other.clothes))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	
}
