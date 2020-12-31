package by.academy.homework.hw7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
//	Задача 1. Stream/Lambda.
//	Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100. 
//	Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию. 
//	Пропустив первые 3 числа произвести следующие операции:
//	Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: ("Number: " + value).

	public static void main(String[] args) {

		List<Long> longList = new Random().longs(100, 1, 100).map(x -> (long) (x * Math.PI - 20)).filter(x -> x < 100)
				.sorted().skip(3).distinct().boxed().collect(Collectors.toList());

		Map<Long, String> map = longList.stream().collect(Collectors.toMap(x -> x, value -> "Number: " + value));
		System.out.println(map);

	}
}