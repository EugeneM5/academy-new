package by.academy.homework.hw1;

import java.util.Scanner;

/*Задание 3.
Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).
*/
public class Task3 {

	public static void main(String[] args) {
		System.out.println("Введите число от 1 до 10 ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n > 0 && n < 11) {
		int[][] array = { { 1, 2, 3, 4, 5}, { 6, 7, 8, 9, 10 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(" " + n * array[i][j] + " ");
			}
			System.out.println();

		}

	}
		else {
			System.out.println("Некорректное число! ");
		}
		scan.close();
	}
}
