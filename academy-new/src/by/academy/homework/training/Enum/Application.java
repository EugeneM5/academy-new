package by.academy.homework.training.Enum;

public class Application {
//Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
	public static void main(String[] args) {

		Seasons[] some = Seasons.values();// создан массив КОНСТАНТ и с помощью цикла выведен на печать.
		for (Seasons s : some) {
			if(s == Seasons.SUMMER) {
				System.out.println("ТЁПЛЕНЬКА");
			}
			System.out.println(s.ordinal());
			System.out.println(s);
			System.out.println(s.getDiscription() + " " + s.getTemp());
			System.out.println("-------------");
		}
			System.out.println("----------------------------------------");
			
			Seasons myFavouriteSeason = Seasons.SUMMER;
			
			switch (myFavouriteSeason) {
			case AUTUMN:
				System.out.println("ДОЖДЖ");
				break;
			case WINTER:
				System.out.println("СНЕГГ");
				break;
			case SUMMER:
				System.out.println("ТЯПЛО");
				break;
			case SPRING:
				System.out.println("ТЯПЛО И ДОЖДЖ");
				break;
			default:
				System.out.println("GGRR");
				break;
			}

		
	}

}
