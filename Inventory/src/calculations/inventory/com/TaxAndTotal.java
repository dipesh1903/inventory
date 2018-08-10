/**
 *  The method bill calculates
 *  1. Total sales tax
 *  2. Total Amount Payable
 *  3. Final price of each individual product including 20% tax
 *     excluding tax for medical item.
 *  
 *  
 *  For exclusion of medical product from taxes Regex function is used 
 *  to exclude product which includes terms like pills or Syrup or tablets
 *  
 *  The calculated values are stored in FinalPrice object. 
 *  
 *  The bill function then  returns an ArrayList of FinalPrice objects.
 *     
 *  
 *  For exclusion of medical product from taxes Regex function is used 
 *  to exclude product which includes terms like pills or Syrup or tablets
 *  
 * 
 */

package calculations.inventory.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import data.inventory.com.shoppingList;

public class TaxAndTotal {
	
	public ArrayList<FinalPrice> bill (ArrayList<shoppingList> list) {
		
		//  
		
		ArrayList<FinalPrice> fp = new ArrayList<FinalPrice>();
		FinalPrice bills = new FinalPrice();	
		Iterator<shoppingList> itr = list.iterator();
		
		// Regex function to seperate out medical  products
		// based on pills, syrup, tablet
		
		Pattern pills = Pattern.compile("pill*", Pattern.CASE_INSENSITIVE);
		Pattern syrup = Pattern.compile("syrup", Pattern.CASE_INSENSITIVE);
		Pattern tablets = Pattern.compile("tablet*", Pattern.CASE_INSENSITIVE);
		
		// Declaration of local variables
		
		double totalTax = 0.0;                          // total tax payable
	    double meds_total = 0.0;
	    double total = 0.0;                             // total amount payable
		double tax = 0.0;
		double total_per_item = 0.0;
		double finalCost = 0.0;
		double[] finalCosts = new double[list.size()];   // stores individual product final price
		int i=0;
		
		while(itr.hasNext()) {
			shoppingList lists = (shoppingList)itr.next();
			
			// The Matcher matches for medical related items
			Matcher pill = pills.matcher(lists.item);
			Matcher syrp = syrup.matcher(lists.item);
			Matcher tab = tablets.matcher(lists.item);
			
			total_per_item = (lists.quantity * lists.price);
			
			// separation of medical and non-medical products
			// for the calculation of final price of each product
			
			if(pill.find() || syrp.find() || tab.find()) {
				finalCosts[i++] = total_per_item;
				meds_total += total_per_item;
				total+= meds_total;
			} 
			
			// calculation of total tax , amount payable 
			// and price of non-medical items after the taxes
			
			else {
				tax  = 0.2 * total_per_item;
				finalCost = tax + total_per_item;
			    totalTax += tax;
		        total += finalCost;
		        finalCosts[i++] = finalCost;
			}
			
			
		}
		
		// calling setter functions of FinalPrice class 
		
		bills.setSalesTax(totalTax);
		bills.setTotalPayable(total);
		bills.setPerItemCost(finalCosts);
		
		// Adding the object to an arrayList
		fp.add(bills);
		
		//return ArrayList
		return fp;
		
   }
	
}
