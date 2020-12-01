package by.academy.homework.hw4.Task2;


public class Task2Demo {

	public static void main(String[] args) {
		
		Task2<Integer> array1 = new Task2<>(4);
		
		array1.add(10);
		array1.add(20);
		array1.add(30);
		array1.add(40);
		array1.printArray();
		array1.getFirst();
		array1.getLast();
		array1.getIndex(1);
		array1.getIndexOfLast();
		System.out.println("Array length is " + array1.getLength());
		array1.removeIndex(1);
		array1.printArray();
		System.out.println("Array length is " + array1.getLength());
		array1.removeValue(10);
		array1.printArray();
		System.out.println("Array length is " + array1.getLength());
		array1.printArray();
		array1.getIndexOfLast();
		System.out.println("----------------------------------------");
		
		Task2<String> array = new Task2<>();
		
		array.add("Hello");
		array.add("java");
		array.add("world");
		array.printArray();
		array.getIndexOfLast();
		array.getFirst();
		array.getLast();
		array.getIndex(1);
		System.out.println("Array length is " + array.getLength());
	}

}
