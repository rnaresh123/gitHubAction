package capgemini_programs;

public class SecondMax {

    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6, 7, 8, 9, 1};
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > firstmax) {
                secondmax = firstmax;
                firstmax = a[i];
            } else if (a[i] > secondmax && a[i] != firstmax) {
                secondmax = a[i];
            }
        }
        System.out.println("First Maximum: " + firstmax);
        System.out.println("Second Maximum: " + secondmax);
    }
}

