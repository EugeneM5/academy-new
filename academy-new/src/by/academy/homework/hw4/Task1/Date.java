package by.academy.homework.hw4.Task1;
// НУЖНО ДОПИЛИТЬ!!!!
import java.util.Scanner;

//Задание 1.

//Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class Date {

	public static class Year {
		 public void bissextile() {
			 
             Scanner input = new Scanner(System.in);
             int year = input.nextInt();
             if (year % 4 == 0) {
                 if (year % 100 == 0) {
                     if (year % 400 == 0) {
                         System.out.println("bissextile");
                     }
                 }
             } else {
                 System.out.println("not bissextile");
             }
             Year yearO = new Year();
             yearO.bissextile();
         }
     }
 

	public static class Month {

        public int getDays() {
            Scanner input = new Scanner(System.in);
            int month = 0;
            String error;
            System.out.println("Input the number of the month");
            input = new Scanner(System.in);
            int monthNum = input.nextInt();
            switch (monthNum) {
 
                case 1:
                    month = 31;
                    break;
                case 2:
                    month = 28;
                    break;
                case 3:
                    month = 31;
                    break;
                case 4:
                    month = 30;
                    break;
                case 5:
                    month = 31;
                    break;
                case 6:
                    month = 30;
                    break;
                case 7:
                    month = 31;
                    break;
                case 8:
                    month = 31;
                    break;
                case 9:
                    month = 30;
                    break;
                case 10:
                    month = 31;
                    break;
                case 11:
                    month = 30;
                    break;
                case 12:
                    month = 31;
                    break;
                default:
                    error = "wrong number";
                    break;
            }
            return month;
        }
    }

	public static class Day {
		 public String dayOfTheWeek() {
	            Scanner input = new Scanner(System.in);
	            String day = "";
	            input = new Scanner(System.in);
	            int weekDayNum = input.nextInt();
	 
	            switch (weekDayNum) {
	                case 1:
	                    day = "Monday";
	                case 2:
	                    day = "Tuesday";
	                case 3:
	                    day = "Wednesday";
	                case 4:
	                    day = "Thursday";
	                case 5:
	                    day = "Friday";
	                case 6:
	                    day = "Saturday";
	                case 7:
	                    day = "Sunday";
	            }
	            return day;
	        }
	    

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date.Year year = new Date.Year();
		
		Date.Month month = new Date.Month();
		Date.Day day = new Date.Day();
		
	}

}
