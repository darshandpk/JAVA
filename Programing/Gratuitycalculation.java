import java.util.Scanner;

class Gratuitycalculation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Subtotal: ");
		float subtotal = sc.nextFloat();

		System.out.println("Enter the Rate of Gratuity: ");
		float gratuityrate = sc.nextFloat();

		float gratuity = subtotal * (gratuityrate / 100);

		System.out.println("Total gratuity is : " + gratuity);

		float total = subtotal + gratuity;

		System.out.println("The tip is " + gratuity + "and total is " + total);

	}
}