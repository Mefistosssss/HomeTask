package Class14HomeTask;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?

		//String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] z = a.split(" ");
		a = "";
		for(int i = z.length - 1; i >= 0; i--) {
			a = a + z[i] + " ";
		}
		System.out.println(a);

	}
}

