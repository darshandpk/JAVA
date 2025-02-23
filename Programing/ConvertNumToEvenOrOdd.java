import java.util.Scanner;

class ConvertNumToEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int dup = num;

        int cnt = 0;
        for (int i = num; i > 0; i /= 10) {
            cnt++;
        }

        String newnum = " ";

        if (cnt % 2 == 0) {
            for (int i = dup; i > 0; i /= 10) {
                int rem = i % 10;
                if (rem % 2 != 0) {
                    newnum = ++rem + newnum;
                } else {
                    newnum = rem + newnum;
                }
            }
        } else {
            for (int i = dup; i > 0; i++) {
                int rem = i % 10;
                if (rem % 2 == 0) {
                    newnum = ++rem + newnum;
                } else {
                    newnum = rem + newnum;
                }
            }

        }
        System.out.println("Converted Number is : " + newnum);
    }
}
