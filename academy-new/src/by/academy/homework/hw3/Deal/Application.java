package by.academy.homework.hw3.Deal;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Person seller = new Person("Vasya", 200.00);

		System.out.println("Введите данные покупателя ");

		Scanner scanner = new Scanner(System.in);

		Person buyer = new Person();
		System.out.println("Имя: ");
		buyer.setName(scanner.next());
		System.out.println("Деньги: ");
		buyer.setCash(scanner.nextDouble());
		System.out.println("Номер мобильного: ");
		Person.belarusPhoneValidator(scanner.next());
		System.out.println("email: ");
		buyer.emailValidator(scanner.next());
		System.out.println("Введите дату рождения в формате dd-MM-yyyy : ");
		buyer.setDateOfBirth(scanner.next());
		buyer.dateOfBirth();

		Product[] products = new Product[2];

		Deal deal = new Deal("22-11-2020", seller, buyer, products);

		boolean menuIsContinue = false;

		while (menuIsContinue == false) {

			System.out.println("Выберете действие: Добавить продукт - 1 " + " Удалить продукт - 2 " + " Выйти - 3");

			int num = scanner.nextInt();
			if (num == 1) {

				System.out.println(
						"Выберете продукт: - 1 - Milk, - 2 - Meat, - 3 - Onion, - 4 - Potato, - 5 - Просмотр корзины");

				int numOfProduct = scanner.nextInt();
				switch (numOfProduct) {
				case 1:
					System.out.println("Milk, введите колличество ");
					int milkCount = scanner.nextInt();
					deal.addProduct(new Milk(5.50, "milk", "Belarus", milkCount, "white"));
					break;
				case 2:
					System.out.println("Meat, введите колличество ");
					int meatCount = scanner.nextInt();
					deal.addProduct(new Meat(9.00, "meat", "Russia", meatCount, "chicken"));
					break;
				case 3:
					System.out.println("Onion, введите колличество ");
					int onionCount = scanner.nextInt();
					deal.addProduct(new Onion(2.15, "onion", "Africa", onionCount, "red"));
					break;
				case 4:
					System.out.println("Potato, введите колличество ");
					int potatoCount = scanner.nextInt();
					deal.addProduct(new Potato(1.5,"Potato","Belarus",potatoCount,1.15));
					break;
				case 5:
					System.out.println("Ваша корзина --------------- ");
					deal.printProducts();
					break;
				default:
					System.out.println("Неверный номер продукта");
					break;
				}

			}
			if (num == 2) {
				System.out.println("Удаляем продукт, введите номер ");
				int delete = scanner.nextInt();
				deal.deleteProduct(delete);
				System.out.println("Ваша корзина --------------- ");
				deal.printProducts();
			}
			if (num == 3) {
				menuIsContinue = true;
				System.out.println("Ваша корзина --------------- ");
				deal.printProducts();
			}

		}
		scanner.close();
		deal.deal();
		deal.deadLine();
	}

}