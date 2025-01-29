import java.util.Scanner;
class Calculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Number: ");
		float num1 = sc.nextFloat();

		System.out.println("Enter Second Number: ");
		float num2 = sc.nextFloat();

		System.out.println("Enter the Operator: ");
		char op = sc.next().charAt(0);
		
		
		float result = 0;

		result = (op == '+')?num1 + num2:
		     (op == '-')?num1 - num2:
		     (op == '*')?num1 * num2:
		     (op == '/')?num1 / num2:
		     (op == '%')?num1 % num2:0.000001f;

		String output= num1+" "+op+" "+num2+" = "+result;
	
		if(!(result == 0.000001f)){
			System.out.println(output);
		}

	}


}