package Abstraction;
/*
 * An interface in Java is a blueprint (or contract)
 *  that contains method declarations (without implementations).
It is used to specify what a class must do, but not how it does it.
 */

//Interface that defines a contract for payment methods

interface Payment {

	// Abstract method - every payment method must implement this
	// ✅ This hides the internal payment process from the user
	void pay(double amount);
}

//Implementation of Payment using Credit Card
class CreditCardPayment implements Payment {

	// ✅ We override the pay() method to provide specific logic for credit card
	// payments
	@Override
	public void pay(double amount) {
		// Internal credit card processing logic (HIDDEN from user)
		System.out.println("Paid ₹" + amount + " using Credit Card.");
	}
}

//Another implementation of Payment using UPI
class UpiPayment implements Payment {

	// ✅ We override the pay() method to provide specific logic for UPI payments
	@Override
	public void pay(double amount) {
		// Internal UPI processing logic (HIDDEN from user)
		System.out.println("Paid ₹" + amount + " using UPI.");
	}
}

//Main class to test the interface-based abstraction
public class MainPaymentSystemAchieveByUsinginterface {
	public static void main(String[] args) {

		// ✅ Abstraction: Interface reference, concrete object
		Payment payment1 = new CreditCardPayment(); // User wants to pay via credit card
		payment1.pay(500.0); // User just calls pay() — no idea what happens behind the scenes

		Payment payment2 = new UpiPayment(); // User switches to UPI payment
		payment2.pay(300.0); // Again, user just calls pay(), logic is hidden
	}
}
