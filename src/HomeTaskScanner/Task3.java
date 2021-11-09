package HomeTaskScanner;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Write costumer age");
		
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("Congratulations we can provide DL");
		}else {
			System.out.println("Unfortunately we cannot provide DL");
		}
		
	}

}
