package HomeTaskScanner;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/* 6. Write a program to ask user to enter numbers of worked years and annual salary.
		*If user worked for more or equals to 5 years than user is eligible for the bonus,
		*otherwise he is not. Once user is eligible and salary 
		*is larger than 50000 than bonus = 5000, otherwise bonus=3000
		*/
		Scanner input=new Scanner(System.in);
		System.out.println("How many years are you working in this company?");
		int years=input.nextInt();
		System.out.println("What is your annual salary?");
		int salary=input.nextInt();
		if(years>=5) {
			System.out.println(" You eligible for the bonus");
		 if(salary>=50000) {
			 System.out.println("your bonus = 5000");
		 }else {
			 System.out.println("your bonus = 3000");
		 }
		}else 
			System.out.println("not bonus for you");
		
		
	}

}
