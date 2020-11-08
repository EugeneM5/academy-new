package by.academy.homework.hw1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {


		float discountSum;
		float finalPrice;

		Scanner in = new Scanner(System.in);
		System.out.println("Input customers age \n");
		int customerAge = in.nextInt();
		System.out.println("Input customerSum \n");
		float customerSum = in.nextFloat();

		in.close();

		if (customerSum < 100) {
			discountSum = (customerSum * 5) / 100;
			finalPrice = customerSum - discountSum;
			System.out.println("Total price is " + finalPrice);
		} else if (100 <= customerSum && customerSum < 200) {
			discountSum = (customerSum * 7) / 100;
			finalPrice = customerSum - discountSum;
			System.out.println("Total price is " + finalPrice);
		} else if (200 <= customerSum && customerSum < 300) {
			if (18 <= customerAge) {
				discountSum = (customerSum * 16) / 100;
				finalPrice = customerSum - discountSum;
				System.out.println("Bingo! You win! Total price is " + finalPrice);
			} else {
				discountSum = (customerSum * 9) / 100;
				finalPrice = customerSum - discountSum;
				System.out.println("Sorry, your discount is fallen down... Total price is " + finalPrice);
			}

		} else if (300 <= customerSum && customerSum < 400) {
			discountSum = (customerSum * 15) / 100;
			finalPrice = customerSum - discountSum;
			System.out.println("Total price is " + finalPrice);
		} else if (400 <= customerSum) {
			discountSum = (customerSum * 20) / 100;
			finalPrice = customerSum - discountSum;
			System.out.println("Total price is " + finalPrice);

		} else {
			System.out.println("Input the correct number ");
		}

	}
}