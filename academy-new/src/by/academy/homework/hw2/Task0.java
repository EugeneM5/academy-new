package by.academy.homework.hw2;

import java.io.IOException;
import java.util.Scanner;

/*Дан массив с int переменными, определить количество пар, разность которых эквивалентна заданному с консоли target значению. */
public class Task0 {

	// Complete the pairs function below.
	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if((arr[i] - arr[j] == k) || (arr[j] - arr[i] == k)) 
					pairsCount++;
				}
			}

		// write code here
		return pairsCount;
	}



	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			System.out.println(arr[i]);
		}

		int result = pairs(k, arr);
		System.out.println(result);

		scanner.close();
	}
}
