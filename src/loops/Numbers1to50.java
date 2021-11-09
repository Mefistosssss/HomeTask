package loops;

public class Numbers1to50 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3

		for (int a=1; a<=50; a++) {
			if(a%3!=0) {
				System.out.println(a);
			}
			
		}
	}

}
