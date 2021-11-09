package lessonClass2;

public class StringConcatenationArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=3.9;
		double num2=num1*num1;
				System.out.println("The square of the "+num1+ " is " +num2);
				System.out.println("***********************************");
				
		int n1=50;
		n1+=100;
		System.out.println(n1);
		n1-=67;
		System.out.println(n1);
		System.out.println("***********************************");
		
		double cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		int cakePiece1=25;
		int people=7;
		
		System.out.println("each person get "+cakePiece1/people);
		//System.out.println(people%cakePiece1);
		cakePiece1%=7;
		System.out.println("pieces left " +cakePiece1);
	}

}
