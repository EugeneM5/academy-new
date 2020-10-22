package by.academy.homework;

import java.util.Scanner;

/*Задание 2.
Используем switch/case. Ввести с консоли тип данных (сохраняем в String) и переменную, вывести на экран:
	a) если тип данных int, вывести остаток от деления на 2
	b) если double, вывести 70% от числа 
	c) если float, возвести в квадрат
	d) если char, вывести код символа
	e) String, вывести на экран строку в виде ("Hello " + переменная)
	f) во всех остальных случаях вывести на экран ("Unsupported type");
*/
public class Task2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите тип данных: ");
		String type = in.nextLine();

		switch (type) {

		case "integer":
			System.out.println("Введите целое число ");
			int a = in.nextInt();
			System.out.println("остаток от деления на 2 " + a % 2);
			break;
		case "double":
			System.out.println("Введите число с плавающей запятой ");
			double b = in.nextDouble();
			System.out.format("%3f", b);
			break;
		case "float":
			System.out.println("Введите число с плавающей запятой ");
			float c = in.nextFloat();
			System.out.println("Квадрат введенного числа " + Math.pow(c, 2));
			break;
		case "char":
			System.out.println("Введите символ ");
			char d = in.next().charAt(0);
			int ascii = (int) d;
			System.out.println("Код введенного символа " + ascii);
			break;
		case "string":
			System.out.println("Введите слово ");
			String s = in.nextLine();
			System.out.println("Hello " + s);
			break;
		default:
			System.out.println("Unsupported type ");
			break;
		}
		in.close();
	}

}
