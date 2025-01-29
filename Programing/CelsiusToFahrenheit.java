import java.util.Scanner;
class CelsiusToFahrenheit{
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Celsius Degree: ");
		double celsius = sc.nextDouble();

		double fahrenheit = (9.0/5)*celsius + 32;

		System.out.println(celsius + " Celsius is "+ fahrenheit + " Fahrenheit.");

	}

}