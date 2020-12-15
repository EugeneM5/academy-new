package by.academy.classwork.lesson11;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {

	public static void main(String[] args) {
		List<HeavyBox> heavybox = new ArrayList<>();// а) Создать динамический массив, содержащий объекты класса
													// HeavyBox.

		HeavyBox box = new HeavyBox(5, 3, 7, 8);
		HeavyBox box1 = new HeavyBox(5, 6, 1, 8);
		HeavyBox box2 = new HeavyBox(5, 9, 7, 8);
		HeavyBox box3 = new HeavyBox(4, 6, 7, 8);

		heavybox.add(box);
		heavybox.add(box1);
		heavybox.add(box2);
		heavybox.add(box3);

		for (HeavyBox element : heavybox) { // б) Раcпечатать его содержимое используя for each.
			System.out.println(element);
		}

		box.weight = 1; // в) Изменить вес первого ящика на 1.

		heavybox.remove(3);// г) Удалить последний ящик.

		System.out.println("1------------------------------------");
		Object[] objects = heavybox.toArray(); // д) Получить массив содержащий ящики из коллекции тремя способами и
												// вывести на консоль.
		for (Object object : objects) { // 1
			System.out.println(object);
		}
		System.out.println("2------------------------------------");

		HeavyBox[] y = heavybox.toArray(new HeavyBox[0]); // 2
		for (HeavyBox heavyBox2 : y) {
			System.out.println(heavyBox2);
		}
		System.out.println("3------------------------------------");

		HeavyBox[] x = heavybox.toArray(HeavyBox[]::new); // 3
		for (HeavyBox heavyBox2 : x) {
			System.out.println(heavyBox2);
		}
		heavybox.clear(); // е) Удалить все ящики.
	}

}
