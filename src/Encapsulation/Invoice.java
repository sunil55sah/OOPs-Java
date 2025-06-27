package Encapsulation;

//Invoice.java

//This class represents an Invoice with an amount and paid status.
public class Invoice {

	// Private fields to protect data (Encapsulation)
	private double amount; // The total amount of the invoice
	private boolean paid; // Whether the invoice has been paid or not

	// Constructor: initializes the invoice with the given amount
	// and sets paid status to false (unpaid) by default
	public Invoice(double amount) {
		this.amount = amount; // Assign the amount
		this.paid = false; // Initially, the invoice is unpaid
	}

	// Method to mark the invoice as paid
	public void markAsPaid() {
		this.paid = true; // Change paid status to true
	}

	// Getter to check if the invoice is paid
	public boolean isPaid() {
		return paid; // Returns current paid status (true/false)
	}

	// Getter to get the amount of the invoice
	public double getAmount() {
		return amount; // Returns the invoice amount
	}
}
