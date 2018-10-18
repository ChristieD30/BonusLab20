import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		boolean checkContents = true;
		Scanner scan = new Scanner(System.in);

		String[] products = { "Apple", "Banana", "Tofu", "Cauliflower", "Grapes", "Chips", "Almonds",
				"Hummus" };
		Double[] prices = { 0.99, 0.59, 1.59, 1.75, 1.99, 2.19, 2.79, 4.25 };

		ArrayList<String> products2 = new ArrayList<String>(Arrays.asList(products));
		ArrayList<Double> prices2 = new ArrayList<Double>(Arrays.asList(prices));
		ArrayList<String> cartItem = new ArrayList<String>();
		ArrayList<Double> cartPrice = new ArrayList<Double>();

		System.out.println("Welcome to Java Market!\nHere is a list of our items and current prices.");
		System.out.printf("%-15s %-15s\n", " Item", "Price");
		System.out.println("===========================");

		for (int i = 0; i < products2.size(); i++) {
			for (int j = 0; j < prices2.size(); j++) {

			}
			System.out.printf("%-20s %-20s %n", (products[i]), Double.toString(prices[i]));

		}
 
		String userChoice = getString(scan, "\nWhat other item would you like to add to your cart?");
		checkContents = products2.contains(userChoice);
do {
		if (checkContents == true) {
			System.out.println("Okay we will add 1 " + userChoice + " to the cart.");

			cartItem.add(userChoice);
			 cartPrice.add(prices2.get(products2.indexOf(userChoice))); }
		
		else {

			System.out.println("That is not a valid option.");
			userChoice = getString(scan, "\nWhat item would you like to add to your cart?");
		}
		 }while (checkContents = true);
		

			for (int i = 0; i < products2.size(); i++) {
				for (int j = 0; j < prices2.size(); j++) {
					
				} System.out.printf("%-20s %-20s %n", (products[i]), Double.toString(prices[i]));

			}

			userChoice = getString(scan, "\nWhat item would you like to add to your cart?");
;
		

 

	}

	public static String getString(Scanner scan, String prompt) {
		System.out.print(prompt);
		String s = scan.next(); // read user entry
		scan.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static void printTable(ArrayList<String> products2, ArrayList<Double> prices2, String[] products,
			Double[] prices) {
		for (int i = 0; i < products2.size(); i++) {
			for (int j = 0; j < prices2.size(); j++) {
				System.out.printf("%-20s %-20s %n", (products[i]), Double.toString(prices[i]));
			}

		}
	}

}
