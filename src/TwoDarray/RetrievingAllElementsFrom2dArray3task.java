package TwoDarray;

public class RetrievingAllElementsFrom2dArray3task {

	public static void main(String[] args) {
		/* Create 2D array of cars : 
		 * american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */
			String [][] cars = {
					{"BMW","Mersedes","Volkswagen","Audi","Porsche"},
					{"Ford","Chevrolet","Jeep","GMC","Buick" },
					{"Genesis","Kia","Daewoo","Hyundai"},
					{"Ferrari","Maserati","Fiat","Alfa Romeo"}
			};
			int i=0;
			int j=0;
			for(i=0; i<cars.length;i++) {
				for(j=0; j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
				
				}
			}
			System.out.println();
			System.out.println("**********************************");
			for(String[]a:cars) {
				for(String b:a) {
					System.out.print(b+" ");
				}
			}
			
			
			
	}

}
