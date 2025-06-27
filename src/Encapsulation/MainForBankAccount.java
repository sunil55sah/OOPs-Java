package Encapsulation;

/* BankAccount
Create a class BankAccount with private fields for account holder name and balance.
Add a constructor to initialize name and initial balance.
Create a deposit(double amount) method to increase balance.
Create a withdraw(double amount) method to decrease balance (with balance check).
Add a getBalance() method and a getAccountHolderName() method.
In Main, use Scanner to accept account details and perform deposit/withdraw.
*/
public class MainForBankAccount {
	// Entry point class for testing BankAccount functionality
	public static void main(String[] args) {

		// Creating a BankAccount object (an instance)
		// 'acc' is the reference variable pointing to the object in memory
		BankAccount acc = new BankAccount("Sunil", 1000.0);
		// OR, set the values using the setter methods it's your choice:
		// acc.setAccountHolderName("Sunil");
		// acc.setBalance(1000.0);

		// Encapsulation in action: we cannot directly do this:
		// acc.balance = 999999; ❌ Not allowed (balance is private)

		// Deposit ₹500 into the account using a method (safe, controlled)
		acc.deposit(500);

		// Withdraw ₹300 from the account (only if sufficient balance)
		acc.withdraw(300);

		// Output the final account details using getter methods
		System.out.println("Account Holder: " + acc.getAccountHolderName());
		System.out.println("Current Balance: ₹" + acc.getBalance());
	}
}
