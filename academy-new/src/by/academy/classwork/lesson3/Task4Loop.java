package by.academy.classwork.lesson3;

public class Task4Loop {

	/*public static void main(String[] args) {
		// 4. Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while. 
		// 5. Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
		public static void main(String[] args) {
		int n = 1;
		
		while(n < 11) {
			System.out.println("Task" + n);	
			n++;
			
		
		}
		*/
				

	
	public static void main(String[] args) {
		int n = 0;
		
		do {
			n++;
			System.out.print(" " + n);
			
			
		}	while( n < 100 && n % 5 == 0);
	//	System.out.println(n);
			
		//	System.out.println("");

}
}
