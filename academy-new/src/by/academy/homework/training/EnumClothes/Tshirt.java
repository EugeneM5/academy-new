package by.academy.homework.training.EnumClothes;

import java.util.Arrays;

public class Tshirt extends Clothes implements MensClothes,WomanClothes{

	
	public Tshirt(Size size, double price, String color, Clothes[] clothes) {
		super(size, price, color, clothes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tshirt [size=");
		builder.append(size);
		builder.append(", price=");
		builder.append(price);
		builder.append(", color=");
		builder.append(color);
		builder.append(", clothes=");
		builder.append(Arrays.toString(clothes));
		builder.append("]");
		return builder.toString();
	}

}
