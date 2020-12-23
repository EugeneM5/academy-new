package by.academy.homework.hw6.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {
	public static final String INPUT_FILE_PATH = "C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\text.txt";
	public static final String OUTPUT_FILE_PATH = "C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task4\\result.txt";

	public static void main(String[] args) {
//		Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt). 
//		Считываем текст из 2-ого задания, получаем его длинну (576 символов). 
//		Для каждого файла генерируем рандомное число от 0 до 576, 
//		достаем из текста (из 2 задания) такое-же количество символов (string.substring()) и сохраняем в наш файл. 
//		Создайте файл result.txt и запишите туда список всех файлов и их размеры.

		File dir = new File("C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task4\\files");
		if (!dir.exists()) {
			dir.mkdir();
		}

		File result = new File(OUTPUT_FILE_PATH);
		if (!result.exists()) {
			try {
				result.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		
		char[] array = new char[576];

		try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
			while ((reader.read(array)) > 0);
			stringBuilder.append(array);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String outputString = stringBuilder.toString();
		Random rand = new Random();
		try (BufferedWriter resWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE_PATH))) {
			for (int i = 1; i <= 100; i++) {
				int randomizer = rand.nextInt(576);
				File file = new File(dir, i + ".txt");
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				try (BufferedWriter filewriter = new BufferedWriter(new FileWriter(file))) {
					filewriter.write(outputString.substring(0, randomizer));
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
				resWriter.write("File name: " + file.getName() + " & length: " + file.length() + "\n");
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
