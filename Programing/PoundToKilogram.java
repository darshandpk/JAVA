import java.util.Scanner;

class PoundToKilogram{
	public static void main(String[]args){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Pounds you want to Convert to the Kilogram: ");
		double pound = sc.nextDouble();
	
		double kilogram = pound * 0.454;

		System.out.println(pound + " pound is "+ kilogram + " Kilogram ");
	}

}