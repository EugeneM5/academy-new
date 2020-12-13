package by.academy.homework.hw5.iterator;

public class MyIteratorDemo {

	public static void main(String[] args) {

		Integer[][] array = { { 1, 2, 3 }, { 4, 5, 6 } , { 7, 7, 7 }};
		
		MyIterator<Integer> myIterator = new MyIterator<Integer>(array);
		
		while(myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		
		
	}

}
