import java.util.Scanner;

class EmirpNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        if (isPrime(num) && reverse(num)) {
            System.out.println(num + " is an Emirp Number.");
        } else {
            System.out.println(num + " is Not Emirp Number.");
        }
    }

    public static boolean isPrime(int num) {
        for (int den = 2; den < num; den++) {
            if (num % den == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean reverse(int num) {
        int rev = 0;
        for (int i = num; i > 0; i /= 10) {
            int rem = i % 10;
            rev = rev * 10 + rem;
        }

        return isPrime(rev);
    }
}
