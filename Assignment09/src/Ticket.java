
public abstract class Ticket {
	private int Idnumber;
	
	public Ticket(int Idnumber) {
		this.Idnumber = Idnumber;
	}

	public abstract double getPrice();

	public String toString() {
		String printout = "Number: " + Idnumber + ", Price: " + getPrice();
		return printout;
	}

}
