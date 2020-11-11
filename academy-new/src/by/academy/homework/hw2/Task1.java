package by.academy.homework.hw2;

import java.util.Scanner;

//Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки. Учитываем регистр. Не использовать сортировку :) 
public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Введите строку 1 ");
		String str = sc.nextLine();
		System.out.println(" Введите строку 2 ");
		String str1 = sc.nextLine();

		sc.close();

		System.out.println(str.equals(str1));

		char[] a = str.toCharArray();

		char[] b = str1.toCharArray();

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
					break;
				}
			}
		}

		if (count == str.length()) {
			System.out.println("Строка является перестановкой символов другой!");
		} else

			System.out.println("Строки разные!");
	}
}
