package HomeTaskScanner;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Pleace enter your City");
		String name=scan.next();	//it will capture String value from console

		
		System.out.println("Pleace enter your tempetature");
		int temp=scan.nextInt();
		
		
		temp=(int) ((temp-32)*0.5556);
		System.out.println("The temperature is the city "+name+" is "+temp);
	}

}
