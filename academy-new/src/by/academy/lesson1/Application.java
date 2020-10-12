package by.academy.lesson1;

public class Application {
	public static void main(String[] args) {
		Cat mycat = new Cat("Mila");
		Cat cat = new Cat("Bug",6);
		Cat nonamecat = new Cat();
		
		cat.eat();
		mycat.eat();
		mycat.sleep();
		mycat.walk();
		
		nonamecat.grow(1);
		nonamecat.grow(2);
		nonamecat.grow(3);
		nonamecat.catsage();
		
		cat.setMoney(6.12);
		cat.getMoney();		
		System.out.println(cat.getMoney());
		
		mycat.setInitials('M');
		mycat.getInitials();
		System.out.println("Initials of this cat " + mycat.getInitials());
		
		mycat.setisHomeAnimal(true);
		mycat.isHomeAnimal();
		System.out.println("This cat is a home animal? answer: " + mycat.isHomeAnimal());
		
	}

}
