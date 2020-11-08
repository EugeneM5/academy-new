package by.academy.homework.hw1;

public class Task4 {
	/*
	 * Задание 4. Выводить на консоль степень двойки, пока результат не будет
	 * больше, чем 1_000_000.
	 */
	public static void main(String[] args) {
		int a = 2;
		int b = 1;

		for (b = 1; b < 100; b++) {
			int res = (int) Math.pow(a, b);
			System.out.print(" " + res);

			if (res > 1_000_000) {
				break;
			}
		}
	}
}