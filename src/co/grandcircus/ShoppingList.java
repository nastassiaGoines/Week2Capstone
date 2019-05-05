package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> itemName = listOfNames();
		ArrayList<Double> itemPrice = listOfPrice();

//		String itemName = Validation.getString(scnr, "Enter what you need from the grocercy store.");
//		System.out.println(itemName);
//		String str =getString(scnr, prompt)
//		if(itemName.get(i)) {
		// find validator method get string in day 6 demo
//		}
//		printMenu(itemName, itemPrice);
//		List<String> name = listOfNames();
	}

	public static ArrayList<Double> listOfPrice() {
		ArrayList<Double> itemPrice = new ArrayList<>();
		itemPrice.add(2.50);
		itemPrice.add(1.99);
		itemPrice.add(2.89);
		itemPrice.add(2.89);
		itemPrice.add(3.99);
		itemPrice.add(8.99);
		itemPrice.add(2.05);
		itemPrice.add(3.89);

		return itemPrice;
	}

	public static ArrayList<String> listOfNames() {
		ArrayList<String> itemName = new ArrayList<>();

		itemName.add("corn");
		itemName.add("kale");
		itemName.add("bread");
		itemName.add("bananas");
		itemName.add("watermelon");
		itemName.add("turkey");
		itemName.add("spinach");
		itemName.add("squash");

		return itemName;
	}

	public static void printMenu(ArrayList<String> itemName, ArrayList<Double> itemPrice) {
		for (int i = 0; i < itemName.size(); i++) {
			System.out.println(itemName.get(i));
		}
		for (int i = 0; i < itemPrice.size(); i++) {
			System.out.println(itemPrice.get(i));

		}

	}

	public static String getString(Scanner scnr, String "Enter what you need from the grocery store.") {
		System.out.print(prompt);
		String itemName = scnr.next(); // read user entry
//		if(itemName){
		scnr.nextLine(); // discard any other data entered on the line
		return itemName;
	}
	
}
