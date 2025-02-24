import java.util.Scanner;

class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        String num = sc.next();

        if (num.charAt(0) == '0') {
            System.out.println(num + " is not a Duck NUmber.");
        } else {
            if (num.contains("0")) {
                System.out.println(num + " is a Duck Number.");
            } else {
                System.out.println(num + " is not a Duck Number.");
            }
        }
    }
}
