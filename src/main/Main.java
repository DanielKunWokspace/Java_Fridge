package main;

import programming.Fridge;
import programming.ItemToFridge;

public class Main {

	public static void main(String[] args) {
		ItemToFridge cheese = new ItemToFridge("Cheese", 05, 03, 2015);
		ItemToFridge milk = new ItemToFridge("Milk", 15, 02, 2016);
		ItemToFridge meat = new ItemToFridge("Meat", 25, 01, 2017);
		ItemToFridge fat = new ItemToFridge("Fat", 05, 11, 2019);

		Fridge myFridge = new Fridge();
		myFridge.addItemToFridge(fat);
		myFridge.addItemToFridge(milk);
		myFridge.addItemToFridge(cheese);
		myFridge.addItemToFridge(meat);

		myFridge.getContentOfTheFridge();

		System.out.println();

		myFridge.setExpDate(25, 01, 2017);

		System.out.println();
	}

}
