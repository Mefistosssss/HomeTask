package Class14HomeTask;

public class Task7 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
			String a= "Bob";
			String b= "Garry";
			System.out.println("a="+a+" b="+b);
			a=a+b; // bobgarry
			b=a.substring(0, a.length()-b.length()); //bob
		    a=a.substring(b.length()); //Garry
		    System.out.println("a="+a+" b="+b);
	
	}

}
