package by.academy.homework.training.PhoneOOP;

public class Phone {
	
	static int phoneCount = 0;
	
	private String number;
	private String model;
	private double weight;
	

	/* начало блока инициализатора */
	{
		number = "Undefined";
		weight = 150.0;
		model = "Undefined";
	}
	/* конец блока инициализатора */

	public Phone() { // конструктор по умолчанию без параметров
		phoneCount++;
	}
	
	
	public Phone(String number, String model) {
		this();
		this.number = number;
		this.model = model;
	}

	public Phone(String number, String model, double weight) { // параметризированный конструктор с 3 аргументами
		this(number, model); // вызов конструктора с 2 мя параметрами
		this.weight = weight;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void receiveCall(String name) {
		System.out.println("Имя звонящего " + name);
	}

	public void receiveCall(String name, String number) {
		System.out.println("Имя звонящего " + name + " Номер звонящего " + number);
	}

	public void sendMessage(String phoneNumbers, String... vars) { //метод с аргументом переменной длины
		String numbers = phoneNumbers;
		for (String x : vars) {
			numbers += x;
		}
		System.out.println("Смс будет отправлен на " + numbers);

	}
	public static void phoneCounter() {
		System.out.println("Cозданных телефонов " + phoneCount);
	}



}
