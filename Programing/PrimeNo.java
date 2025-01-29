import java.util.Scanner;

class PrimeNo{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a Number: ");	
		int num = sc.nextInt();
		//1 is not a prime number.
		System.out.println((num == 2 || num == 3 || num == 5)?(num+"is Prime"):((num % 2 == 0 || num % 3 == 0 || num % 5 == 0)?(num+ "is not Prime Num"):(num+ "is Prime")));

	}

}