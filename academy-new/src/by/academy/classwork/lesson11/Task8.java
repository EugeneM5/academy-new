package by.academy.classwork.lesson11;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
//	8.
//	Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
//	Перебрать и распечатать пары значений - entrySet().
//	Перебрать и распечатать набор из имен продуктов  - keySet().
//	Перебрать и распечатать значения продуктов - values().
//	Для каждого перебора создать свой метод.

	public static void main(String[] args) {
		Map<String,Toy> map = new HashMap<String, Toy>();
		for (int i = 0; i < 5; i++) {
			map.put("bear", new Toy());
			map.put("skjdf", new Toy());
			map.put("as", new Toy());
			map.put("asfg", new Toy());
			map.put("a", new Toy());
		}
		
		System.out.println(map.entrySet());
		//System.out.println(map.keySet());
		//System.out.println(map.values());
		
		Task8.printByValues(map);
		Task8.printByKeySet(map);

	}
	public static <K, V> void printByValues(Map<K, V> map) {
        for (V value : map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }
	public static <K, V> void printByKeySet(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();
    }
}

class Toy {
	
}
