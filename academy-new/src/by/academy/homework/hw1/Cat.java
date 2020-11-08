package by.academy.homework.hw1;

public class Cat {

	int age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal; 
	
	
	public Cat() {
	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public Cat(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;
	}

	public void sleep() {
		System.out.println(nickname + " is sleeping");
	}

	public void eat() {
		System.out.println(nickname + " is eating");
	}

	public void walk() {
		System.out.println(nickname + " is walking");
	}

	public void grow(int addAge) {
		age = age + addAge;
	}

	public int getAge() {
		return age;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;

	}

	public void catsage() {
		System.out.println("nonamecat is " + age);
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public char getInitials() {
		return initials;
	}

	public void setisHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
		if (isHomeAnimal == false) {
		       System.out.println(nickname + " is streetcat");
		      }
			else {
			   System.out.println(nickname + " is homecat");
			  
			}
		
	}
	public boolean isHomeAnimal() {
	
		return isHomeAnimal;
	}


}
