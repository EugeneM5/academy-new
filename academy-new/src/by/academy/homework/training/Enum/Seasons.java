package by.academy.homework.training.Enum;

public enum Seasons {
	WINTER("Холодное время года", -5), SPRING("Теплое время года", 15), SUMMER("Теплое время года", 25),
	AUTUMN("Холодное время года", 10);

	private String discription;
	private int temp;

	private Seasons(String discription, int temp) {
		this.discription = discription;
		this.temp = temp;
	}

	public String getDiscription() {
		return discription;
	}
	
	public int getTemp() {
		return temp;
	}



}
