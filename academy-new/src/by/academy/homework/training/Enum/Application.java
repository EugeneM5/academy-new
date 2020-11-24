package by.academy.homework.training.Enum;

public class Application {

	public static void main(String[] args) {

		Seasons myFavouriteSeason = Seasons.SUMMER;
//		System.out.println(Seasons.SPRING.getTitle());
//		
//		System.out.println(myFavouriteSeason.getTitle());
		myFavouriteSeason.getDescription();
		myFavouriteSeason.getDescription(Seasons.WINTER);

		Seasons[] some = Seasons.values();// создан массив КОНСТАНТ и с помощью цикла выведен на печать.
		for (Seasons s : some) {
			System.out.println(s.ordinal());
			System.out.println(s);
			System.out.println(s.getTitle() + " " + s.getTemp());

		}
	}

}
