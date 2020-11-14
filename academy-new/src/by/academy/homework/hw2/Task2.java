package by.academy.homework.hw2;

import java.util.Scanner;

/*Задание 2. 
Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
*/
public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слова через пробел ");

		String[] words = (scanner.nextLine().split(" "));
		scanner.close();

		int wordCount = 0;
		int n = 0;
		int repeat = 0;
		int count0 = 0;
		String temp = words[0];

		for (String i : words) {
			System.out.println(i);
			wordCount++;
		}
		while (n < wordCount) {
			char[] ch = words[n].toCharArray();
			for (int i = 0; i < ch.length; i++) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						repeat++;
					}
				}
				if (repeat > count0) {
					count0 = repeat;
					temp = words[n];
				} else {
					repeat = 0;
				}
			}
			n++;
		}
		if (repeat == 0 && count0 == 0)
			System.out.println("Нет повторов ");
		else
			System.out.println("Искомое слово " + temp);
	}
}
