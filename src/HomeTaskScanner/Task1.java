package HomeTaskScanner;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number");
		
		double number1=input.nextDouble();
	
		System.out.println("Please enter second number");
		double number2=input.nextDouble();
		
		if (number1>number2) { 
			System.out.println(number1+ " number one biger than number two "+ number2);
		}
		if (number2>number1) {
			System.out.println(number2+ " number two biger than number one "+ number1);
		}
		if (number2==number1){
			System.out.println(number1+ " number one is equal to number two "+ number2);
		}
	}

}
