package by.academy.homework.hw2;

import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		/*
		 * Задание 3. Условие здачи: ввести 2 слова, состоящие из четного числа букв.
		 * Получить слово состоящее из первой половины первого слова и второй половины
		 * второго слова.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first word ");
		String firstWord = scanner.nextLine();
		System.out.println("Enter second word ");
		String secondWord = scanner.nextLine();
		scanner.close();

		if ((firstWord.length() % 2 == 0) && (secondWord.length() % 2 == 0)) {

			String subFirstWord = firstWord.substring(0, firstWord.length() / 2);

			String subSecondWord = secondWord.substring(secondWord.length() / 2, secondWord.length());

			System.out.println("Result is " + subFirstWord.concat(subSecondWord));
		} else {
			System.out.println("Words length should be even! ");
		}
	}
}
