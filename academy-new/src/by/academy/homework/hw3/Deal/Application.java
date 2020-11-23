package by.academy.homework.hw3.Deal;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);

		Deal deal = new Deal("22-11-2020", seller, buyer);

		deal.addProduct(new Meat(9.00, "meat", "Russia", 7));
		deal.addProduct(new Milk(2.00, "milk", "Belarus", 3, "white"));
		deal.addProduct(new Onion(2.15,"onion","Africa",5,"red"));
		deal.addProduct(new Potato(1.5,"potato","Belarus",10,2.30));

		deal.printProducts();
		System.out.println("---------------------------------------");

		deal.deadLine();
		deal.deleteProduct(4);
		System.out.println("---------------------------------------");
		deal.printProducts();
		
		seller.emailValidator("seller@gmail.com");
		buyer.belarusPhoneValidator("+375293697418");
		seller.dateOfBirth();
		
		
	}
}