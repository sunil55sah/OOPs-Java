package Synchronization;

import java.util.Scanner; // For taking user input

// Class representing a bank account
class BankAccount {
	int balance = 1000; // Initial account balance

	// 🔒 Synchronized method to make withdraw operation thread-safe
	synchronized void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);

			// Simulating delay to better observe synchronization
			try {
				Thread.sleep(1000); // Delay to simulate processing time
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Deduct amount after delay
			balance -= amount;
			System.out.println("Remaining balance: " + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
		}
	}
}

public class SynchronizationusingSynchronizedMethodInBankAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner to take input from user

		// Create a shared BankAccount object
		BankAccount account = new BankAccount();

		// 🔽 Take withdrawal input for two users
		System.out.print("Enter amount for User1 to withdraw: ");
		int user1Amount = scanner.nextInt();

		System.out.print("Enter amount for User2 to withdraw: ");
		int user2Amount = scanner.nextInt();

		// 🧵 Create threads for each user attempting to withdraw
		Thread t1 = new Thread(() -> account.withdraw(user1Amount), "User1");
		Thread t2 = new Thread(() -> account.withdraw(user2Amount), "User2");

		// ▶️ Start the threads
		t1.start();
		t2.start();

		// 🧼 Close the scanner to avoid resource leaks
		scanner.close();
	}
}
