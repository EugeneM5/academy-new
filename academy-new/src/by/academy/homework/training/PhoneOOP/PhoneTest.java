package by.academy.homework.training.PhoneOOP;

public class PhoneTest {
	
	public static void main(String[] args) {
		

		Phone firstPhone = new Phone("+375293976214", "Samsung", 98.00);
		Phone secondPhone = new Phone("+375291232106", "Nokia", 121.50);
		Phone thirdPhone = new Phone("+375296957115", "Iphone", 100.00);
		Phone fourthPhone = new Phone("+375291832106", "Huawei");
		Phone nonamePhone = new Phone();
		
		System.out.println(firstPhone.getModel() + " " + firstPhone.getNumber() + " " + firstPhone.getWeight());
		System.out.println(secondPhone.getModel() + " " + secondPhone.getNumber() + " " + secondPhone.getWeight());
		System.out.println(thirdPhone.getModel() + " " + thirdPhone.getNumber() + " " + thirdPhone.getWeight());

		nonamePhone.setModel("Motorolla");
		System.out.println(nonamePhone.getModel() + " " + nonamePhone.getNumber() + " " + nonamePhone.getWeight());
		
		firstPhone.receiveCall("Boris");
		thirdPhone.receiveCall("Alina", "+3756957115");
		secondPhone.sendMessage("+375293697458","+375298746987");
		fourthPhone.receiveCall("Fedya");
		Phone.phoneCounter();
	}

}
