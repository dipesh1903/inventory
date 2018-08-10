/**
 *  This class creates an object much like the Cart feature of flipkart
 *  which stores all purchase information of buyer in an array.
 *
 *  Stores objects of shoppingList class and return an ArrayList
 */

package data.inventory.com;
import java.util.*;
public class CartItems {
	
	// storing cart items 
	ArrayList<shoppingList> CartItems = new ArrayList<shoppingList>();
	
	// function to return cart
	// 
	public ArrayList<shoppingList> cartItem() {
		// creating shopping List  by quantity , price , item name
	shoppingList item1 = new shoppingList(1, 20.00, "bottle of wine");
	shoppingList item2 = new shoppingList(2, 4.00, "box of headache pills");
	shoppingList item3 = new shoppingList(1, 10, "box of pens");
	
	CartItems.add(item1);
	CartItems.add(item2);
	CartItems.add(item3);
	return CartItems;
	
	}
	
}