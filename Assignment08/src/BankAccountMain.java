
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount p1 = new BankAccount("Bill Gates", 100, 5);
		
		p1.deposit(5);
		System.out.println(p1.balance);
		System.out.println(p1.toString());
		p1.withdraw(200);
		p1.withdraw(5);
	}

}
