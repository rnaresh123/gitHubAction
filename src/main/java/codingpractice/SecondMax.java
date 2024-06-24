package codingpractice;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {23, 42, 54, 17, 89, 53, 94, 13};
        int firstmax = -1;
        int secondmax = -1;
        for (int d : arr) {
            if (firstmax < d) {
                secondmax = firstmax;
                firstmax = d;
            } else if (d > secondmax && d != firstmax) {
                secondmax = d;
            }

        }
        System.out.println(secondmax);

    }
}
