import java.util.Scanner;

class EvenAndOddSumFromInt{
		public static void main(String[]args){

			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the Number: ");
			int num = sc.nextInt();

			int evensum = 0;
			int oddsum = 0;

			int rem = num % 10;
			int temp = (rem%2 == 0)?((evensum = evensum+rem)):(oddsum = oddsum + rem);
			
			num = num/10;
			rem = num % 10;
			temp = (rem%2 == 0)?((evensum = evensum+rem)):((oddsum = oddsum + rem));

			num = num/10;
			rem = num%10;
			temp = (rem % 2==0)?((evensum = evensum + rem)):((oddsum = oddsum+rem));

			num = num/10;
			rem = num%10;
			temp = (rem%2 == 0)?((evensum = evensum+rem)):((oddsum = oddsum+rem));

			System.out.println(evensum);
			System.out.println(oddsum);			
		}

}