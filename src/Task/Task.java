package Task;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String[] players = new String[5];
		
		
		System.out.println("Enter first player and results");
		players[0] = in.nextLine();
		System.out.println("Enter second player and results");
		players[1] = in.nextLine();
		System.out.println("Enter third player and results");
		players[2] = in.nextLine();
		System.out.println("Enter forth player and results");
		players[3] = in.nextLine();
		System.out.println("Enter fifth player and results");
		players[4] = in.nextLine();

		int biggest = 0;
		String winner = " ";

		for (String player : players) {
			String[] nameCards = player.split(":");
			String name = nameCards[0];
			String cards = nameCards[1];

			int points = calculatePoints(cards);
			System.out.println(name + " " + cards + " = " + points);

			if (points > biggest) {
				biggest = points;
				winner = name;
			} else if (points == biggest) {
				winner = winner + " , " + name;
			}
		}

		System.out.println("The winners are : " + winner + " with " + biggest + " points");

	}

	public static int calculatePoints(String cards) {
		String[] cardArray = cards.split(",");

		int points = 0;

		for (String card : cardArray) {
			String value = card.substring(0, 1);

			if (value.equals("A")) {
				points += 1;
			} else if (value.equals("T")) {
				points += 10;
			} else if (value.equals("J")) {
				points += 11;
			} else if (value.equals("Q")) {
				points += 12;
			} else if (value.equals("K")) {
				points += 13;
			} else {
				points += Integer.parseInt(value);
			}

		}

		return points;
	}

}
