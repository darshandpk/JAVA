import java.util.Scanner;

class VowelConsonents{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);

		String result = (ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')?(ch+"is a Vowel"):(ch+"is a Consonent");

		System.out.println(result);


	}


}