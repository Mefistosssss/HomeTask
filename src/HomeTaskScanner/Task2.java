package HomeTaskScanner;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  amount of loan ");
		
		int amount=scan.nextInt();
		if (amount<=200000) {
			System.out.println("Congratulations we will lend you money");
		}else {
			System.out.println("Unfortunately we cannot lend you money");
		}
		
	}

}
