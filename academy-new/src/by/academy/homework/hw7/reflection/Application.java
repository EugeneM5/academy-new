package by.academy.homework.hw7.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Вывод Declare Methods & Fields получает видимость к private и остальным полям и методам только класса User;
//А с помощью Methods & Fields, можно видеть все public методы и поля как User, так и родителя Person;
public class Application {

	public static void main(String[] args) {

		Class<User> clzUser = User.class;

		User user = new User("Ivan", "ivan123", "ivan@gmail.com");

		try {
			Method meth = clzUser.getMethod("printUserInfo");// getMethod("name")
			System.out.println("Method name is: " + meth.getName());
		} catch (NoSuchMethodException | SecurityException e1) {
			System.out.println("There is no public methods! ");
		}

		Method[] method = clzUser.getMethods(); // getMethods()
		System.out.println("User methods: ");
		for (Method m : method) {
			System.out.println(m.getName());
		}

		try {
			Field fielld = clzUser.getField("login"); // getField("name")
			String loginValue = (String) fielld.get(user);
			System.out.println("User login is: " + loginValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Field[] fieldd = clzUser.getFields(); // getFields()
		System.out.println("User fields: ");
		for (Field f : fieldd) {
			System.out.println(f.getName());
		}

		System.out.println("*******************Declared********************");

		try {
			Method declareMethod = clzUser.getDeclaredMethod("printUserInfo"); // getDeclaredMethod("name")
			System.out.println("DeclaredMethod name is: " + declareMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method[] declareMethods = clzUser.getDeclaredMethods(); // getDeclaredMethods()
		System.out.println("Declared User methods: ");
		for (Method m : declareMethods) {
			System.out.println(m.getName());
		}

		try {
			Field declaredField = clzUser.getDeclaredField("password"); // getDeclaredField("name")
			declaredField.setAccessible(true); // с помощью этого получаем доступ к private password, без этого ругаетсяна private!
			String passwordValue = (String) declaredField.get(user);
			System.out.println("User declared password is: " + passwordValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Field[] field = clzUser.getDeclaredFields(); // getDeclaredFields()
		System.out.println("Declared User fields: ");
		for (Field f : field) {
			System.out.println(f.getName());
		}

		System.out.println("*******************set & get********************"); //Просетать все значения через Reflection. (set метод класса Field).(get метод класса Field).  

		try {
			Field setValueField = clzUser.getDeclaredField("password");
			setValueField.setAccessible(true);
			setValueField.set(user, "Vanya123");
			String passwordValue = (String) setValueField.get(user);
			System.out.println("User changed password is: " + passwordValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field setValueField = clzUser.getDeclaredField("login");
			setValueField.setAccessible(true);
			setValueField.set(user, "Vanya");
			String loginValue = (String) setValueField.get(user);
			System.out.println("User changed login is: " + loginValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field setValueField = clzUser.getDeclaredField("email");
			setValueField.setAccessible(true);
			setValueField.set(user, "Vanya@mail.ru");
			String emailValue = (String) setValueField.get(user);
			System.out.println("User changed email is: " + emailValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("*******************invoke********************");
		
		try {
			Method declareMethod = clzUser.getDeclaredMethod("printUserInfo"); // Вызвать toString через invoke.
			declareMethod.setAccessible(true);
			declareMethod.invoke(user);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
