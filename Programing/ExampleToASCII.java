class ExampleToASCII {
    public static void main(String[] args) {
        // For Printing the Values From 1 to 10;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // For Printing From A - Z
        // First way
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }

        // Second way
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i);
        }

        // For Printing From a - z

        // First way
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }

        // Second Way
        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i);
        }

        // For Printing From 0-9 digits
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println(ch);
        }

        // For Printing Whole ASCII Table
        for (int i = 1; i <= 127; i++) {
            System.out.println((char) i);
        }

    }
}