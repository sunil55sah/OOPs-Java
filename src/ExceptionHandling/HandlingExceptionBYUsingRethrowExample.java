package ExceptionHandling;

/*
 * Summary of flow:
Program starts at main.

User enters withdraw amount.

withdraw method is called.

Inside withdraw:

If amount > balance → throws exception.

Else → prints success message.

If exception thrown:

It's caught inside withdraw, logged, then rethrown.

In main, the rethrown exception is caught and final message shown.

Scanner closed and program ends.
 */
import java.util.Scanner;

public class HandlingExceptionBYUsingRethrowExample {

	// Method to withdraw money from account
	// This method declares that it might throw an ArithmeticException to its caller
	public static void withdraw(int balance, int withdrawAmount) throws ArithmeticException {
		try {
			// Check if the withdrawal amount is greater than the current balance
			if (withdrawAmount > balance) {
				// Manually create and throw an ArithmeticException if funds are insufficient
				throw new ArithmeticException("Insufficient balance to withdraw " + withdrawAmount);
			} else {
				// If enough balance, print successful withdrawal message and remaining balance
				System.out.println("Withdrawal successful. Remaining balance: " + (balance - withdrawAmount));
			}
		} catch (ArithmeticException e) {
			// Partial handling: Log the error message here
			System.out.println("Logging error: " + e.getMessage());

			// Rethrow the same exception so that the caller method can also handle it
			throw e;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 5000; // Initial fixed balance in the account

		System.out.print("Enter amount to withdraw: ");
		int withdrawAmount = sc.nextInt(); // Read withdrawal amount from user input

		try {
			// Call the withdraw method which might throw ArithmeticException
			withdraw(balance, withdrawAmount);
		} catch (ArithmeticException e) {
			// Final handling of the exception thrown by withdraw()
			// Print a user-friendly transaction failed message with the exception message
			System.out.println("Transaction failed: " + e.getMessage());
		}

		sc.close(); // Close the Scanner resource to avoid resource leak
	}
}
