package by.academy.homework.training.Printable;

public class Book implements Printable {

	private String name;
	private int pagesCount;

	{
		name = "Book";
		pagesCount = 500;
	}

	public Book() {
		super();
	}

	public Book(String name, int pagesCount) {
		super();
		this.name = name;
		this.pagesCount = pagesCount;
	}

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

//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		
//	}

}
