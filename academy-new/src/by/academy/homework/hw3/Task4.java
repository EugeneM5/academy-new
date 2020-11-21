package by.academy.homework.hw3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void main(String[] args) throws ParseException { // без throw не работает
//		4. С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит.
//		Вывести строку в следующем формате:
//			День: <Day>
//			Месяц: <Month>
//			Year: <Year>
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date .... dd-MM-yyyy");
		String firstDate = scanner.nextLine();
		scanner.close();

		Pattern pattern = Pattern.compile("(\\d{2}[\\-]){2}\\d{4}");
		Matcher matcher = pattern.matcher(firstDate);
		if (matcher.find()) {
			String oldDateString = matcher.group();
			SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat newDateFormat = new SimpleDateFormat("<dd>\n<MM>\n<yyyy>");

			Date date = oldDateFormat.parse(oldDateString);
			String result = newDateFormat.format(date);
			System.out.println(result);

		} else {
			System.out.println("Incorrect Date format! ");
		}

	}

}