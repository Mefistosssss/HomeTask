package Class14HomeTask;

public class Task6 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?

		String a="No lemon,no melon.";
		String b = "";
		for(int i = a.length() - 1; i >= 0 ; i--) {
			b = b + a.charAt(i);
		}
		b=(b.replaceAll("[, .]","").toLowerCase());
		
		a=(a.replaceAll("[. ,]","").toLowerCase());
		if(a.equals(b)) {
			System.out.println("the sentence is palindrome");
		}else {
			System.out.println("the sentence is not palindrome");
		}
	}

	}
	