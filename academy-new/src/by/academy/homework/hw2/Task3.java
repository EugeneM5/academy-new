package by.academy.homework.hw2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Задание 3. Условие здачи: ввести 2 слова, состоящие из четного числа букв.
		 * Получить слово состоящее из первой половины первого слова и второй половины
		 * второго слова.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first word ");
		String s1 = in.nextLine();
		System.out.println("Enter second word ");
		String s2 = in.nextLine();
		in.close();

		if ((s1.length() % 2 == 0) && (s2.length() % 2 == 0)) {
			String sub1 = s1.substring(0, s1.length() / 2);
			String sub2 = s2.substring(s2.length() / 2, s2.length());

			System.out.println("Result is " + sub1.concat(sub2));
		} else {
			System.out.println("Words length must be EVEN! ");
		}

	}
}
