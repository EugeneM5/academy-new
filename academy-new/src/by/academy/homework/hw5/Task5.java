package by.academy.homework.hw5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
//	Задача 5. 
//	Можно писать все в main. Не нужно создавать новых классов.
//	Имеется текст. Следует составить для него частотный словарь:
//	Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.

	public static void main(String[] args) {
		String text = "krrrskaaasssjgjhgj";

		Map<Character, Integer> vocabulary = new HashMap<>();

		for (int i = 0; i < text.length(); i++) {
			if (!vocabulary.containsKey(text.charAt(i))) {
				vocabulary.put(text.charAt(i), 1);
			} else {
				vocabulary.put(text.charAt(i), vocabulary.get(text.charAt(i)) + 1);
			}
		}
		System.out.println(vocabulary.toString());
	}
}
