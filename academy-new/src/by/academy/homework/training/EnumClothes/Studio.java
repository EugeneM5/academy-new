package by.academy.homework.training.EnumClothes;

public class Studio { //Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды. 
	public void dressMan(Clothes[] clothes) {
		for (Clothes x : clothes) {
			if (x instanceof MensClothes) {
				System.out.println(x);
			}

		}

	}

	public void dressWoman(Clothes[] clothes) {
		for (Clothes x : clothes) {
			if (x instanceof WomanClothes) {
				System.out.println(x);
			}

		}

	}
}
