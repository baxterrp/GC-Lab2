import java.util.Scanner;

public class AdventureGame {

	static boolean returnRandom() {
		int test = (int) ((Math.random() * 2) + 1);
		if (test > 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String player;
		String response;
		Boolean dinner = false;

		System.out.print("Welcome to Ypsilanti! Enter your name : ");
		player = scan.nextLine();

		System.out.println("Hello " + player + ", welcome to Robert's game.");
		System.out
				.print("You have plans to get a movie tonight. Did you want to get dinner first?");
		response = scan.nextLine();

		if (Character.toLowerCase(response.charAt(0)) == 'y') {
			if (returnRandom()) {
				dinner = true;
				System.out
						.println("You safely drive downtown and enjoy a meal and tasty beverage.");
			} else {
				System.out
						.println("Sorry "
								+ player
								+ ", the roads are closed for a parade or something, it wasn't meant to be.");
			}
		} else {
			System.out.println("Alright, you're not hungry...");
		}
		System.out
				.println("Time to head to the movie!\nWhat movie would you like to see? There is a 1) a sci-fi and 2) some kids movie.");
		int movie = scan.nextInt();
		if (returnRandom()) {
			System.out.print("Enjoy the ");
			switch (movie) {
			case 1:
				System.out.print("sci-fi movie.");

				break;
			case 2:
				System.out.print("kids movie");
				break;
			}
		} else {
			if (dinner) {
				System.out
						.println("Oh man, looks like the theater burned down. No movie for you. At least you had dinner");
			} else {
				System.out
						.println("Oh man, looks like the theater burned down. No movie OR dinner!");
			}
		}

		scan.close();

	}
}
