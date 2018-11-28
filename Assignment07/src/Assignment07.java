
public class Assignment07 {

	public static void main(String[] args) {
		Product applejuice = new Product("applejuice", "001", "Apple Juice", 2.50, 5);
		
		Product eggs = new Product("eggs      ", "002", "Eggs", 2.00, 10);
		
		System.out.println(applejuice);
		System.out.println(eggs);
		
		eggs.setprice(3.00);
		
		System.out.println(eggs);
		
	}	

}
