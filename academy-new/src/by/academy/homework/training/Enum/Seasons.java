package by.academy.homework.training.Enum;

public enum Seasons {
	WINTER("Зима", -5), SPRING("Весна", 15), SUMMER("Лето", 25), AUTUMN("Осень", 10);

	private String title;
	private int temp;

	private Seasons(String title, int temp) {
		this.title = title;
		this.temp = temp;
	}

	private Seasons(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public void choise(Seasons myFavouriteSeason) {
		
		switch (myFavouriteSeason) {
		case AUTUMN:
			System.out.println("ДОЖДЖ");
			break;
		case WINTER:
			System.out.println("СНЕГГ");
			break;
		case SUMMER:
			System.out.println("ТЯПЛО");
			break;
		case SPRING:
			System.out.println("ТЯПЛО И ДОЖДЖ");
			break;
		default:
			System.out.println("GGRR");
			break;
		}
	}
	public void getDescription() {
		System.out.println("Холодное время года");
	}
	
	public void getDescription(Seasons SUMMER) {// как переопределить на SUMMER
		System.out.println("Теплое время года");
	}
	
}
