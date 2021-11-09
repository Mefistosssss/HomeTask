package GroupProject;

public class number10onedarraY {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		int temp;
		int [] num = {10,15,20,22,25,40,32};
		
		for (int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
						temp = num[i];
						num[i] = num [j];
		                num [j] = temp;
				}
			}
	
		}
		System.out.println("Second large number is "+num[num.length-2]);
		
	}
}