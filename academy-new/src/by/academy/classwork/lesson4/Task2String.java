package by.academy.classwork.lesson4;

public class Task2String {

	public static void main(String[] args) {
/*		Задание 2.

		а) Дано два числа, например 3 и 56, необходимо составить следующие строки: 
			3 + 56 = 59 
			3 – 56 = -53 
			3 * 56 = 168. 
			Используем метод StringBuilder.append(). 
		б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt(). 
		в) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
*/		
int a = 3;
int b = 56;

StringBuilder s = new StringBuilder();
s.append(a).append(" + ").append(b).append(" = ").append(a + b);
s.deleteCharAt(7);
s.insert(7, "равно");

s.append("\n" + a).append(" - ").append(b).append(" = ").append(a - b);
s.replace(7, 12, "равно");

s.append("\n" + a).append(" * ").append(b).append(" = ").append(a * b);

System.out.println(s);

}

}
