package by.academy.homework.hw6.Task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
//		В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. 
//		Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге. 
//		Назовите файл Имя_Фамилия.txt. 
//		Сериализуйте информацию о пользователе и положите в файл пользователя. 
//		Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Vasya", "First", 21));
		users.add(new User("Vasya", "Second", 22));
		users.add(new User("Vasya", "Third", 23));
		users.add(new User("Vasya", "Fourth", 24));
		users.add(new User("Vasya", "Fives", 25));
		users.add(new User("Vasya", "Six", 26));
		users.add(new User("Vasya", "Sevens", 27));
		users.add(new User("Vasya", "Eights", 28));
		users.add(new User("Vasya", "Nines", 29));
		users.add(new User("Vasya", "Tens", 30));

		File dir = new File("C:\\Users\\User\\git\\academy-new\\academy-new\\src\\by\\academy\\homework\\hw6\\Task3");
		if (!dir.exists()) {
			dir.mkdir();
		}

		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			File file = new File(dir, user.getFirstName() + "_" + user.getLastName() + ".txt");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
			try (FileWriter filewriter = new FileWriter(file)) { // здесь идет запись инфы о User в файл из переопределенного toString
				filewriter.write(user.toString());
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
			try (FileOutputStream outputStream = new FileOutputStream(file); /// Без блока сериализации в файл получаем красивое описание, а с ним иероглифы
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {// файлы на гите залиты красивые, до сериализации
				objectOutputStream.writeObject(user);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
