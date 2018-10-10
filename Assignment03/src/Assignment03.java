
public class Assignment03 {

	public static void main(String[] args) {
		printPowersOfN(2, 7);
		printPowersOfN(5, 3);
	}
	
	public static void printPowersOfN(int number, int position) {
		System.out.print("1 ");
		for (int i = 1; i <= position; i++) {
			System.out.print((int)Math.pow(number, i) + " ");
			
		}
		System.out.println();
		
	}

}
