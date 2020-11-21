package by.academy.homework.hw3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {
//		3. Написать класс, который проверял бы введенную дату на соответствие патерна: (использовать regexp)
//		   a) dd/MM/yyyy
//		   b) dd-MM-yyyy 

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date ");
		String firstDate = scanner.nextLine();
		scanner.close();
		System.out.println(testDate(firstDate));
	}

	public static boolean testDate(String firstDate) {
		Pattern pattern = Pattern.compile("(\\d{2}[\\/\\-]){2}\\d{4}");
		Matcher matcher = pattern.matcher(firstDate);
		return matcher.matches();
	}

}
