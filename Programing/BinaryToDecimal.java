import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary Number: ");
        String binarynum = sc.next();

        int decimalnum = Integer.parseInt(binarynum, 2);
        System.out.println("Decimal Number is : " + decimalnum);
    }

}
