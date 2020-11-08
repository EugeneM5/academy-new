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
		
		String s = in.nextLine();
		
		System.out.println(Arrays.toString(s.split(" +")));
		
		
		
		
		
		
		
		
	/*	System.out.println("Введите планируемое колличество слов");
		int n = in.nextInt();
		String[] arr = new String[n];
		System.out.println("Введите слово ");
		
		arr[0] = in.nextLine();
		char[] a = arr[0].toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextLine();
			
			System.out.println("Введите слово ");
			
		}
		System.out.println(Arrays.toString(arr));
		
	*/	
	}
	

}
