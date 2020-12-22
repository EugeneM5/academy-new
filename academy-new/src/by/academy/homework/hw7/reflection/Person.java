package by.academy.homework.hw7.reflection;
//a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
public class Person {
	
	public String firstName;
	private String lastName;
	protected int age;
	private String dateOfBirth;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
