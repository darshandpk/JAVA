import java.util.Scanner;
class SmallestOfThree{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1 number: ");
		int a = sc.nextInt();

		System.out.println("Enter the 2 Number: ");
		int b = sc.nextInt();

		System.out.println("Enter the 3 Number: ");
		int c = sc.nextInt();

		
		int small = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));

		System.out.println("Smallest of the Three Numbers is: "+ small);

	}

}