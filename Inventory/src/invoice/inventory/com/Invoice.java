/**
 *  Here we perform our main operation of creating cart items and calling necessary 
 *  packages to implement our invoice.
 * 
 * 
 */

package invoice.inventory.com;
import java.util.*;

import calculations.inventory.com.FinalPrice;
import display.inventory.com.PrintView;
import calculations.inventory.com.TaxAndTotal;
import data.inventory.com.CartItems;
import data.inventory.com.shoppingList;

public class Invoice {

	public static void main(String[] args) {
		
		CartItems cart = new CartItems();
		ArrayList<shoppingList> shopList = new ArrayList<shoppingList>();
		TaxAndTotal calculation = new TaxAndTotal();
		ArrayList<FinalPrice> bill = new ArrayList<FinalPrice>();
		 
		// get cart item
		shopList = cart.cartItem();
		
		// calculating taxes , amount payable
		bill = calculation.bill(shopList);
		
		// Displayijng the final invoice
		PrintView.printing(shopList, bill);
			
	}

}
