import java.util.Scanner;

class ProductOfDigits{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		int product = 1;

		int rem = num % 10;
		product = product * rem;

		num = num /10;
		rem = num % 10;
		product = product * rem;

		num = num / 10;
		rem = num % 10;
		product = product * rem;

		num = num /10;
		rem = num % 10;
		product = product * rem;

		System.out.println("Product of the Digits in the Number Entered is : "+ product);

	}

}