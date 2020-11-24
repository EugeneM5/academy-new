package by.academy.homework.training.Printable;

public class Magazine implements Printable {

	private String name;
	private int pagesCount;

	{
		name = "Magazine";
		pagesCount = 100;
	}

	public static void printMagazines(Printable[] array) {
		for (Printable item : array) {
			if (item instanceof Magazine) {
				System.out.println("The name of magazine: " + ((Magazine) item).getName());
			}
		}
	}

	public Magazine() {
		super();
	}

	public Magazine(String name, int pagesCount) {
		super();
		this.name = name;
		this.pagesCount = pagesCount;
	}

//	@Override
//	public void print() {
//		
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPagesCount() {
		return pagesCount;
	}

	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}

}
