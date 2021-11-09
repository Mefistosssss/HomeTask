package HomeTaskScanner;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have credit card? Write y for yes and n for no ");
		String card=input.next();
		
		
		
		if(card.equalsIgnoreCase("y")) {
			System.out.println("Good news.What is the balance of the credit cart?");
			double balance=input.nextDouble();
			if(balance>1000) {
				System.out.println("You need to pay off immediately");
			}else  {
					System.out.println("You can spend more");
				}
			}
		
		
		if(card.equals("n")) {
			System.out.println("Bad news, but we have great offer credit card for you");
		}
	}

	

}
