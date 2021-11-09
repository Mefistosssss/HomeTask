package loops;

import java.util.Scanner;

public class SumOddAndEvenNumbers {

	public static void main(String[] args) {
		/*  Write a program that reads a range of 
		*integers (start and end point), 
		*provided by a user and then from that range prints the 
		*sum of the even and odd integers.
		*/
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Write first number");
		int num1=scan.nextInt();
		System.out.println("Write second number");
		int num2=scan.nextInt();
		int even=0;
		int add=0;
		for(int a=num1; a<=num2; a++) {
			if (a%2==0) {
				even+=a;
			}
			else if(a%2==1) {
				
				add+=a;
			}
		}
		System.out.println("Total of even numbers ="+even);
		System.out.println("Total of add numbers ="+add);
	}

}
