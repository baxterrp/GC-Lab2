import java.util.Scanner;

public class AdventureGame {

	// method to randomly generate 1 or 2
	static boolean returnRandom() {
		int test = (int) ((Math.random() * 2) + 1);
		if (test > 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		// set up variables
		Scanner scan = new Scanner(System.in);
		String player;
		boolean dinner = false;
		boolean movie = false;

		// get player name
		System.out.print("Welcome to Ypsilanti! Enter your name : ");
		player = scan.nextLine();

		System.out.println("\nHello " + player + ".\n");
		System.out
				.print("You have plans to get a movie tonight. Did you want to get dinner first?");
		// first option getting dinner?
		String getDinner = scan.nextLine();

		// if yes, chance a disaster
		if (Character.toLowerCase(getDinner.charAt(0)) == 'y') {
			if (returnRandom()) {
				dinner = true;
				System.out
						.println("\nYou safely drive downtown and enjoy a meal and tasty beverage.\n");
			} else {
				System.out
						.println("\nSorry "
								+ player
								+ ", the roads are closed for a parade or something, it wasn't meant to be.\n");
			}
		} else {
			System.out.println("\nAlright, you're not hungry...\n");
		}

		// get input for movie
		System.out
				.print("Time to head to the movie!\n\nWhat movie would you like to see? There is a 1) a sci-fi and 2) some kids movie.");

		int movieChoice = scan.nextInt();

		// chance a disaster
		if (returnRandom()) {
			System.out.print("\nEnjoy the ");
			switch (movieChoice) {
			// if no disaster, display movie choice
			case 1:
				System.out.println("sci-fi movie.\n");
				movie = true;
				break;
			case 2:
				System.out.println("kids movie.\n");
				movie = true;
				break;
			}
		} else {
			// if disaster, no movie
			System.out
					.println("\nOh man, looks like the theater is closed for remodel.\n");
		}

		// output a summary of day using comparisons
		if (movie && dinner) {
			System.out.println("Dinner and movie, you had a pleasant evening.");
		} else if (movie && !dinner) {
			System.out
					.println("You enjoyed your movie, but now you're hungry.");
		} else if (dinner && !movie) {
			System.out
					.println("Dinner was great, but too bad about the theater.");
		} else {
			System.out.println("Sorry " + player
					+ ", you had a very uneventful night.");
		}
		scan.close();

	}
}
