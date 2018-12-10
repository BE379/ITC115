
public class TicketMain {

	public static void main(String[] args) {
		WalkupTicket t1 = new WalkupTicket(1);
		AdvanceTicket t2 = new AdvanceTicket(2, 20);
		AdvanceTicket t3 = new AdvanceTicket(3, 2);
		StudentAdvanceTicket t4 = new StudentAdvanceTicket(4, 20);
		StudentAdvanceTicket t5 = new StudentAdvanceTicket(5, 2);
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		

	}

}
