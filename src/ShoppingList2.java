import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author ${Christie Desnoyer}
 *
 * 
 */
public class ShoppingList2 {

	public static void main(String[] args) {
		
		String userChoice;
		Scanner scan = new Scanner(System.in);

		String[] products = { "Apple", "Banana", "Tofu", "Cauliflower", "Grapes", "Chips", "Almonds",
				"Hummus" };
		Double[] prices = { 0.99, 0.59, 1.59, 1.75, 1.99, 2.19, 2.79, 4.25 };

		ArrayList<String> products2 = new ArrayList<String>(Arrays.asList(products));
		ArrayList<Double> prices2 = new ArrayList<Double>(Arrays.asList(prices));
		ArrayList<String> cartItem = new ArrayList<String>();
		ArrayList<Double> cartPrice = new ArrayList<Double>();

		System.out.println("Welcome to Java Market!\nHere is a list of our items and current prices.");
		System.out.printf("%1s %20s\n", " Item", "Price");
		System.out.println("===========================");
		
		
do {  
	System.out.printf("%1s %20s\n", " Item", "Price");
	System.out.println("===========================");
		for (int i = 0; i < products2.size(); i++) {
			for (int j = 0; j < prices2.size(); j++) {
					
			}
			
			System.out.printf("%1d %-18s %3s %n", (i + 1), (products2.get(i)), prices2.get(i));

		}
		System.out.println(" ");
		int number = getInt(scan, "What item would you like to order? \nPlease make a selection with the corresponding number", 1, 8);
		System.out.println(" ");
		number -= 1;
		
		cartItem.add(products2.get(number));
		cartPrice.add(prices2.get(number));
		System.out.println("Okay, we will add, " + products2.get(number) + " at $" + prices2.get(number) + ", to your cart.");
	
		System.out.println(" ");
	    userChoice = getString(scan, "Would you like to order anything else? \nPress y to add more items! Press any other key if you are ready to see your shopping cart. ");
	    System.out.println(" ");
} while (userChoice.equalsIgnoreCase("y"));
		

System.out.println("Thank you for your order! \n Here is what is in your cart. ");
for (int i = 0; i < cartItem.size(); i++) {
	for (int j = 0; j < cartPrice.size(); j++) {
			
	}
	System.out.printf("%-18s %3.2f %n", (cartItem.get(i)), (cartPrice.get(i)));
}
	
	double totalPrices = 0;
    for (int x = 0;  x < cartPrice.size(); x++){

        totalPrices += cartPrice.get(x);
    }
    
    double tax = (totalPrices * 1.06);
    
    System.out.println("The total of your bill is: $" + totalPrices + ", $" + tax + " with tax.");
    
  
    getSums(cartPrice, totalPrices);
	
	getHighestPrice(cartPrice);
   
   getMinimumPrice(cartPrice);
   
  System.out.println("Thank you for shopping at the Java Market!");
		

	}

	private static void getSums(ArrayList<Double> cartPrice, double totalPrices) {
		double averagePrice = 0.0;
		for (int x = 0;  x < cartPrice.size(); x++){

		    averagePrice = totalPrices/cartPrice.size();
		    
		}
		    
		System.out.println("Your average item cost is: $" +  averagePrice);
	}

	private static void getHighestPrice(ArrayList<Double> cartPrice) {
		Double highestPrice = Collections.max(cartPrice);
   System.out.println("The highest priced item is: $" + highestPrice );
	}

	private static void getMinimumPrice(ArrayList<Double> cartPrice) {
		Double lowestPrice = Collections.min(cartPrice);
		
		   System.out.println("The lowest priced item is $" + lowestPrice);
	}

	public static String getString(Scanner scan, String prompt) {
		System.out.print(prompt);
		String s = scan.next(); // read user entry
		scan.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}


	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
		
	}
	

	
}
