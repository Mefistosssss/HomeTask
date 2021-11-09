package class13;

public class Task2 {

	public static void main(String[] args) {
		/*Create a String and if the String is not empty perform 
		the following: if the String has an odd number of characters 
		and has 3 or more characters, print the character in the 
		middle of the String.  */

		String main="Bika";
		
		 if(!main.isEmpty()) {
			 if(main.length()>=3 && main.length()%2==1) {
				
				System.out.println(main.charAt(main.length() / 2));
			 }else {
				 System.out.println("Cannot be even or contain less than 3 characters");
			 }
		 }else {
			 System.out.println("Cannot be empty");
		 }
		
		
	}

}
