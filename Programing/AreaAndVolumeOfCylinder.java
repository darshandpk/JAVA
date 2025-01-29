import java.util.Scanner;
class AreaAndVolumeOfCylinder{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		final float pi = 3.142f;

		System.out.println("Enter the Radius Cylinder : ");
		float radius = sc.nextFloat();

		System.out.println("Enter the Height of Cylinder : ");
		float height = sc.nextFloat();


		float area = pi * (radius*radius);
		System.out.println("Area of Cylinder is : "+ area);

		float volume = area * height;
		System.out.println("Vloume of the Cylinder is : "+ volume);

	}

}