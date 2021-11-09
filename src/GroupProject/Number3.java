package GroupProject;

public class Number3 {

	public static void main(String[] args) {
		/*  Create a 2D array of integers. 
		 *  Develop a program which will calculate 
		 *	the sum of  even and odd numbers for that array.
		 */

		int [][]num = {
				{10,15,20,22,25},
				{20,1,2,13,10,7},
				{11,8,5,22,43,11},
				{1,2,3,4,5,6,7,8},
		};
		int sumadd=0;
		int sumeven=0;
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length; j++) {
				if(num[i][j]%2==0) {
				
					 sumeven+=num[i][j];
					
				}else if(num[i][j]%2==1) {
				
					sumadd+=num[i][j];
				}
			}
		}
		System.out.println("It`s sum of all even numbers in 2d array --> "+sumeven);
			System.out.println("It`s sum of all add numbers in 2d array --> "+sumadd);		
	}	
}
	


