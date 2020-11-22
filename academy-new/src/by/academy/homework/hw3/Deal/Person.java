package by.academy.homework.hw3.Deal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.academy.homework.hw3.Validator.BelarusPhoneValidator;
import by.academy.homework.hw3.Validator.Validator;
import by.academy.homework.hw3.Task3;

public class Person {
	
	public static final Validator belarusPhoneValidator = new BelarusPhoneValidator();
	String name;
	double cash;
	String dateOfBirth;

	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static void dateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birthday date dd-MM-yyyy : ");
        String birthDay = scanner.next();
        scanner.close();

        Task3 birthDate = new Task3();
        System.out.println("dd-MM-yyyy - " + birthDate.testDate(birthDay));
    }

	public static boolean belarusPhoneValidator(String input) {
			Pattern pattern = Pattern.compile("\\+375\\d{9}");
			Matcher matcher = pattern.matcher(input);
			boolean isValid = matcher.matches();
			System.out.println("Belarusian number? " + isValid);
			return false;
		}
		
	
}
