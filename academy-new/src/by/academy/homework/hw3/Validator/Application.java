package by.academy.homework.hw3.Validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		Validator american = new AmericanPhoneValidator();
		american.validate(input);

		Validator bel = new BelarusPhoneValidator();
		bel.validate(input);
		
		Validator email = new EmailValidator();
		email.validate(input);
	}
}
		final class EmailValidator implements Validator {
			
			@Override
			public boolean validate(String input) {
				Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
				Matcher matcher = pattern.matcher(input);
				boolean isValid = matcher.matches();
				if (isValid == true) {
				System.out.println("This is email? " + isValid);
				} else {
					System.out.println("Incorrect input! ");
				}
				return false;
			}

			
			

		}
	


