package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.LinkedList;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//Замерьте время, которое потрачено на это. 
//Сравните результаты и предположите, почему они именно такие.

public class Task2 { // корректно отрабатывает со значением не более 10000;

	public static void addArray(ArrayList<Integer> array) {
		for (int i = 0; i <= 10000; i++) {
			array.add((Integer) (int) (Math.random() * 10));
		}
	}

	public static void addList(LinkedList<Integer> list) {
		for (int i = 0; i <= 10000; i++) {
			list.add((Integer) (int) (Math.random() * 10));
		}
	}

	public static void getArray(ArrayList<Integer> array) {
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			arr.add(array.get((int) ((i) * (Math.random() * 10))));
		}
		System.out.println(arr);
		System.out.println(System.currentTimeMillis() - startTime);
	}
	
	public static void getList(LinkedList<Integer> list) {
		long startTime = System.currentTimeMillis();
		LinkedList<Integer> arr = new LinkedList<>();
		for (int i = 0; i <= 1000; i++) {
			arr.add(list.get((int) ((i) * (Math.random() * 10))));
		}
		System.out.println(arr);
		System.out.println(System.currentTimeMillis() - startTime);
	}

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		Task2.addArray(arraylist);
		System.out.println(arraylist);
		Task2.getArray(arraylist);

		System.out.println("---------------------------------");

		LinkedList<Integer> list = new LinkedList<Integer>();
		Task2.addList(list);
		System.out.println(list);
		Task2.getList(list);
	}

}
