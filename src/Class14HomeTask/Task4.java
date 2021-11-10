package Class14HomeTask;

public class Task4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		
		String a="Is it saturday? Is it raining?Do we have a Java Class today?";
		
		String reverse="";
		
		for(int i=a.length()-1;i>=0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse);
	}

}
