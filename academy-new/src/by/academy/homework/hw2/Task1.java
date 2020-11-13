package by.academy.homework.hw2;

import java.util.Scanner;

//Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки. Учитываем регистр. Не использовать сортировку :) 
public class Task1 {

	public static void main(String[] args) {

		Scanner scаnner = new Scanner(System.in);
		System.out.println("Enter the first string ");
		String firstString = scаnner.nextLine();
		System.out.println("Enter the second string ");
		String secondString = scаnner.nextLine();
		scаnner.close();

		char[] a = firstString.toCharArray();

		char[] b = secondString.toCharArray();

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
					break;
				}
			}
		}

		if (count == firstString.length()) {
			System.out.println("String is a permutation of characters of another string. ");
		} else {
			System.out.println("Strings are different! ");
		}
	}
}
