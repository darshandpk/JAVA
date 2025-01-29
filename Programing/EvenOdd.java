import java.util.Scanner;

class EvenOdd{
	public static void main(String[]args){

		System.out.println("Enter the NUmber: ");
		int num = new Scanner(System.in).nextInt();
		
		//System.out.println(num/2 == num/2.0); // Logic for finding Even Number without the % operator

		System.out.println("Enter the Number: ");
		int num2 = new Scanner(System.in).nextInt();
		System.out.println((num/2)*2 == num);	// Second logic for Finding Even Number Without % operator	

	}

}