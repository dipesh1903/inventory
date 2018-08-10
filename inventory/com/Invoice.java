package invoice.inventory.com;
import java.util.*;

import calculations.inventory.com.PrintView;
import calculations.inventory.com.TaxAndTotal;
import data.inventory.com.CartItems;
import data.inventory.com.shoppingList;

public class Invoice {

	public static void main(String[] args) {
		
		double[] bill;
		CartItems cart = new CartItems();
		ArrayList<shoppingList> shopList = new ArrayList<shoppingList>();
		
		shopList = cart.cartItem();
		bill = TaxAndTotal.bill(shopList);
		PrintView.printing(shopList, bill);
		
	}

}
