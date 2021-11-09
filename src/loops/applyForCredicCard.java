package loops;

import java.util.Scanner;

public class applyForCredicCard {

	public static void main(String[] args) {
		// Create a program that will keep asking user to apply for a credit card. 
		// As soon you get “yes” from a user program should stop asking.
		
		
		Scanner scan=new Scanner(System.in);
		boolean A=true;
		
		while(A) {
			System.out.println("Please apply for credic card");
			String B=scan.next();
			if(B.equalsIgnoreCase("yes")) {
				System.out.println("Please fill up the form");
				break;
			}
			
		}
			
			
		
		
	}

}
