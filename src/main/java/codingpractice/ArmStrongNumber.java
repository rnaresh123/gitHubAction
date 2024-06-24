package codingpractice;

public class ArmStrongNumber {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5};
        int n = 5;
        System.out.println(average(a1, n));
        int a = 370;
        int b = 0;
        int c = a;
        while (a != 0) {
            int rem = a % 10;
            b = b + rem * rem * rem;
            a = a / 10;
        }
        if (b == c) {
            System.out.println("its arm strong number");
        } else {
            System.out.println("its not a armstrong number");
        }
        int num = 371;
        //boolean armStrongNumber = isArmStrongNumber(num);
//        if (armStrongNumber == true) {
//            System.out.println("its Arm strong number");
//        } else {
//            System.out.println("its not arm strong number");
//        }
    }

    static String average(int A[], int N) {
        int sum = 0;
        double avg = 0.00;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        avg = sum / N;
        return String.valueOf(avg);
    }
}
