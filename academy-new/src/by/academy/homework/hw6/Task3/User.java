package by.academy.homework.hw6.Task3;

import java.io.Serializable;

public class User implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
//	Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).

	String firstName;
	String lastName;
	int age;

	public User(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
