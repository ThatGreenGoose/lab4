//glenn houghton
//lab 4
//driver program
//runs the hamburger class as a front end println manager
package java2;


public class BurgerDriver {


	public static void main(String[] args) {
		System.out.println("Hello and welcome to the burger shack");
		System.out.println("what kind of meat would you like on your burger?");//meat selection
		System.out.printf("Beef%nTurkey%nVeggie%n");
		Hamburger.setMeat();//takes user input for meat type
		System.out.println("-------------------------------------");
		System.out.println("How many patties would you like?");//patty selection
		System.out.println("One burger is $5.99 with an additional $1.50 per patty");
		System.out.println("-------------------------------------");
		System.out.printf("1%n2%n3%n");
		 Hamburger.setPatties();//takes user input for number of patties
		System.out.println("-------------------------------------");
		System.out.println("What kind of bun would you like?");//bun selection
		System.out.printf("Seasame Seed%nWhole Wheat%nWhite%nPretzel%nMulti-Grain%nTraditional%nBrioche%n");
		 Hamburger.setBun();//takes user input for bun
		System.out.println("-------------------------------------");
		System.out.println("How would you like it cooked?");//rarity selection
		System.out.printf("Rare%nMedium Rare%nMedium%nWell%n");
		 Hamburger.setCooked();//takes user input for rarity
		System.out.println("-------------------------------------");
		System.out.println("Would you like any toppings?");//topping selection and rules
		System.out.println("All toppings are complementary but you can only have up to 10");
		System.out.println("Repeating a Topping will add extra");
		System.out.println("-------------------------------------");
		System.out.printf("Tomato%nLettuce%nPickles%nCucumber%nWhite Onions%n");// TOPPINGS FREE
		 Hamburger.setToppings();//takes user input for toppings
		System.out.println("-------------------------------------");
		System.out.println("Would you like any sauces?");// sauce selection and rules
		System.out.println("-------------------------------------");
		System.out.println("All sauces are complementary but you can only have up to 6");
		System.out.println("Repeating a sauce will add extra");
		System.out.println("-------------------------------------");
		System.out.printf("Mustard%nDjon Mustard%nKetchup%nMayonnaise%nHot Sauce%n");
		Hamburger.setSauces();//takes user input for sauces
		System.out.println("-------------------------");
		  System.out.println("What kind of cheese would you like on your burger?");//cheese selection
		  System.out.printf("Cheese is a dollar each slice %nTo add extra slices repeat the type of cheese you desire%n");
		  System.out.println("------------------------------------");
		  System.out.printf("American%nMozerella%nChedder%n");
		Hamburger.setCheese();//takes user input for cheese selection
		  System.out.println("------------------------");
		System.out.println("What kind of deluxe toppings would  you like?");//fancy topping selection
		System.out.println("All deluxe toppings are $1.25 each");
		System.out.println("Repeating a deluxe topping will add extra");
		  System.out.println("------------------------");
		  System.out.  printf("Red Onion%nBacon%nSauteed Onions%nSriracha Sauce%nJalapenos%n");
		  Hamburger.setDeluxeTopping();//takes user input for fancy toppings
		  System.out.println("------------------------");//starts recipt creation
		  System.out.println("you have selected:");
		  System.out.println("------------------------");
		  Hamburger.getMeat();//calls method to display meat
		  System.out.println("------------------------");
		  Hamburger.getPatties();//calls method to display number of patties
		  System.out.println("------------------------");
		  Hamburger.getBun();//calls method to display bun
		  System.out.println("------------------------");
		  Hamburger.getCooked();//calls method to display rarity
		  System.out.println("------------------------");
		  Hamburger.getToppings();//calls method to display topping
		  System.out.println("------------------------");
		  Hamburger.getSauces();//calls method to display sauces
		  System.out.println("------------------------");
		  Hamburger.getCheese();//calls method to display cheese
		  System.out.println("------------------------");
		  Hamburger.getDeluxeToppings();//calls method to display fancy topping
		  System.out.println("------------------------");
		  Hamburger.Total();//calls method to total order
	}

}
