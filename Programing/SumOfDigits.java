import java.util.Scanner;

class SumOfDigits{
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Interger: ");
		int num = sc.nextInt();

		int rem = num % 10;
		int sum = rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;
		
		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		System.out.println("Sum of the Integers in the Digit is: "+ sum);
	
	}


}