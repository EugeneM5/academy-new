package by.academy.homework.hw4.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import by.academy.homework.hw4.Task1.Date.DateEnum;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		Date date = new Date();// Создать объект класса Date, используя вложенные классы Год, Месяц, День.

		Date.Year year = date.new Year();
		year.setYear("2020");
		System.out.println("Year is leap? " + year.isLeapYear(year.getYear()));

		Date.Month month = date.new Month();
		month.setMonth("05");

		Date.Day day = date.new Day();
		day.setDay("15");

		String firstDate = day.getDay() + "-" + month.getMonth() + "-" + year.getYear();
		date.isValid(firstDate);

		System.out.println("Enter the second date: ");
		String secondDate = scanner.nextLine();
		date.isValid(secondDate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");// Рассчитать количество дней, в заданном
																			// временном промежутке.
		java.util.Date first = dateFormat.parse(firstDate);
		java.util.Date second = dateFormat.parse(secondDate);

		long milliseconds = first.getTime() - second.getTime();
		int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
		System.out.println("Days between is " + days);

		System.out.println("----------------------");

		System.out.println("Enter the date to get day of week: \n");// задать дату, вывести на консоль день недели по
																	// заданной дате.
		date.getDayOfWeek(scanner.nextLine());

		scanner.close();
		System.out.println("----------------------");

		Date anotherDate = new Date("25-11-2020"); // После валидации в конструкторе создаем объекты класса Year, Month,
													// Day.
		Date.Year anotherYear = anotherDate.new Year();
		Date.Month anotherMonth = anotherDate.new Month();
		Date.Day anotherDay = anotherDate.new Day();
		
		Date.DateEnum dayOfWeek = DateEnum.FRIDAY;
		System.out.println(dayOfWeek.getname());
		System.out.println(Date.DateEnum.THURSDAY);

	}

}
