package Encapsulation;

//This class represents a simple bank account with basic features.
public class BankAccount {

	// Fields are marked private to implement Encapsulation
	// This means they can't be accessed directly from outside the class
	private String accountHolderName;
	private double balance;

	// Constructor: runs automatically when an object is created
	// Initializes the object with provided values
	public BankAccount(String accountHolderName, double initialBalance) {
		// 'this' keyword refers to the current object’s field
		// Without 'this', Java uses the constructor parameter (which has the same name)
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
		/*
		 * Left side this.accountHolderName → refers to the field of the current object
		 * or refers to the instance variable.
		 * 
		 * Right side accountHolderName → refers to the parameter variable passed to the
		 * constructor.
		 */

	}

	// Getter method for accountHolderName
	// Allows safe read-only access from outside
	public String getAccountHolderName() {
		return accountHolderName;
	}

	// Setter method for accountHolderName
	// Allows controlled modification of the name
	public void setAccountHolderName(String name) {
		this.accountHolderName = name;
	}

	// Getter method for balance
	// Provides read-only access to balance
	public double getBalance() {
		return balance;
	}

	// Method to deposit money into the account
	// Encapsulates validation logic: only positive amounts are allowed
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount; // Increase balance
		}
	}

	// Method to withdraw money from the account
	// Ensures withdrawal only if balance is sufficient
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount; // Decrease balance
		}
	}
}
