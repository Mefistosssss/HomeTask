package Class14HomeTask;

public class Task3 {

	public static void main(String[] args) {
		/* You have a String a=”Is it saturday? Is it raining? 
		  Do we have a Java Class today?” How would you 
				find out how many sentences are in that String?*/
		String a="Is it saturday? Is it raining?Do we have a Java Class today?";
		int i=0;
		String [] aArr=a.split("[?]");
		for(String s:aArr) {
			i++;
		}
			System.out.println("Number of sentence is "+i);
			
	}

}
