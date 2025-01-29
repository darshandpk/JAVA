import java.util.Scanner;

class BmiCalculator{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Weight in pound: ");
		double weight = sc.nextDouble();

		System.out.println("Enter the Height in inches: ");
		double height = sc.nextDouble();

		double weightkg = 0.45359237 * weight;
		
		double heightmeter = 0.0254 * height;


		double bmi = weightkg/(heightmeter*heightmeter);

		System.out.println("Your Body Mass Index is: "+ bmi);

	}


}