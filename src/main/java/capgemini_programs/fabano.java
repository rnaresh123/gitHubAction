package capgemini_programs;


class FibonacciSeries {
    public static void main(String[] args) {
        int count = 10; // Number of Fibonacci numbers to generate
        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci Series up to " + count + " terms:");

        // Print the first two terms separately
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        // Generate and print the rest of the terms
        for (int i = 3; i <= count; i++) {
            int nextTerm = num1 + num2;
            System.out.print(nextTerm + " ");
            num1 = num2;
            num2 = nextTerm;
        }
    }
}


