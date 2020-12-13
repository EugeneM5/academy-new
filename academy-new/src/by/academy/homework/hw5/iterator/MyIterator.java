package by.academy.homework.hw5.iterator;

import java.util.Iterator;

//Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//Протестировать в main.

public class MyIterator<T> implements Iterator<T> {
	private T[][] array;
	private int i, j;

	public MyIterator(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return i < array.length && j < array[i].length;
	}

	@Override
	public T next() {
		T arr = array[i][j++];
		if (j >= array[i].length) {
			i++;
			j = 0;
		}
		return arr;
	}
}