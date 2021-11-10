package Class14HomeTask;

public class Task2 {

	public static void main(String[] args) {
		 /* Create a String that should be combination of letters, 
	     numbers and special characters. 
	     Find out how many alpha characters are there in the String.*/
	     String str="aasdjiasdj123128985123asd1!#@!%$(!@$!@&";

	     int c=0;
	     for(int i=0; i<str.length(); i++) {
	    	 if(Character.isLetter(str.charAt(i)))
	    		 c++;
	     }
	     System.out.println(c);
	}
		
}
