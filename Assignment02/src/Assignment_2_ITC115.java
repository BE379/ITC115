
public class Assignment_2_ITC115 {

	public static void main(String[] args) {
			int a = 0;		// 2nd left int from the last int
			int b = 1;		// 1st left int from the last int
			int c = 0;		// variable to store the 'a' variable value
			for(int i = 0; i <= 11 ; i++) {
				System.out.print(a + b + " ");
				c = a;		// saving the value of the "a" variable for later
				a = a + b;  // changing the "a" variable
				b = c;		// moving the old "a" variable to b
		}
	}

}