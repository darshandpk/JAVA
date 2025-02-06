import java.util.Scanner;

class OperatorExample3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character: ");

		char ch = sc.next().charAt(0);

		String result = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
				? ((ch >= 65 && ch <= 90) ? (ch + "is a UpperCase Alphabet") : (ch + "is a LowerCase Alphabet"))
				: ((ch >= 0 && ch <= 9) ? (ch + "is an Digit") : (ch + "is a Special Character"));

		System.out.println(ch);

	}

}