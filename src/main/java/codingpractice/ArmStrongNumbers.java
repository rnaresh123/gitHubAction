package codingpractice;

public class ArmStrongNumbers {
    public static void main(String[] args) {
        int n = 0;
        int rem = 0;
        int a = 0;
        for (int i = 0; i < 1000; i++) {
            n = i;
            while (n != 0) {
                rem = n % 10;
                a = a + rem * rem * rem;
                n = n / 10;
            }


            if (a == i) {
                System.out.print(i + " ");
            }
            a = 0;
        }
    }
}
