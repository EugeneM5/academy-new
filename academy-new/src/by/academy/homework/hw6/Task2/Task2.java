package by.academy.homework.hw6.Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
//	Задание 2.
//	Создать руками текстовый файл, закинуть следующий текст:""
//	Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.
	
	public static final String OUTPUT_FILE_PATH = "C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task2\\result.txt";
	public static final String INPUT_FILE_PATH = "C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\text.txt";

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task2");
		if (!dir.exists()) {
			dir.mkdir();
		}

		File output = new File(OUTPUT_FILE_PATH);
		if (!output.exists()) {
			try {
				output.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		char[] array = new char[1024];

		try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
			while ((reader.read(array)) > 0);
			stringBuilder.append(array);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String outputString = stringBuilder.toString();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
			writer.write(outputString.replaceAll("\\s", ""));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
