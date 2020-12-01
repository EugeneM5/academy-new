package by.academy.homework.hw4.Task2;
//Задание 2.

//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//Содержит конструктор, принимающий значение int и инитает им размер нашего массива.

public class Task2<T> {

	public static final int DEFAULT_ARRAY_SIZE = 4;
	private T[] array;
	private int arraySize;

	public Task2() {
		array = (T[]) new Object[16];
	}

	public Task2(int arrayLength) {
		super();
		array = (T[]) new Object[arrayLength];
	}

	public void add(T obj) { // 1) добавления в наш массив объекта типа T
		if (array == null) {
			array = (T[]) new Object[DEFAULT_ARRAY_SIZE];
		} else if (arraySize + 1 > array.length) {

			T[] tempArray = (T[]) (new Object[array.length * 2 + 1]);
			System.arraycopy(array, 0, tempArray, 0, array.length);
			array = (T[]) tempArray;
		}
		array[arraySize++] = obj;
	}

	public void getIndex(int i) { // 2) взятие по индексу get(int i)
		if ((i < array.length) && (i >= 0)) {
			System.out.println(i + " element is " + array[i]);
		} else {
			System.out.println("Error! Incorrect index! ");
		}

	}

	public void getLast() { // 3) взятие последнего элемента getLast()
		System.out.println("Last element is " + array[array.length - 1]);
	}

	public void getFirst() { // 4) взятие первого элемента getFirst()
		System.out.println("First element is " + array[0]);
	}

	public int getLength() { // 5) вывод размера массива
		return array.length;
	}

	public void getIndexOfLast() { // 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != null) {
				System.out.println("Last element index is " + i);
				break;
			}
		}
	}

	public void removeIndex(int i) { // 7) удаление элемента по индексу (remove(int i)
		if ((i < array.length) && (i >= 0)) {
			for (int k = i; k < array.length - 1; k++) {
				array[k] = array[k + 1]; // сдвиг последующих элементов
			}
			T[] tempArray = (T[]) (new Object[array.length - 1]);
			System.arraycopy(array, 0, tempArray, 0, array.length - 1);
			array = tempArray;
		}
	}

	public void removeValue(T obj) { // 8) удаление элемента по значению (remove(T obj))
		for (int i = 0; i < array.length; i++) {
			if (array[i] == obj) {
				removeIndex(i);
			}
		}
	}

	public void printArray() {
		for (int i = 0; i < array.length; i++) { // печать массива
			System.out.print((T) array[i] + " ");
		}
		System.out.println("");
	}

}
