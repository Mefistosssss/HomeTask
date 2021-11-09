package TwoDarray;

public class groceryList2DArray {

	public static void main(String[] args) {
		/*  Using 2D array create a grocery list.
         *  Inside you should have an array of veggies, fruits, dairy and sweets. 
         *  Retrieve all values from that array using 2 different loops
		 */
		
		String [] [] gr= {
				{"Potato","Brocoly","Carrot","Onion"},
				{"Tomato","Apple","Peach","Mango"},
				{"Milk","Yougurt","kefir","Sour cream"},
				{"cookies","Twix","Snickers","Butterfinger"},
		};
		
		for (int i=0; i<gr.length; i++) {
			for(int j=0; j<gr[i].length; j++) {
				System.out.print(gr[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("*********************************************");
		for(String [] gr1 :gr) {
			for(String g:gr1) {
				System.out.print(g+" ");
			}
		}
		
	}

}
