
public class WalkupTicket extends Ticket {

	private double price = 50.00;
	public WalkupTicket(int Idnumber) {
		super(Idnumber);
		
	}

	@Override
	public double getPrice() {
		return price;
	}
	
}
