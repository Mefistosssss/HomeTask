package class13;

public class Sunday {
	public static void main(String[] args) {
	// Create a String and print it in reverse order (Sunday -} yadnuS).

	String x="Sunday";
	String result = "";
	for(int i = x.length() - 1; i >= 0 ; i--) {
		result = result + x.charAt(i);
	}
	System.out.println(result);
	
	
}

}
