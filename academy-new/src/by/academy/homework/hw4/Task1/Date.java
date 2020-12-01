package by.academy.homework.hw4.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 1.

//Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class Date {

	String date;

	public Date() {
		super();
	}

	public Date(String date) {// Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для
								// этой строки.
		super();
		this.date = date;

		Pattern pattern = Pattern.compile("(\\d{2}[\\-]){2}\\d{4}");
		Matcher matcher = pattern.matcher(date);
		if (matcher.find()) {
			System.out.println("Date is correct! " + matcher.group());
		}
	}

	public enum DateEnum {// День недели представить в виде перечисления.

		MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"),
		SATURDAY("Суббота"), SUNDAY("Воскресенье");

		private String name;

		DateEnum(String name) {
			this.name = name;
		}

		public String getname() {
			return name;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	public void getDayOfWeek(String input) throws ParseException {// Методы: задать дату, вывести на консоль день недели
																	// по заданной дате.

		Pattern pattern = Pattern.compile("(\\d{2}[\\-]){2}\\d{4}");
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			System.out.println("Date is correct! " + matcher.group());
			String oldDateString = matcher.group();
			SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat newDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);

			java.util.Date date = oldDateFormat.parse(oldDateString);
			String result = newDateFormat.format(date);
			System.out.println("Day of week is a " + result);
		} else {
			System.out.println("Incorrect date format! ");
		}
	}

	public void isValid(String firstdate) {
		Pattern pattern = Pattern.compile("(\\d{2}[\\-]){2}\\d{4}");
		Matcher matcher = pattern.matcher(firstdate);
		if (matcher.find()) {
			System.out.println("Date is correct! " + matcher.group());
		}
	}

	public class Year {
		private String year;

		public Year() {
			super();
		}

		public Year(String year) {
			super();
			this.year = year;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public boolean isLeapYear(String year) {// Добавить метод, который проверяет высокосный ли год или нет.
			int leapYear = Integer.parseInt(year);
			if (leapYear % 4 == 0) {
				return true;
			}
			if (leapYear % 100 == 0) {
				return false;
			}
			if (leapYear % 400 == 0) {
				return true;
			}
			return false;
		}
	}

	public class Month {
		String month;

		public Month() {
			super();
		}

		public Month(String month) {
			super();
			this.month = month;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}
	}

	public class Day {
		String day;

		public Day() {
			super();
		}

		public Day(String day) {
			super();
			this.day = day;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

	}

}
