import java.util.Scanner;
class AddIntegersInNumber{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the Integer Between 0 and 1000: ");
		int integer = sc.nextInt();

		int extracted = integer % 10;
		int sum = extracted;

		extracted = integer % 10;
		sum = sum + extracted;

		extracted = integer % 10;
		sum = sum + extracted;
		
		System.out.println("Sum of the Digits of Integer is: " + sum);

	}

}