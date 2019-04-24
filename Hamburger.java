package java2;

import java.util.Scanner;

//Glenn Houghton 
//lab 4 
//hamburger class
public class Hamburger {
	public static final double SALES_TAX = 0.08625;//sales tax constant
	public static String meatType = "beef";//meat type variable defaulting to beef
	public static int numberOfPatties;//controls patty number. important for final price
	public static String typeOfBun;//bun type
	public static String howCooked;//how well done the burger is
	public static String[] standardToppingList = new String[11];// stores selected toppings
	public static String[] standardSauceList = new String[6];//stores selected sauces
	public static String[] cheeseToppingList = { "American", "Mozzerlla", "Chedder" };//types of cheese.just a fancy list
	public static int[] counterT = { 0, 0, 0 };//keeps track of selected cheese
	public static double costOfCheeseTopping=1.00;//phased out unused
	public static String[] deluxeToppingList = { "Red Onion", "Bacon", "Sauteed Onions", "Sriracha Sauce", "Jalapos" };
// fancy topping list
	public static int[] counterD = { 0, 0, 0, 0, 0 };//tracking fancy topping
	public static double costOfDeluxeToppings=1.25;//price of deluxe toppings

	public static String setMeat() {//method for setting meat type
		Scanner kb = new Scanner(System.in);
		String meat = kb.nextLine();
		if (meat.equalsIgnoreCase("beef")) {//identifying keyboard input
			meatType = "Beef";
		} else if (meat.equalsIgnoreCase("turkey")) {
			meatType = "Turkey";
		} else if (meat.equalsIgnoreCase("veggie")) {
			meatType = "Veggie";
		} else {
			meatType = "beef";
		}
		return meatType;
	}

	public static int setPatties() {//setting patty number
		Scanner kb = new Scanner(System.in);
		int patty = kb.nextInt();
		if (patty == 1) {
			numberOfPatties = 1;
		} else if (patty == 2) {
			numberOfPatties = 2;
		} else if (patty == 3) {
			numberOfPatties = 3;
		} else {
			System.out.println("Invalid number of patties. One patty selected");
			numberOfPatties = 1;
		}

		return numberOfPatties;
	}

	public static String setBun() {//setting bun type
		Scanner kb = new Scanner(System.in);
		String bun = kb.nextLine();
		if (bun.equalsIgnoreCase("sesame seed")) {//input identifier
			typeOfBun = "Sesame Seed";
		} else if (bun.equalsIgnoreCase("whole wheat") || bun.equalsIgnoreCase("whole-wheat")) {
			typeOfBun = "Whole-Wheat";
		} else if (bun.equalsIgnoreCase("white")) {
			typeOfBun = "White";
		} else if (bun.equalsIgnoreCase("pretzel")) {
			typeOfBun = "Pretzel";
		} else if (bun.equalsIgnoreCase("multi grain") || bun.equalsIgnoreCase("multi-grain")) {
			typeOfBun = "Multi-Grain";
		} else if (bun.equalsIgnoreCase("traditional")) {
			typeOfBun = "Traditional";
		} else if (bun.equalsIgnoreCase("brioche")) {
			typeOfBun = "Brioche";
		} else {
			typeOfBun = "Sesame Seed";
		}
		return typeOfBun;
	}

	public static String setCooked() {//setting rarity of burger
		Scanner kb = new Scanner(System.in);
		String heat = kb.nextLine();
		if (heat.equalsIgnoreCase("rare")) {//input identifier
			howCooked = "rare";
		} else if (heat.equalsIgnoreCase("medium rare") || heat.equalsIgnoreCase("medium-rare")) {
			howCooked = "Medium=Rare";
		} else if (heat.equalsIgnoreCase("Medium")) {
			howCooked = "Medium";
		} else if (heat.equalsIgnoreCase("well")) {
			howCooked = "Well Done";
		} else {
			howCooked = "Medium";
		}
		return howCooked;
	}

	public static String setToppings() {//setting topping. 
		
		Scanner kb = new Scanner(System.in);
		int counter = 0;
		for (int i = 0; i < 11; i++) {//loops topping selector for multitopping burger
			counter = i;
			if (i < 11) {
				System.out.println("Select another topping or type next to continue");// topping loop
			}
			String topping = kb.nextLine();
			if (topping.equalsIgnoreCase("tomato")) {//input identifier
				standardToppingList[i] = "Tomato";
			} else if (topping.equalsIgnoreCase("pickle")) {
				standardToppingList[i] = "Pickle";
			} else if (topping.equalsIgnoreCase("lettuce")) {
				standardToppingList[i] = "Lettuce";

			} else if (topping.equalsIgnoreCase("cucumber")) {
				standardToppingList[i] = "Cucumber";
			} else if (topping.equalsIgnoreCase("white onions")) {
				standardToppingList[i] = "White Onions";
			} else if (topping.equalsIgnoreCase("next")) {
				i = 10;

			} else {
				i = 10;
			}

		}

		return standardToppingList[counter];

	}

	public static String setSauces() {//setting sauce
		Scanner kb = new Scanner(System.in);
		int counter = 0;
		for (int i = 0; i < 6; i++) {//sauce loop
			counter = i;
			String sauce = kb.nextLine();
			if (sauce.equalsIgnoreCase("mustard")) {//input identifier
				standardSauceList[i] = "Mustard";
			} else if (sauce.equalsIgnoreCase("Djon mustard")) {
				standardSauceList[i] = "Djon Mustard";

			} else if (sauce.equalsIgnoreCase("ketchup")) {
				standardSauceList[i] = "Ketchup";
			} else if (sauce.equalsIgnoreCase("mayonnaise")) {
				standardSauceList[i] = "Mayonnaise";
			} else if (sauce.equalsIgnoreCase("hot sauce")) {
				standardSauceList[i] = "Sauce";
			} else if (sauce.equalsIgnoreCase("next")) {
				i = 10;//allows loop breaking
//figure out better system. possibly booleans
			} else {
				i = 10;
			}

			if (i < 11) {
				System.out.println("Select another sauce or type next to continue");
			}
		}

		return standardToppingList[counter];

	}

