package TwoDarray;

public class RetrievingAllElementsFrom2dArray2task {

	public static void main(String[] args) {
		/* Create a 2D array in which first array will consist of 4 names 
		 * and second array will contain grades. 
		 * Then your program should print name of the 
		 * students that has A and B grade
		 */

		String [][] n = {
				{"Mike","Bob","Eric","Tomas"},
				{" A"," B"},
		};
		System.out.println(n[0][0]+n[1][0]);
		System.out.println(n[0][1]+n[1][1]);
		System.out.println(n[0][2]+n[1][1]);
		System.out.println(n[0][3]+n[1][0]);
	}

}
