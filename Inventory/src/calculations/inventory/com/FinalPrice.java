/**
 *  This class stores the following information - 
 *  
 *  1. Total sales Tax 
 *  2. Total Amount to be payed by the customer.
 *  3. Individual Amount of each product inclusive of 20% Sales Tax
 *     excluding tax on medical items.
 * 
 */


package calculations.inventory.com;

public class FinalPrice {
	
	private double salesTax;              // total sales tax
	private double totalPayable;          // total bill Amount
	private double[] perItemCost;         // total amount for each item
	
	// Getter and Setter Functions for sales Tax
	
	public double getSalesTax() {
		return salesTax;
	}
	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}
	
	// Getter and Setter Functions for total bill amount
	public double getTotalPayable() {
		return totalPayable;
	}
	public void setTotalPayable(double totalPayable) {
		this.totalPayable = totalPayable;
	}
	
	// Getter and Setter Functions for each individual item including tax
	public double[] getPerItemCost() {
		return perItemCost;
	}
	public void setPerItemCost(double[] perItemCost) {
		this.perItemCost = perItemCost;
	}
	
	
}
