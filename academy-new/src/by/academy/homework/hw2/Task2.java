package by.academy.homework.hw2;

import java.util.Arrays;
import java.util.Scanner;

/*Задание 2. 
Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
*/
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Введите слова через пробел ");

		String text = new String(in.nextLine());
		String[] word = text.split(" ");

		int count = 0;
		int temp = 0;
		int g = 0;
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
			g = i;
		}

		int n = 0;
		while (n <= g) {

			System.out.println("Номер слова " + n);
			char[] ch = word[n].toCharArray();
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] == ch[j + 1]) {
					continue;
				} else {
					count++;

				}

			}
			System.out.println(Arrays.toString(ch));
			System.out.println("в " + n + " слове число повторов " + count);
			n++;
		}

	}
}


