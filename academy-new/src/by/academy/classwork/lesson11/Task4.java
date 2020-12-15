package by.academy.classwork.lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке и вывести результат на экран.

public class Task4 {

	public Set<Integer> doD(Collection<Integer> a) {
		return new HashSet<Integer>(a);
	}

	public static void main(String[] args) {

		String str = "1, 2, 3, 4, 4, 5";
		String str1 = str.replaceAll("\\s", "");
		String[] str2 = str1.split(",");
		ArrayList<Integer> ar = new ArrayList<>();
		for (String string : str2) {
			ar.add(Integer.parseInt(string));
			System.out.print(string + " ");
		}
		System.out.println(ar.toString());

		Task4 asdsad = new Task4();
		System.out.println("Result is " + asdsad.doD(ar));
	}

}
