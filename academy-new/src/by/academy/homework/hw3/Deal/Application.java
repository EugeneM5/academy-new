package by.academy.homework.hw3.Deal;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);
		
		Deal deal = new Deal("21-11-2020", seller, buyer);

		Product[] products = new Product[4];

		products[0] = new Meat(15.00, "meat", "Academy Bel", 7);
		products[1] = new Onion(7.00, "vine", "peach", 7, "red");
		products[2] = new Potato(2.00, "potato", "belarus", 5, 1.00);
		products[3] = new Milk(3.00, "milk", "banana", 5, "white");
		
		deal.deadLineDate();
		seller.dateOfBirth();
		deal.deal();
		deal.deleteProduct(2);
		deal.addProduct(new Meat(15.00, "meat", "Academy Bel", 7));
		Person.belarusPhoneValidator("+375293586214");
		

	}

}
