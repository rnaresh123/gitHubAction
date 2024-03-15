package codingpractice;

public class ButterflyPattern {

    public static void main(String[] args) {
        String str = "naresh";

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int space = 2 * n - 2 * i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");


            }
            int space = 2 * n - 2 * i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

