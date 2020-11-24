package by.academy.homework.training.Printable;

public class Application {

	public static void main(String[] args) {

		Book firstBook = new Book("Harry Potter", 556);
		Book secondBook = new Book("The GODFATHER", 880);

		Magazine firstMagazine = new Magazine("ESQUIRE", 156);
		Magazine secondMagazine = new Magazine("MAXXIM", 250);

		Printable[] array = new Printable[4];
		array[0] = firstBook;
		array[1] = secondBook;
		array[2] = firstMagazine;
		array[3] = secondMagazine;

		for (Printable items : array) {
			items.print();
		}
		for (Printable item : array) {
			if (item instanceof Magazine) {
				System.out.println("The name of magazine: " + ((Magazine) item).getName());
			} else if (item instanceof Book) {
				System.out.println("The name of book: " + ((Book) item).getName());
			}

		}

	}

}
