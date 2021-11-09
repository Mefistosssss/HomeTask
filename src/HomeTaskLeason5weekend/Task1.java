package HomeTaskLeason5weekend;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*	Write a program for user to enter his/hers birth months.
		 * 	Based on the month define the season.
		 *	Example: if user is born in June, July or August  season =“Summer”.
		 *  At the end of the program we should see output as “You were
		 *   born is season __
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please write birth months");
		String month = in.next();
		
		String season;
		if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("february") || month.equalsIgnoreCase("december"))
			season="Winter";
			else if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may"))
			season="Spring"; 
			else if  (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("jule") || month.equalsIgnoreCase("august"))
			season="Summer";
			else if (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("november"))
			season="Autumn";
		
			else season ="invalid";
		System.out.println("You were born is season "+season);
		
		
	}

}
