import java.util.Scanner;

class CheckDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Digit: ");
		char ch = sc.next().charAt(0);

		String result = (ch>='0' && ch<= '9')?(ch+"is a DIGIT"):(ch+"is not a DIGIT");

		System.out.println(result);


	}


}