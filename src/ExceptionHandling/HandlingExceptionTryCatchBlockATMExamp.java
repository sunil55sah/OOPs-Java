package ExceptionHandling;

/*
 * Real-World Scenario: ATM Withdrawal System
 Imagine you're building a simple ATM system where a user tries to withdraw money. 
 If the balance is less than the withdrawal amount, it should not crash — instead, 
 it should handle the exception and inform the user.
 */
import java.util.Scanner;

public class HandlingExceptionTryCatchBlockATMExamp {

	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner sc = new Scanner(System.in);

		// Initialize account balance
		int balance = 5000;

		// Ask user how much money they want to withdraw
		System.out.print("Enter amount to withdraw: ");
		int withdrawAmount = sc.nextInt(); // Read the amount entered by user

		try {
			// 🔍 Check if withdrawal amount is more than available balance
			if (withdrawAmount > balance) {
				// ❌ If yes, throw an exception with a custom error message
				throw new ArithmeticException("Insufficient balance!");
			}

			// ✅ If balance is sufficient, deduct the amount
			balance -= withdrawAmount;
			System.out.println("Withdrawal successful.");
			System.out.println("Remaining Balance: ₹" + balance);

		} catch (ArithmeticException e) {
			// 🧯 Catch block handles the exception thrown above
			// Print custom message using e.getMessage()
			System.out.println("Transaction failed: " + e.getMessage());
		}

		// Final message that runs whether exception occurred or not
		System.out.println("Thank you for using ATM.");

		// Close the scanner to prevent resource leak
		sc.close();
	}
}