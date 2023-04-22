package main;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<String> inventory;

//	Inventory getter
	public ArrayList<String> displayInventory() {

		return inventory;

	}

//    Inventory Setter for adding item
	public void addInventoryItem(ArrayList<String> inventory) {
		this.inventory = inventory;
	}

//    Inventory setter for removing item
	public void removeInventoryItem(String item) {
		if (inventory != null) {
			inventory.remove(item);
		}
	}

	public String useInventoryItem(String item) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i) == item) {
				return inventory.get(i);
			}
		}

		return null;

	}

}