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
			dinner = true;
			if (returnRandom()) {
				System.out
						.println("You safely drive downtown and enjoy a meal and tasty beverage.");
			} else {
				System.out
						.println("The roads are closed for a parade or something, it wasn't meant to be.");
			}
		} else {
			System.out.println("Alright, you're not hungry...");
		}
		System.out.println("Time to head to the movie!");

	}
}
