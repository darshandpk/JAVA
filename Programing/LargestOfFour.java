import java.util.Scanner;

class LargestOfFour{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the 1 Number: ");
		int a = sc.nextInt();

		System.out.println("Enter the 2 Number: ");
		int b = sc.nextInt();

		System.out.println("Enter the 3 Number: ");
		int c = sc.nextInt();

		System.out.println("Enter the 4 number: ");
		int d = sc.nextInt();

		int lar = (a>b)?((a>c)?((a>d)?(a):(d)):((c>b)?((c>d)?(c):(d)):((b>a)?((b>d)?(b):(d)):((a>c)?((a>d)?(a):(d)):(c))))):((b>c)?((b>d)?(b):(d)):(c));

		System.out.println("largest Number is: "+lar);		

	}

}