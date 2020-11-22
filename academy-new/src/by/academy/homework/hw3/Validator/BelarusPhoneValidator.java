package by.academy.homework.hw3.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String input) {
		Pattern pattern = Pattern.compile("\\+375\\d{9}");
		Matcher matcher = pattern.matcher(input);
		boolean isValid = matcher.matches();
		System.out.println("Belarusian number? " + isValid);
		return false;
	}
}
