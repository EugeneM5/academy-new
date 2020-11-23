package by.academy.homework.hw3.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String input) {
		Pattern pattern = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");
		Matcher matcher = pattern.matcher(input);
		boolean isValid = matcher.matches();
		if (isValid == true) {
			System.out.println("Belarusian number? " + isValid);
		} else {
			System.out.println("Incorrect number! ");
		}
		return false;
	}
}
