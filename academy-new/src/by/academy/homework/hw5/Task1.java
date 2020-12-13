package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

public class Task1 {

	public static <T> Collection<T> noDuplicates(Collection<T> collection) {
		return new HashSet<>(collection); // Т.к. класс реализует интерфейс Set, он может хранить только уникальные значения;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			arrayList.add(i, (int) (Math.random() * 10 + 1));
		}

		System.out.println(arrayList.toString());
		System.out.println(Task1.noDuplicates(arrayList));
	}

}
