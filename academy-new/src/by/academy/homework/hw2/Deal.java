package by.academy.homework.hw2;

import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] suit = {"Diamonds", "Hearts", "Spades", "Clubs", };
		String[] rate = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		System.out.println("Players count ");
		int num = scanner.nextInt();
		int card = 5;
		int cards = suit.length * rate.length;
		scanner.close();

		if (num * card > cards) {
			System.out.println("Not enough cards in the deck ");
		} else {

			String[] deck = new String[cards];
			for (int i = 0; i < rate.length; i++) {
				for (int j = 0; j < suit.length; j++) {
					deck[suit.length * i + j] = rate[i] + " " + suit[j];
				}

			}
			for (int i = 0; i < cards; i++) {
				int r = i + (int) (Math.random() * (cards - i));
				String temp = deck[r];
				deck[r] = deck[i];
				deck[i] = temp;
			}

			for (int i = 0; i < num * card; i++) {
				System.out.println(deck[i]);
				if (i % card == card - 1)
					System.out.println();
			}

		}

	}

}
