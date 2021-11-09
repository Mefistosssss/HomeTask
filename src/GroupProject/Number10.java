package GroupProject;

import java.util.Scanner;

public class Number10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String i=null;
		System.out.println("Please enter two strings");
		String w1=scan.next();
		String w2=scan.next();
		System.out.println("Please enter two int");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		if(w1.equals(w2) & n1==n2) {
			i="AND";
		}else if(w1.equals(w2) | n1==n2) {
			i="OR";
		}else {
			i="NONE";
		}
		
		System.out.println(i);
		}
		
		
	}


