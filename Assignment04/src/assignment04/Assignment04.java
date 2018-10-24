package assignment04;

import java.util.*;

//asks for two integers representing a month and day and tells user
//what the season will be for that date

public class Assignment04 {

	public static void main(String[] args) {

		giveIntro();
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month = console.nextInt();
		System.out.print("Enter the day: ");
		int day = console.nextInt();
		System.out.println(seasons(month, day) + " season.");

	}

	// introduces the program to the user
	private static void giveIntro() {
		System.out.println("This program will ask for a month and day then");
		System.out.println("it will tell you what the season for that date.");
		System.out.println();
	}

	// prompts for a month
	public static int getMonth(Scanner console) {
		System.out.print("Enter the month: ");
		int month = console.nextInt();
		return month;
	}

	// prompts for a day
	public static int getDay(Scanner console) {
		System.out.print("Enter the day: ");
		int day = console.nextInt();
		return day;
	}

	// identifying the season
	public static String seasons(int month, int day) {
		String seas;
		if (month < 3 || (month == 3 && day <= 15)) {
			seas = "Winter";
		} else if (month < 6 || (month == 6 && day <= 15)) {
			seas = "Spring";
		} else if (month < 9 || (month == 9 && day <= 15)) {
			seas = "Summer";
		} else if (month < 12 || (month == 12 && day <= 15)) {
			seas = "Fall";
		} else {
			seas = "Winter";
		}
		return seas;
	}
}
