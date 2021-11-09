package class13;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		/* Write a program that reads two people's first
		names and if they expecting boy or girl? 
				Based on the input suggests a name for a baby:
				Example Output:
				Mom’s first name? Mary
				Dad’s first name? Dan iel
				Boy or Girl? boy
				Suggested baby name: DANRY
				Example Output:
				Mom’s first name? Ma ry
				Dad’s first name? Dan iel
				Boy or Girl? girl
				Suggested baby name: MA IEL */

		Scanner scan = new Scanner(System.in);
		System.out.println("write father name,next mother name, next gender");
		String Fn=scan.next();
		String Mn=scan.next();
		String gender=scan.next();
		String result=null;
		
		
		if (gender.equalsIgnoreCase("boy")) {
			result=Fn.substring(0,3)+Mn.subSequence(Mn.length()-2, Mn.length());
		}else if(gender.equalsIgnoreCase("girl")){
			result=Mn.substring(0,2)+Fn.subSequence(Fn.length()-3, Fn.length());
		}else {
			result="Wrong gender";
		}
		System.out.println(result);
	}

}
