import java.io.*;

public class Assignment06 {

	public static void main(String[] args) {
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		double[] test1 = {2, 4, 6, 7, 50};
		
		if(isSorted(list1))
			System.out.println("list1 is sorted.");
		else
			System.out.println("list1 is unsorted.");
		
		if(isSorted(list2))
			System.out.println("list2 is sorted.");
		else
			System.out.println("list2 is unsorted.");
		
		if(isSorted(test1))
			System.out.println("test1 is sorted.");
		else
			System.out.println("test1 is unsorted.");
	}
	
	public static boolean isSorted(double [] list) {
		for(int i=0; i < list.length -1; i++) {
			if (list[i+1] < list[i]) {
				return false;
			}
		}
		return true;
	}
}
