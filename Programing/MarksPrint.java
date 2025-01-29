import java.util.Scanner;

class MarksPrint{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Marks you Have Obtained: ");
		double marks = sc.nextDouble();


		double percentage = (marks/600)*100;

		String op = 	(percentage>=75)?"Grade A with"+percentage+"%":
				(percentage>=60)?"Grade B with"+percentage+"%":
				(percentage>=35)?"Grade C with"+percentage+"%":
				"Your Failed In Examination. Try Next Time";

		System.out.println(op);
	}

}