/**
 *  Actual Displaying of out final data which includes individual item cost,
 *  Total sales tax and total payable amount
 * 
 */

package display.inventory.com;

import java.util.*;

import calculations.inventory.com.FinalPrice;
import data.inventory.com.shoppingList;

public class PrintView {
	
	public static void printing (ArrayList<shoppingList> list, ArrayList<FinalPrice> bill) {
		
		
		Iterator<shoppingList> lists =  list.iterator();
		Iterator<FinalPrice> bills =  bill.iterator();
		FinalPrice values = bills.next();
		double[] bil = values.getPerItemCost();
		int i=0;
		
		if(list.size() == 1)
			System.out.println("Error Message");
		else {
		while (lists.hasNext()) {
			shoppingList items = lists.next();
			
			// prints final price of each product
			System.out.println (items.quantity + " " + items.item + ": " + bil[i++]);
			
		}
		// Prints total taxes and total payable amount
			System.out.println("Sales Taxes: " + values.getSalesTax());
			System.out.println("Total: " + values.getTotalPayable());
			
		}
	}
}
