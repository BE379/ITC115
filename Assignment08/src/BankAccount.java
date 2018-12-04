// Each BankAccount object represents one user's account
// information including name and balance of money.
import java.text.NumberFormat;

public class BankAccount {
	String name;
	double balance;
	double transactionFee = 0.00;
	
	public BankAccount(String name, double balance, double transactionFee) {
		this.name = name;
		this.balance = balance;
		this.transactionFee = transactionFee;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {	
		if (balance >= (amount + transactionFee)) {
			balance = balance - (amount + transactionFee);
			System.out.println(balance);
		}
		else {
			System.out.println("Not enough funds.");
			}
	}
	
	public String toString() {
		return name + ", " + NumberFormat.getCurrencyInstance().format(this.balance);
	}
}
