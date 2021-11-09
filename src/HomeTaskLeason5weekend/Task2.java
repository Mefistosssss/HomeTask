package HomeTaskLeason5weekend;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 *  Write a program that will read three inputs of scores 
		 *  (quiz, mid term, and final scores) and determine the grade 
		 *  based on the following rules:
		 */
			Scanner input= new Scanner(System.in);
			System.out.println("Write your Quiz Scores ");
			int n1=input.nextInt();
			System.out.println("Write your Mid Term Scores ");
			int n2=input.nextInt();
			System.out.println("Write your Final Scores ");
			int n3=input.nextInt();
			
			int num=(n1+n2+n3)/3;
	
			String score;
			
			if (num>=90)  score="A";
			else if(num>=70 && num<90) 	score="B";
			else if(num>=50 && num<70) score="C";
			else score="F";
			System.out.println("Your grade is "+score);
	}

}
