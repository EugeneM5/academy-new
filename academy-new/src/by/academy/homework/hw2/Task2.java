package by.academy.homework.hw2;

import java.util.Scanner;

//Задание 2. 
//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a few words separated by space ");

		String[] words = (scanner.nextLine().split(" "));
		scanner.close();
		int count = 0;
		int max = 2;
		String temp = words[0];

		for (String element : words) {
			System.out.println(element);
			if (element.length() == 1) {
				System.out.println("Word is " + element);
				break;
			} else {
				for (int i = 0; i < element.length(); i++) {
					if (element.charAt(0) != element.charAt(i)) {
						count++;
					}
				}
			}
			if (count < max) {
				max = count;
				temp = element;
				count = 0;
			} else {
				count = 0;
			}
			System.out.println("Word is " + temp);
		}

	}

}
