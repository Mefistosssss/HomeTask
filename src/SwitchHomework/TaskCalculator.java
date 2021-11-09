package SwitchHomework;

import java.util.Scanner;

public class TaskCalculator {

	public static void main(String[] args) {
		// Using scanner class create calculator
		// Allow user to enter 2 numbers and operator
		// Based on operator provide the result to user.bettere use double!!!!
		int num4=0;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Write first number");
		int num= scan.nextInt();
		
		System.out.println("Write action");
		
		char num1=scan.next().charAt(0);
		
		System.out.println("Write second number");
		int num2=scan.nextInt();
		
		switch(num1) {
		case'+':
		num4=num+num2;
				break;
		case'-':
		num4=num-+num2;
				break;
		case'/':
			if(num2!=0) {
				num4=num/num2;
			}
			else {System.out.println("Cannot devide by 0");}
				break;
		case'*':
		num4=num*num2;
				break;
		}
		
		System.out.println("your answer is "+num4);
		scan.close();
	}

}
