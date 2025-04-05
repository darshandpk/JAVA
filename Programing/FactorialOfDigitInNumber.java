import java.util.Scanner;

public class FactorialOfDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i /= 10) {
            int rem = i % 10;
            int fact = 1;
            for (int j = rem; j >= 1; j--) {
                fact *= j;
            }
            System.out.println("Factorial Of Digit " + rem + " is " + fact);
        }

    }
}
