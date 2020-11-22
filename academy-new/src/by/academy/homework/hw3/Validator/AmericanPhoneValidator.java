package by.academy.homework.hw3.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	@Override
	public boolean validate(String input) {
		Pattern pattern = Pattern.compile("\\+1\\d{10}");
		Matcher matcher = pattern.matcher(input);
		boolean isValid = matcher.matches();
		System.out.println("American number? " + isValid);
		return false;
	}
}
