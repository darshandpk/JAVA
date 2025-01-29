import java.util.Scanner;

class Printhi{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		String op = ((num % 2 == 0) && (num % 5 == 0))?("HiTwoHiFive"):((num % 2 == 0)?("HiTwo"):((num % 5 == 0)?("HiFive"):("")));

		System.out.println(op);

	}


}