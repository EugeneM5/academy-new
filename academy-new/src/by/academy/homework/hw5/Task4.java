package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
//	Задача 4.
//	Создать список оценок учеников с помощью ArryList, заполнить случайными
//	оценками. Найти самую высокую оценку с использованием итератора.

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			marks.add(i, (int) (Math.random() * 10 + 1));
		}
		System.out.println(marks);

		Integer max = 0;
		Iterator<Integer> iterator = marks.iterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i > max) {
				max = i;
			}
		}
		System.out.println("Самая высокая оценка в списке " + max);
	}
}
