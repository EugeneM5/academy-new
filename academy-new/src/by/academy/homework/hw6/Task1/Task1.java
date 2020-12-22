package by.academy.homework.hw6.Task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
//	Задание 1. 
//	Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, 
//	если введена "stop" строка тогда закончить запись в файл.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your text,please ");
		String input = scanner.nextLine();
		scanner.close();

		String[] text = input.split(" ");

		File dir = new File("C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task1");
		if (!dir.exists()) {
			dir.mkdir();
		}

		File output = new File(
				"C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task1\\task1.txt");
		if (!output.exists()) {
			try {
				output.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task1\\task1.txt"))) {
			for (String word : text) {
				if (word.equals("stop")) {
					System.out.println("Record STOP, please check file...");
					break;
				} else {
					bufferedWriter.write(word);
					bufferedWriter.newLine();
				}
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
