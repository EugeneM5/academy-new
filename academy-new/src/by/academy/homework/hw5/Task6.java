package by.academy.homework.hw5;

public class Task6 {
//	Задача 6.
//	Попробовать добавить в массив int на 8 элементов 10 чисел. 
//	Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
//	"Array is to small, expand the array".

	public static void main(String[] args) {

		int[] array = new int[8];

		try {
			for (int i = 0; i <= 10; i++) {
				array[i] = (int) (Math.random() * 10 + 1);
				System.out.print(array[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array!");
		}

	}

}
