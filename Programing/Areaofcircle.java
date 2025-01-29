import java.util.Scanner;

class Areaofcircle{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		final float pi = 22/7;
		System.out.println("Enter the Radius in cm: ");
		float r = sc.nextFloat();

		float sqr = r*r;
		float areaofcircle = pi*sqr;

		System.out.println("Area of Circle is "+ areaofcircle);


	}

}