package ExceptionHandling;

/*
 * Real Life Analogy:
Imagine a bank employee (method) finds an error in the transaction,
 but instead of solving it himself, he passes the problem to the manager (caller).
  The manager then handles it and informs the customer.
That's ducking — not solving it yourself but passing it to someone else to handle.
 */
import java.util.Scanner;

public class HandlingExceptionBYUsingDuckingExceptionExample {

	// Method to withdraw money
	// This method may throw ArithmeticException (ducking the exception)
	public static void withdraw(int balance, int withdrawAmount) throws ArithmeticException {
		// Check if user is trying to withdraw more than available balance
		if (withdrawAmount > balance) {
			// If yes, throw an ArithmeticException with a message
			throw new ArithmeticException("Insufficient balance to withdraw " + withdrawAmount);
		} else {
			// If amount is within balance, complete the transaction
			System.out.println("Withdrawal successful. Remaining balance: " + (balance - withdrawAmount));
		}
	}

	// Main method where execution begins
	public static void main(String[] args) {
		// Create Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Initial account balance
		int balance = 5000;

		// Ask user for amount to withdraw
		System.out.print("Enter amount to withdraw: ");
		int withdrawAmount = sc.nextInt();

		try {
			// Call the withdraw method
			// Since it may throw an exception, we handle it here
			withdraw(balance, withdrawAmount);
		} catch (ArithmeticException e) {
			// Catch and handle the ducked exception here
			System.out.println("Transaction failed: " + e.getMessage());
		}

		// Close scanner resource
		sc.close();
	}
}
