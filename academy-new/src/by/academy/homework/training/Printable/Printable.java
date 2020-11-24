package by.academy.homework.training.Printable;

public interface Printable {

	public default void print() {
		System.out.println("Some shit");
	}
}