	public static String setCheese() {//setting cheese
		Scanner kb = new Scanner(System.in);

		int counter = 0;
		do {//do while to satisfly lack of cheese limit
			System.out.println("Select another cheese or type next to continue");
			String cheese = kb.nextLine();
			if (cheese.equalsIgnoreCase("american")) {//input identifier
				counterT[0] = counterT[0] + 1;

			} else if (cheese.equalsIgnoreCase("mozerella")) {
				counterT[1] = counterT[1] + 1;
			} else if (cheese.equalsIgnoreCase("Chedder")) {
				counterT[2] = counterT[2] + 1;
			} else if (cheese.equalsIgnoreCase("next")) {
				counter = 1;
			} else {
				counter = 1;
			}
		} while (counter == 0);

		return cheeseToppingList[1];
	}

	public static String setDeluxeTopping() {//sets fancy toppings
		Scanner kb = new Scanner(System.in);

		int counter = 0;
		do {//satifys lack of fancy topping limit. 
			//look into making earlier loops work like this
			System.out.println("Select another deluxe topping or type next to continue");
			String deluxe = kb.nextLine();
			if (deluxe.equalsIgnoreCase("red onion")) {//input identifier
				counterD[0] = counterD[0] + 1;
			} else if (deluxe.equalsIgnoreCase("bacon")) {
				counterD[1] = counterD[1] + 1;
			} else if (deluxe.equalsIgnoreCase("sauteed onions")) {
				counterD[2] = counterD[2] + 1;
			} else if (deluxe.equalsIgnoreCase("Sriracha sauce")) {
				counterD[3] = counterD[3] + 1;
			} else if (deluxe.equalsIgnoreCase("jalapenos")) {
				counterD[4] = counterD[4] + 1;
			} else if (deluxe.equalsIgnoreCase("next")) {
				counter = 1;
			} else {
				counter = 1;
			}
		} while (counter == 0);

		return deluxeToppingList[1];
	}
//END OF USER INPUT.START OF RECIPT
	public static String getMeat() {//prints meat type. no price change
		System.out.printf("%1s %9s%n", "Type of meat:", meatType);
		return meatType;
	}

	public static int getPatties() {//prints patty number. price calculation in total method
		System.out.printf("%1s %1d%n", "Number of patties:", numberOfPatties);

		return 1;
	}

	public static String getBun() {//prints bun type.no price change
		System.out.printf("%1s %10s%n", "Type of bun:", typeOfBun);
		;
		return typeOfBun;
	}

	public static String getCooked() {//prints rarity. no price change
		System.out.printf("%1s %8s%n", "How well done:", howCooked);
		return howCooked;
	}

	public static String getToppings() {//prints toppings.no price change
		System.out.println("Toppings");
		System.out.println("--------------------");
		for (int i = 0; i < standardToppingList.length; i++) {//tries to kill null values
			if (standardToppingList[i] != null) {
				System.out.println(standardToppingList[i]);
			}
		}
		return standardToppingList[1];

	}

	public static String getSauces() {
		System.out.println("Sauces");
		System.out.println("--------------------");
		for (int i = 0; i < standardSauceList.length; i++) {

			if (standardSauceList[i] != "null") {
				System.out.println(standardSauceList[i]);
			}
		}
		return standardSauceList[1];
	}

	public static String getCheese() {
		System.out.println("Cheese Toppings");
		System.out.println("---------------------");
		for (int i = 0; i < cheeseToppingList.length; i++) {
			if (counterT[i] > 0) {
				System.out.printf("%10s%10d%n", cheeseToppingList[i], counterT[i]);
			}
		}
		return cheeseToppingList[1];
	}

	public static String getDeluxeToppings() {
		System.out.println("Deluxe Toppings");
		System.out.println("----------------------");
		for (int i = 0; i < deluxeToppingList.length; i++) {
			if (counterD[i] > 0) {
				System.out.printf("%1s%5d%n", deluxeToppingList[i], counterD[i]);
			}
		}
		return deluxeToppingList[1];
	}

	public static  String  Total() {
		
		double total;
		double subTotal = 5.99;
		if (numberOfPatties > 1) {
			subTotal = subTotal + (numberOfPatties * 1.50);
		}
		if (counterT[0] > 0 || counterT[1] > 0 || counterT[2] > 0) {
			int cheeseTotal = counterT[0] + counterT[1] + counterT[2];
			subTotal = subTotal + cheeseTotal;
		}
		if (counterD[0] > 0 || counterD[1] > 0 || counterD[2] > 0 || counterD[3] > 0 || counterD[4] > 0) {
			int deluxeTotal = counterD[0] + counterD[1] + counterD[2] + counterD[3] + counterD[4];
			
			subTotal = subTotal + (deluxeTotal*costOfDeluxeToppings);
		}
		total = subTotal * SALES_TAX;
		total = total + subTotal;
		
		System.out.printf("%1s%.2f%n", "Subtotal:$", subTotal);
		System.out.printf("%1s%.2f%n", "Total:$", total);
		return "";
	}
}
