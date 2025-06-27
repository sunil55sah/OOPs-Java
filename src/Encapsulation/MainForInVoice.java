package Encapsulation;

/*
 * Invoice
Create an Invoice class with private fields: amount (double) and paid (boolean).

Initialize via constructor and set paid to false by default.

Write a markAsPaid() method.

Write a getAmount() and isPaid() method.

In Main, use Scanner to take amount and mark it as paid based on user input. Print final invoice details.
 */
import java.util.Scanner;

public class MainForInVoice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ask user to enter the invoice amount
		System.out.print("Enter invoice amount: ");
		double amount = sc.nextDouble();

		// Create an Invoice object with the entered amount
		Invoice invoice = new Invoice(amount);

		// Ask if the invoice is paid or not
		System.out.print("Is the invoice paid? (yes/no): ");
		sc.nextLine(); // consume leftover newline
		String paidInput = sc.nextLine();

		// If user says "yes", mark the invoice as paid
		if (paidInput.equalsIgnoreCase("yes")) {
			invoice.markAsPaid();
		}

		// Display the invoice details
		System.out.println("\n--- Invoice Details ---");
		System.out.println("Amount: ₹" + invoice.getAmount());
		System.out.println("Paid: " + (invoice.isPaid() ? "Yes" : "No"));

		sc.close(); // Close the Scanner
	}
}
